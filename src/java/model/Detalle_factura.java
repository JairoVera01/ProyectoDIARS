/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jairo
 */
public class Detalle_factura {
    private int id;
    private int tipo_pago_id;
    private int factura_id;
    private int ruc;
    private int gravada;
    private int igv;

    public Detalle_factura() {
    }

    public Detalle_factura(int id, int tipo_pago_id, int factura_id, int ruc, int gravada, int igv) {
        this.id = id;
        this.tipo_pago_id = tipo_pago_id;
        this.factura_id = factura_id;
        this.ruc = ruc;
        this.gravada = gravada;
        this.igv = igv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public int getFactura_id() {
        return factura_id;
    }

    public void setFactura_id(int factura_id) {
        this.factura_id = factura_id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public int getGravada() {
        return gravada;
    }

    public void setGravada(int gravada) {
        this.gravada = gravada;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }
    
    
}
