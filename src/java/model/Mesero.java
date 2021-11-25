/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jairo
 */
public class Mesero {
    private int id_mesero;
    private String nombre_mesero;
    private String apellido_mesero;
    private String turno;
    private String url_imagen_mesero;

    public Mesero() {
    }

    public Mesero(int id_mesero, String nombre_mesero, String apellido_mesero, String turno, String url_imagen_mesero) {
        this.id_mesero = id_mesero;
        this.nombre_mesero = nombre_mesero;
        this.apellido_mesero = apellido_mesero;
        this.turno = turno;
        this.url_imagen_mesero = url_imagen_mesero;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public String getNombre_mesero() {
        return nombre_mesero;
    }

    public void setNombre_mesero(String nombre_mesero) {
        this.nombre_mesero = nombre_mesero;
    }

    public String getApellido_mesero() {
        return apellido_mesero;
    }

    public void setApellido_mesero(String apellido_mesero) {
        this.apellido_mesero = apellido_mesero;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getUrl_imagen_mesero() {
        return url_imagen_mesero;
    }

    public void setUrl_imagen_mesero(String url_imagen_mesero) {
        this.url_imagen_mesero = url_imagen_mesero;
    }
   
}
