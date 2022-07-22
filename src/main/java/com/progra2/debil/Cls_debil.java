package com.progra2.debil;


/**
 *
 * @author ASUS
 */
public class Cls_debil 
{
     public String Codifica(String palabra, int llave) {
       
        int codificar;
        String Resultado = "";

        if(palabra.length() <= 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar + llave;
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        if(palabra.length() > 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar - llave;
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        return Resultado;
    }
    
    
    public String Descodifica(String palabra, int llave) 
    {
        int codificar;
        String Resultado = "";
        
        if(palabra.length() <= 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar - llave;
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        if(palabra.length() > 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar + llave;
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        return Resultado;
    }
    
    
}
