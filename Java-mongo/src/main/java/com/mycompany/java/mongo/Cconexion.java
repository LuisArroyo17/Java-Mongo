
package com.mycompany.java.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Cconexion {
    public MongoClient crarConexion(){
        MongoClient mongo = null;
        try {
            String connectionString = "mongodb+srv://luisarroyo3:PIreS5FLy1GsrRd4@java-mongodb.kfe6am9.mongodb.net/";
            mongo= new MongoClient(new MongoClientURI(connectionString));
            List<String> NombresBaseDeDatos = mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se conectó correctamente, lista: "+ NombresBaseDeDatos);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "no se pudo conectar");
        }
      return mongo;
    }
    
}
