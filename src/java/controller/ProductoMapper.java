/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Producto;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author jairo
 */
public class ProductoMapper implements RowMapper<Producto> {

     public ProductoMapper() {
    }
    @Override
    public Producto mapRow(ResultSet rs, int i) throws SQLException {
        return new Producto(rs.getInt("id"),
        rs.getString("nombre"), rs.getString("descripcion"), rs.getInt("precio"),
        rs.getInt("categoria_id"), rs.getString("url_imagen"));        
    }
    
}
