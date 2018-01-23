/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author GHCM-T430-01
 */
public class Leer {
  /**
   * Funcion que lee archivo
   * Recibe la ruta y el nombre del archivo
   * @param arg 
   */  
    public String LectorArchivo(String ruta){
        String texto="";
        String auxText="";
        int contLineas=0;
            try
                {
                //Creamos un archivo FileReader que obtiene lo que tenga el archivo
                FileReader lector=new FileReader(ruta);
                //El contenido de lector se guarda en un BufferedReder
                BufferedReader contenido=new BufferedReader(lector);
                //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                while((texto=contenido.readLine())!=null)
                    {
                    System.out.println("-->"+texto);
                    auxText=auxText+texto+"\n";
                    contLineas++;
                    }
                    System.out.println("final: "+auxText);
                    System.out.println("Lineas: "+contLineas);
                    return auxText; 
                    
                }
                catch(Exception e)
                        {
                            return auxText=e.getMessage(); 

                        }
                      
                    } 
    
    
    public Integer cuentaLineas(String ruta){
        String texto="";
        String auxText="";
        int contLineas=0;
            try
                {
                //Creamos un archivo FileReader que obtiene lo que tenga el archivo
                FileReader lector=new FileReader(ruta);
                //El contenido de lector se guarda en un BufferedReder
                BufferedReader contenido=new BufferedReader(lector);
                //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                while((texto=contenido.readLine())!=null)
                    {
                    System.out.println("-->"+texto);
                    auxText=auxText+texto+"\n";
                    contLineas++;
                    }
                    System.out.println("final: "+auxText);
                    System.out.println("Lineas: "+contLineas);
                    return contLineas; 
                    
                }
                catch(Exception e)
                        {
                            return -1; 

                        }
                      
                    } 
}
