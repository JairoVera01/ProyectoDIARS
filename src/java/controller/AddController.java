/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Conectar;
import model.Producto;
import model.ProductoValidar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
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

@Controller
@RequestMapping("addProducto.htm")
public class AddController {
    private JdbcTemplate jdbcTemplate;
    private ProductoValidar productoValidar;
    
        public AddController(){
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
        this.productoValidar = new ProductoValidar();
        
    }
    //Peticion de datos
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("addProducto");
        mav.addObject("producto",new Producto());
        return mav;
    }
    
    //Estructura de producto
    @ModelAttribute("producto")
    public Producto producto(){
        Producto producto = new Producto();
        return producto;
    }
    
    //Peticion de datos Persona
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("producto") Producto producto,
        BindingResult result, SessionStatus status){    
        this.productoValidar.validate(producto, result);
        if(result.hasErrors()){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("addProducto");
            mav.addObject("producto",new Producto());
            return mav;
        }else{
            this.jdbcTemplate.update("insert into tbl_producto(nombre,descripcion"
                +",precio,categoria_id,url_imagen) values(?,?,?,?,?)",
                    producto.getNombre(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    producto.getCategoria_id(),
                    producto.getUrl_imagen());       
            return new ModelAndView("redirect://home.htm");
        }
    }
    
    
    
}
