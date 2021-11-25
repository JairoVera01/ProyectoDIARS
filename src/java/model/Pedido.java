/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author jairo
 */
public class Pedido {
    private int id;
    private int tipo_pedido_id;
    private int cliente_id;
    private int precio_productos;
    private int precio_delivery;
    private int precio_final;
    private Timestamp fecha;

    public Pedido() {
    }

    public Pedido(int id, int tipo_pedido_id, int cliente_id, int precio_productos, int precio_delivery, int precio_final, Timestamp fecha) {
        this.id = id;
        this.tipo_pedido_id = tipo_pedido_id;
        this.cliente_id = cliente_id;
        this.precio_productos = precio_productos;
        this.precio_delivery = precio_delivery;
        this.precio_final = precio_final;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_pedido_id() {
        return tipo_pedido_id;
    }

    public void setTipo_pedido_id(int tipo_pedido_id) {
        this.tipo_pedido_id = tipo_pedido_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getPrecio_productos() {
        return precio_productos;
    }

    public void setPrecio_productos(int precio_productos) {
        this.precio_productos = precio_productos;
    }

    public int getPrecio_delivery() {
        return precio_delivery;
    }

    public void setPrecio_delivery(int precio_delivery) {
        this.precio_delivery = precio_delivery;
    }

    public int getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(int precio_final) {
        this.precio_final = precio_final;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
    
}
