package mx.com.redhat.consulting.coppel.poc;

import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.Certificate;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;



public class SecurityDemo {
	static String message = "<mensaje90011request><cApellidoMaterno>TRUJILLO</cApellidoMaterno><cHuellaDerecha>IQBzAB8BKQEUAHMAJwE0AR4ArwDBAHUATgDXAAcBJAEUAL0AxQB1ABAA2QDzACcBCwBdANEAXQAEAG4AOQFUARQAmACJACIADgBmALcATAARAE8A2wA/ABMAgAA2AUcBIQB+AC0BHQEiAGEA0QAEAQUAgACxAEIAEgB/ABYBawAOALIAIgBlAQcAggAyAA4ACQCLACIBgwATANAASQBbAQMAawBhANIACACAAGQAGQAIAJgAcQARAAoA9QBkAEcBCQCEAHUAwQAKAKEACgGGAAMApAAHATYBBQCkAOkAHQENALEAiwCzABAAoACdAMQAGwDaAFYAogAIAPMAjgCGAAkAqgA/ALoABQAXAAAA/////////3YBAQMEBQQF/////////////////2tzdHV2AQMEBQcK//////////////9faXFydHV3AgQGCAsO/////////////1lkam1wc3YCBQgJDRAX//////////9YXmNmaW5ydQIGCQsPFRv//////////1VcYWRnbXF2AgcLDhIXHP//////////WF1fYWVrcHUCBwwQFhof//////////9QWV1fYmhudAIIDhIXGyD//////////1NZW11fYmlxAgoRFxsdIf//////////TlVXWFteZXIFEBgdICAi/////////0tKTVFTVFZfdAwZISQnJin/////////T0pGREhKSk4cGyElJyoqMP////////9LSEI7PT9APjcqKCorLS0w/////////0tLRT44OTk4NC8sLCssLTD//////////0hENzIzNDIvLS0tKicqL///////////S0Y2KysqKigpLCsrJCv///////////9IPy0qKSckIiMrLTQjN/////////////8+LiknJSIgICcsNzpD/////////////xYXHSMkIiAcJSk5QjAwMDAw</cHuellaDerecha>";
	
	public static void main(String[] args) throws Exception {
		try {
			
			String keystoreFile = "/home/zacatuche/proyectos/Coppel/security/baul.jck";

			FileInputStream fInCentral = new FileInputStream(keystoreFile);
			KeyStore keystoreCentral = KeyStore.getInstance("jceks");
			keystoreCentral.load(fInCentral, "hola123".toCharArray());

			 Key privateKey = keystoreCentral.getKey("llaveSimetricaCoppel", "hola123Simetrica".toCharArray());
			
	         Cipher cipher = Cipher.getInstance("AES");


	         cipher.init(Cipher.ENCRYPT_MODE, privateKey);
	         byte[] encrypted = cipher.doFinal(message.getBytes());
	         System.out.println(new String(encrypted));

	         cipher.init(Cipher.DECRYPT_MODE, privateKey);
	         String decrypted = new String(cipher.doFinal(encrypted));
	         System.out.println(decrypted);
	         
	         System.exit(0);
	         
//			String keystoreFilenameSucursal = "/home/zacatuche/proyectos/Coppel/security/baulSucursal.jck";
//	
//			char[] passwordSucursalBaul = "hola123Sucursal".toCharArray();
//			String aliasLlavePublica = "llaveCentral";
//	
//			FileInputStream fInSucursal = new FileInputStream(keystoreFilenameSucursal);
//			KeyStore keystoreSucursal = KeyStore.getInstance("jceks");
//			keystoreSucursal.load(fInSucursal, passwordSucursalBaul);
//	
//			Certificate cert = keystoreSucursal.getCertificate(aliasLlavePublica);
//			System.out.println(cert);
//			PublicKey key = cert.getPublicKey();
//			byte[] message = encrypt("<xml>nada</xml>", key);
//			
//			String keystoreFileCentral = "/home/zacatuche/proyectos/Coppel/security/baulCentral.jck";
//			char[] passwordCentralBaul = "hola123Central".toCharArray();
//			String aliasLlavePrivada="llaveCentral";
//			
//			FileInputStream fInCentral = new FileInputStream(keystoreFileCentral);
//			KeyStore keystoreCentral = KeyStore.getInstance("jceks");
//			keystoreCentral.load(fInCentral, passwordCentralBaul);
//			Key privateKey = keystoreCentral.getKey(aliasLlavePrivada, "hola123LlaveCentral".toCharArray());
//			
//			System.out.println(decrypt(message, privateKey));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] encrypt(String text, PublicKey key) {
		byte[] cipherText = null;
		try {
			final Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			cipherText = cipher.doFinal(text.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cipherText;
	}
	
	public static String decrypt(byte[] text, Key key) {
		byte[] dectyptedText = null;
		try {
			final Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, key);
			dectyptedText = cipher.doFinal(text);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new String(dectyptedText);
	}
}
