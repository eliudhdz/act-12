/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg12e;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author aeliu
 */
public class create {
    String numero;
    String nombre;
    addressbook agentel=new addressbook();
  
public void crear(){
  HashMap<String,String>calendario=agentel.inicio();
  Scanner teclado = new Scanner(System.in);
  System.out.println("Ingresa numero de telefono de la persona");
  numero=teclado.nextLine();
  System.out.println("Ingresa el nombre de la persona asociada a este numero telefonico");
  nombre= teclado.nextLine();
  calendario.put( numero , nombre);

}


}
