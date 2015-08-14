package mx.com.redhat.consulting.coppel.poc.ws;


import org.apache.camel.Body;
import com.coppel.e03.*;


public class Enrich {    
    
    public Doc createCustomer(@Body String name) {
      Doc doc = new Doc();
   
      Contenido contenido = new Contenido();
      Datos datos = new Datos();

      datos.getAtributos().add("atributos");
      contenido.getDatos().add(datos);
      contenido.getNodos().add("nodos");
      doc.getContenidos().add(contenido);
       
       return doc;    
    }
}