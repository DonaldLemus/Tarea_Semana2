package com.progra2.fuerte;

/**
 *
 * @author ASUS
 */
public class Cls_fuerte 
{
    public String Codifica_fuerte(String palabra) 
    {
        int codificar;
        String Resultado = "";
        
        if(palabra.length() <= 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar + palabra.length();
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        if(palabra.length() > 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar - palabra.length();
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }  
        return Resultado;
    }
    
    
    public String Descodifica_fuerte(String palabra) 
    {
        int codificar;;
        String Resultado = "";
        
        if(palabra.length() <= 5);
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);;
                codificar = codificar - palabra.length();
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }
        if(palabra.length() > 5)
        {
            for (int x = 0; x < palabra.length(); x++)
            {
                codificar = (int) palabra.charAt(x);
                codificar = codificar + palabra.length();
                char caracter = (char) codificar;
                Resultado = Resultado + caracter;
            }
        }       
        return Resultado;
    }
}
