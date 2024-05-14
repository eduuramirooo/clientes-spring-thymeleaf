/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swagify.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Conexion {
    String url = "jdbc:mysql://localhost:3306/swagify";
    String user = "root";
    String pass = "";
    Connection c;

    public Connection conectar() throws SQLException {
        c = DriverManager.getConnection(url, user, pass);
        return c;
    }
}

