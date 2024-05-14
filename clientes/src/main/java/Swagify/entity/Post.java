/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swagify.entity;

/**
 *
 * @author Alumno
 */
public class Post {
    private int id;
    private int id_Usuario;
    private int id_Cancion;
    
    public Post() {
    }

    public Post(int id, int id_Usuario, int id_Cancion) {
        this.id = id;
        this.id_Usuario = id_Usuario;
        this.id_Cancion = id_Cancion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getId_Cancion() {
        return id_Cancion;
    }

    public void setId_Cancion(int id_Cancion) {
        this.id_Cancion = id_Cancion;
    }
    
}
