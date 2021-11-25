/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jairo
 */
public class Mesa {
    private int id;
    private int estado_mesa;
    private int cliente_id;
    private int mesero_id_mesero;

    public Mesa() {
    }

    public Mesa(int id, int estado_mesa, int cliente_id, int mesero_id_mesero) {
        this.id = id;
        this.estado_mesa = estado_mesa;
        this.cliente_id = cliente_id;
        this.mesero_id_mesero = mesero_id_mesero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado_mesa() {
        return estado_mesa;
    }

    public void setEstado_mesa(int estado_mesa) {
        this.estado_mesa = estado_mesa;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getMesero_id_mesero() {
        return mesero_id_mesero;
    }

    public void setMesero_id_mesero(int mesero_id_mesero) {
        this.mesero_id_mesero = mesero_id_mesero;
    }
    
    
}
