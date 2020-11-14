/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg12e;
//import java.util.HashMap;
import java.util.HashMap;


/**
 *
 * @author aeliu
 */
public class list {
addressbook calendario1=new addressbook();


public void lista(){
HashMap<String,String>agentel=calendario1.inicio();  
System.out.println("Existen en total: "+agentel.size()+ " contactos y son los siguientes:");
for(HashMap.Entry <String,String>entry:agentel.entrySet()){
System.out.println("Numero: "+entry.getKey()+" Nombre: "+entry.getValue());}

}
}
