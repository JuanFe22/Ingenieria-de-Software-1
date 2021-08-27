/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Felipe Herrera Cardona
 */
public class conexionDB {
    Connection connection;

    public conexionDB() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_ingsoft_db1", "root", "");
            if(connection!= null)
                System.out.println("Conexión exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        } 
    }
    
    public Connection getConnection(){
        return connection;
    }
}