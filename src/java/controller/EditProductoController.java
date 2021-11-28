/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Producto;
import model.ProductoValidar;
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
public class EditProductoController {
    private JdbcTemplate jdbcTemplate;
    ProductoValidar productoValidar;
    
    public EditProductoController(){
        this.productoValidar = new ProductoValidar();
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id=Integer.parseInt(request.getParameter("id"));
        Producto datos = this.selectProducto(id);
        //devuelve en un objeto de la clase Persona los datos del registro cuyo id
        //hay elegido el usuario para editar
        mav.setViewName("editProducto");
        mav.addObject("producto", new Producto(id,datos.getNombre(),datos.getDescripcion(),datos.getPrecio(),datos.getCategoria_id(),datos.getUrl_imagen()));
        return mav;
    }

    @ModelAttribute("producto")
    public Producto datosPersonas(HttpServletRequest request){
        Producto productoSeleccionada = new Producto();
        int id = Integer.parseInt(request.getParameter("id"));
        productoSeleccionada = selectProducto(id);
        return productoSeleccionada;
    }
    
    private Producto selectProducto(int id) {
        //devuelve en un objeto producto los valores correspondientes al registro
        //cuyo id se pasa como parámetro
        final Producto producto = new Producto();
        String sql = "select * from tbl_producto where id='" + id + "'";
                    // select * from tbl_persona where id = '14'
        return (Producto) jdbcTemplate.query(sql,new ResultSetExtractor<Producto>(){
           public Producto extractData(ResultSet rs) throws SQLException, 
                   DataAccessException{
               if(rs.next()){
                   producto.setNombre(rs.getString("nombre"));
                   producto.setDescripcion(rs.getString("descripcion"));
                   producto.setPrecio(rs.getInt("precio"));
                   producto.setCategoria_id(rs.getInt("categoria_id"));
                   producto.setUrl_imagen(rs.getString("url_imagen"));
               }
            return producto;
           }
        });
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("producto") Producto producto,
            BindingResult result, SessionStatus status,HttpServletRequest request){
        this.productoValidar.validate(producto,result);
        if(result.hasErrors()){
            ModelAndView mav = new ModelAndView();
            int id = Integer.parseInt(request.getParameter("id"));
            Producto datos = this.selectProducto(id);
            mav.setViewName("editProducto");
            mav.addObject("producto", new Producto(id,datos.getNombre(),datos.getDescripcion(),datos.getPrecio(),datos.getCategoria_id(),datos.getUrl_imagen()));
            return mav;
        }else{
            int id=Integer.parseInt(request.getParameter("id"));
            this.jdbcTemplate.update("update tbl_producto set nombre=?,descripcion=?,precio=?,categoria_id=?,url_imagen=?"
                    + "where id=?",producto.getNombre(), producto.getDescripcion(),producto.getPrecio(),producto.getCategoria_id(),producto.getUrl_imagen(), id);
            return new ModelAndView("redirect:/listarProducto.htm");
        }
    }
    
}


