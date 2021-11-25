/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jairo
 */
public class Detalle_pedido {
    private int id;
    private int cantidad;
    private int producto_id;
    private int pedido_id;
    private int precio_unidad;
    private int sub_total;

    public Detalle_pedido() {
    }

    public Detalle_pedido(int id, int cantidad, int producto_id, int pedido_id, int precio_unidad, int sub_total) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto_id = producto_id;
        this.pedido_id = pedido_id;
        this.precio_unidad = precio_unidad;
        this.sub_total = sub_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getSub_total() {
        return sub_total;
    }

    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }
    
    
}
