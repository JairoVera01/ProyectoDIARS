/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author jairo
 */
public class ClienteMapper implements RowMapper<Cliente> {

     public ClienteMapper() {
    }
    @Override
    public Cliente mapRow(ResultSet rs, int i) throws SQLException {
        return new Cliente(rs.getInt("id"),
        rs.getString("nombre_cliente"),rs.getString("apellido_cliente"),rs.getInt("dni_cliente"),
        rs.getInt("direccion_id"),rs.getInt("telefono_cliente"),rs.getInt("estado_cliente"));        
    }
    
}
