package mx.com.redhat.consulting.coppel.poc;

import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyStore;

import javax.crypto.Cipher;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelCipherProcessor implements Processor, Service {
	private Key key;
	
	private String keystoreFilename;
	private String storePassword;
    private String aliasPrivateKey;
    private String privateKeyPassword;
    private boolean encrypt;
    
    private boolean init;
    
    private static final Logger LOG = LoggerFactory.getLogger(CoppelCipherProcessor.class);
	
	public CoppelCipherProcessor() {
	}

	@Override
	public void process(Exchange exchange) throws Exception {
		if(encrypt) {
			exchange.getOut().setBody(this.encrypt(exchange.getIn().getBody(String.class)));
		} else {
			byte[] bytes = (byte[]) exchange.getIn().getBody(byte[].class);
			exchange.getOut().setBody(this.decrypt(bytes));			
		}
	}

	public byte[] encrypt(String text) {
		byte[] cipherText = null;
		try {
			final Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			cipherText = cipher.doFinal(text.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOG.info("Cifrando: " + text);
		LOG.info("Resultado: ");
		printByteArray(cipherText);
		return cipherText;
	}
	
	public String decrypt(byte[] text) {
		byte[] dectyptedText = null;
		try {
			final Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			dectyptedText = cipher.doFinal(text);
			LOG.info("Descifrando: ");
			printByteArray(text);
			LOG.info("Resultado: \n" + new String(dectyptedText));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new String(dectyptedText);
	}
	
	private void printByteArray(byte[] text) {
		StringBuilder builder= new StringBuilder(text.length);
		for(int a=0;a<text.length;a++) {
			builder.append(text[a]);
		}
		LOG.info(builder.toString());
	}

	public String getKeystoreFilename() {
		return keystoreFilename;
	}

	public void setKeystoreFilename(String keystoreFilename) {
		this.keystoreFilename = keystoreFilename;
	}

	public String getStorePassword() {
		return storePassword;
	}

	public void setStorePassword(String storePassword) {
		this.storePassword = storePassword;
	}

	public String getAliasPrivateKey() {
		return aliasPrivateKey;
	}

	public void setAliasPrivateKey(String aliasPrivateKey) {
		this.aliasPrivateKey = aliasPrivateKey;
	}

	public String getPrivateKeyPassword() {
		return privateKeyPassword;
	}

	public void setPrivateKeyPassword(String privateKeyPassword) {
		this.privateKeyPassword = privateKeyPassword;
	}

	public boolean isEncrypt() {
		return encrypt;
	}

	public void setEncrypt(boolean encrypt) {
		this.encrypt = encrypt;
	}

	@Override
	public void start() throws Exception {
		try {
			if(!init) {
				FileInputStream fInSucursal = new FileInputStream(keystoreFilename);
				LOG.info("Iniciando Cipher processor");
				KeyStore keystore = KeyStore.getInstance("jceks");
				keystore.load(fInSucursal, storePassword.toCharArray());
			    key = keystore.getKey(aliasPrivateKey,privateKeyPassword.toCharArray());
			    init = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() throws Exception {
		LOG.info("Deteniendo Cipher processor");		
	}
}
