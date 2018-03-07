/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.File;
/**
 *
 * @author GHCM-T430-01
 */
public class ClaseFile {
    
    public String listFiles(String path){
        File file = new File(path);
        
        
        String auxText="";
		// si fuera un directorio, para saber los arhivos que contiene
		for (String string : file.list())
                {
                    
                    System.out.println(string);
                    auxText=auxText+string+"\n";
                }
			
                return auxText;
                        
        
    }
    
    
}
