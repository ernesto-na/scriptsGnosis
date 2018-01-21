/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author GHCM-T430-01
 */
public class Escribir {
    
   public void EscribeDoc ()
   {
       String saludo="Hola este es mi mensaje";
       try
            {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("C:\\Users\\GHCM-T430-01\\Desktop\\123.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir=new FileWriter(archivo,true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(saludo);

            //Cerramos la conexion
            escribir.close();
            }

//Si existe un problema al escribir cae aqui
            catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
   }
    
    
    
    
    public static void main(String []args)
{
        Escribir obj =new  Escribir();
        obj.EscribeDoc();
}
}
