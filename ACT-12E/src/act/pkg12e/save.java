/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg12e;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author aeliu
 */




public class save {
    addressbook guardar= new addressbook();
    
    public void archivar() throws IOException{
    HashMap<String, String> agentel = guardar.inicio();
    int cantidad = 30;

    FileWriter entrada;
    BufferedWriter salida;

    entrada = new FileWriter("contactos.txt");
    salida = new BufferedWriter(entrada);

    int count = 0;

    Iterator<HashMap.Entry<String, String>> it = agentel.entrySet().iterator();

    while (it.hasNext() && count < cantidad) {
        
    HashMap.Entry<String, String> pairs = it.next();

    salida.write( pairs.getKey() + "," + pairs.getValue() + "\n");
        count++;
    }
    salida.close();
    }  
    
}

