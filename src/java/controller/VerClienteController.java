/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jairo
 */
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Cliente;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jairo
 */
public class VerClienteController {

    private JdbcTemplate jdbcTemplate;

    //Controaldor VER
    public VerClienteController() {
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
    }

    //Se hace peticion de los datos con GET 
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente datosCliente = this.selectCliente(id);

        mav.setViewName("verCliente");
        mav.addObject("cliente", new Cliente(id, datosCliente.getNombre_cliente(), datosCliente.getApellido_cliente(), datosCliente.getDni_cliente(), datosCliente.getDireccion_id(), datosCliente.getTelefono_cliente(), datosCliente.getEstado_cliente()));
        return mav;
    }

    //Se estructura el modelo PERSONA
    @ModelAttribute("cliente")
    public Cliente datosCliente(HttpServletRequest request) {
        Cliente clienteSeleccionada = new Cliente();
        int id = Integer.parseInt(request.getParameter("id"));
        clienteSeleccionada = selectCliente(id);
        return clienteSeleccionada;
    }

    //SETEAMOS LOS DATOSS OBTENIDOS - VER CONTROLLER
    private Cliente selectCliente(int id) {
        final Cliente cliente = new Cliente();
        String sql = "select *from tbl_cliente where id='" + id + "'";
        return (Cliente) jdbcTemplate.query(sql, new ResultSetExtractor<Cliente>() {
            public Cliente extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    cliente.setNombre_cliente(rs.getString("nombre_cliente"));
                    cliente.setApellido_cliente(rs.getString("apellido_cliente"));
                    cliente.setDni_cliente(rs.getInt("dni_cliente"));
                    cliente.setDireccion_id(rs.getInt("direccion_id"));
                    cliente.setTelefono_cliente(rs.getInt("telefono_cliente"));
                    cliente.setEstado_cliente(rs.getInt("estado_cliente"));
                }
                return cliente;
            }
        });
    }
} 
