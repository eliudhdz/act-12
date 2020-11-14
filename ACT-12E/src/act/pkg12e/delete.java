/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg12e;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author aeliu
 */
public class delete {
    String numero;
    addressbook registro=new addressbook();
    
    
    public void eliminar(){
  HashMap<String,String>agentel=registro.inicio();      
  Scanner teclado = new Scanner(System.in);
  System.out.println("escribe el numero de la persona a borrar ");
  numero=teclado.nextLine();
  if (agentel.containsKey(numero)){
  System.out.println("se logro eliminar el contacto seleccionado");
  agentel.remove(numero); 
  }
  else{
  agentel.remove(numero);
  System.out.println("no se logro eliminar el contacto seleccionado");
  }
  
  }
  
 
}

