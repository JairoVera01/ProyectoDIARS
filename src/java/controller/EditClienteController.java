/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Cliente;
import model.ClienteValidar;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author jairo
 */
public class EditClienteController {
    private JdbcTemplate jdbcTemplate;
    ClienteValidar clienteValidar;
    
    public EditClienteController(){
        this.clienteValidar = new ClienteValidar();
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id=Integer.parseInt(request.getParameter("id"));
        Cliente datos = this.selectCliente(id);
        //devuelve en un objeto de la clase Persona los datos del registro cuyo id
        //hay elegido el usuario para editar
        mav.setViewName("editCliente");
        mav.addObject("cliente", new Cliente(id,datos.getNombre_cliente(),datos.getApellido_cliente(),datos.getDni_cliente(),datos.getDireccion_id(),datos.getTelefono_cliente(),datos.getEstado_cliente()));
        return mav;
    }

    @ModelAttribute("cliente")
    public Cliente datosCliente(HttpServletRequest request){
        Cliente productoSeleccionada = new Cliente();
        int id = Integer.parseInt(request.getParameter("id"));
        productoSeleccionada = selectCliente(id);
        return productoSeleccionada;
    }
    
    private Cliente selectCliente(int id) {
        //devuelve en un objeto producto los valores correspondientes al registro
        //cuyo id se pasa como parámetro
        final Cliente cliente = new Cliente();
        String sql = "select * from tbl_cliente where id='" + id + "'";
                    // select * from tbl_persona where id = '14'
        return (Cliente) jdbcTemplate.query(sql,new ResultSetExtractor<Cliente>(){
           public Cliente extractData(ResultSet rs) throws SQLException, 
                   DataAccessException{
               if(rs.next()){
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
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("cliente") Cliente cliente,
            BindingResult result, SessionStatus status,HttpServletRequest request){
        this.clienteValidar.validate(cliente,result);
        if(result.hasErrors()){
            ModelAndView mav = new ModelAndView();
            int id = Integer.parseInt(request.getParameter("id"));
            Cliente datos = this.selectCliente(id);
            mav.setViewName("editCliente");
            mav.addObject("cliente", new Cliente(id,datos.getNombre_cliente(),datos.getApellido_cliente(),datos.getDni_cliente(),datos.getDireccion_id(),datos.getTelefono_cliente(),datos.getEstado_cliente()));
            return mav;
        }else{
            int id=Integer.parseInt(request.getParameter("id"));
            this.jdbcTemplate.update("update tbl_cliente set nombre_cliente=?,apellido_cliente=?,dni_cliente=?,direccion_id=?,telefono_cliente=?,estado_cliente=?"
                    + "where id=?",cliente.getNombre_cliente(), cliente.getApellido_cliente(),cliente.getDni_cliente(),cliente.getDireccion_id(),cliente.getTelefono_cliente(),cliente.getEstado_cliente(), id);
            return new ModelAndView("redirect:/listarCliente.htm");
        }
    }
    
}

