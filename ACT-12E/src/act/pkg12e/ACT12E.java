/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg12e;


import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author aeliu
 */
public class ACT12E {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        create c =new create();
        list l = new list();
        delete d =new delete();
        save s = new save();
        Scanner input = new Scanner(System.in);
        boolean cantidad = false;
        int opciones;
        
        while (!cantidad){
            
            System.out.println("Bienvenido al sitema de agenda,selecciona la opcion correcta");
            System.out.println("1: Ver el listado");
            System.out.println("2: Generar un contacto");
            System.out.println("3: Borrar contacto");
            System.out.println("4: para guardar los cambios");
                opciones = input.nextInt();
                
                switch (opciones){
                    case 1:
                    l.lista();                     
                    break;
                    case 2:
                    c.crear();
                    break;
                    case 3:
                    d.eliminar();
                    break;
                    case 4 :
                    s.archivar();
                    break;   
                }        
            }         
        }
    } 

  
   
   
    

    
    
    
   