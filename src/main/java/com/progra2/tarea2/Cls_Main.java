package com.progra2.tarea2;

import com.progra2.debil.Cls_debil;
import com.progra2.fuerte.Cls_fuerte;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cls_Main 
{  
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        try
        {
            Cls_debil debil = new Cls_debil();
            Cls_fuerte fuerte = new Cls_fuerte();
            int eleccion;    
            String palabra, palabra2;   
            
            System.out.println("Ingrese una palabra: ");
            palabra = teclado.nextLine(); 
            
            System.out.println("Seleccione el tipo Codificacion/Descodificacion");
            System.out.println("1. Codificacion Debil");
            System.out.println("2. Descodificacion Debil");
            System.out.println("3. Codificacion Fuerte");
            System.out.println("4. Descodificacion Fuerte");
            eleccion = teclado.nextInt();  
            
            switch(eleccion)
                {
                    case 1: 
                         palabra2 = debil.Codifica(palabra, 3);
                        System.out.println("Codificado: "+palabra2.toLowerCase());
                        break;

                    case 2 : 
                        palabra2 = debil.Descodifica(palabra, 3);
                        System.out.println("Descodificado: "+palabra2.toLowerCase());                 
                        break;
                    case 3:
                        palabra2 = fuerte.Codifica_fuerte(palabra);
                        System.out.println("Codificao Fuerte: "+palabra2.toLowerCase());
                        break;
                    case 4:
                        palabra2 = fuerte.Descodifica_fuerte(palabra);
                        System.out.println("Descodificado Fuerte: "+palabra2.toLowerCase());
                        break;

                    default:
                        System.out.println("Seleccion incorrecta");
                        break;        
                }
           
        }
        catch(Exception x)
        {
            System.out.println("Hubo un error");
        }
    }  
}
