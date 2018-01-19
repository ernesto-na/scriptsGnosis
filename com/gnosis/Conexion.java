/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnosis;

import java.sql.*;

/**
 *
 * @author GHCM-T430-01
 */
public class Conexion {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        
        String url = "jdbc:oracle:thin:@vmohsaemx001.oracleoutsourcing.com:10710:DAEMXI"; 
        Connection conexxion = DriverManager.getConnection(url,"APPS","D8aNH8ne");
        
        Statement statement = conexxion.createStatement();
        
        ResultSet resultSet = statement.executeQuery("select * from XXGAM_SAF_INV_MOV_MAN_TBL");
        
        while(resultSet.next()){
            
            System.out.println(resultSet.getString("OPERATING_UNIT")+resultSet.getString("rubro"));
        }
        
            System.out.println("Conectado");
                }catch(Exception e){
                    System.out.println("no conectado");
        e.printStackTrace();
        e.getMessage();
                    
                }//fin de try catch
    }//fin del main
    
}
