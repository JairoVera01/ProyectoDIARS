/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Conectar;
import model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author jairo
 */

public class HomeClienteController {
   
    private JdbcTemplate jdbcTemplate;
    public HomeClienteController(){
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
        
    }
    //Estructura de la vista Home
    @RequestMapping("homeCliente.htm")
    public ModelAndView cliente(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("homeCliente");
        return mav;
    }       
    //Se consiguen los datos de PRODUCTO por consulta sql : "select * from tbl_persona
    @ModelAttribute("datosCliente")
    public List<Cliente> datosCliente(){
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        String sql = "select * from tbl_cliente";
        listaCliente = jdbcTemplate.query(sql,new ClienteMapper());
        return listaCliente;
    }
}
