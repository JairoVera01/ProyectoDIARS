/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Producto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author jairo
 */
public class ListarController {
 
    private JdbcTemplate jdbcTemplate;
       public ListarController(){
       Conectar conectar = new Conectar();
       this.jdbcTemplate = new JdbcTemplate(conectar.conectar());                
    }
    //Estructura de la Vista
    @RequestMapping("listarProducto.htm")
    public ModelAndView listarProducto(){
    ModelAndView mav = new ModelAndView();
    mav.setViewName("listarProducto");
    return mav;
    }
    //Se obtienen los datos de la base de datos por consulta  select * from tbl_persona
    @ModelAttribute("datosProducto")
    public List<Producto> datosProducto(){
    List<Producto> listaProducto = new ArrayList<Producto>();
    String sql = "select * from tbl_producto";
    listaProducto = jdbcTemplate.query(sql,new ProductoMapper());
    return listaProducto;
    }
    
}
