/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author GHCM-T430-01
 */
public class OpenFile {
    
    public void Abrelo()
    {
        JFileChooser selectorArchivos = new JFileChooser();
            selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

// indica cual fue la accion de usuario sobre el jfilechooser
           // int resultado = selectorArchivos.showOpenDialog(this);
          File f =   selectorArchivos.getSelectedFile();
          String nombre = f.getName();
          String path = f.getAbsolutePath();
            System.out.println(nombre);
            System.out.println(path);
            //System.out.println(resultado);
    }
    
    public static void main(String[] args) {
         
    }
}
