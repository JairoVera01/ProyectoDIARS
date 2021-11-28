package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Producto;
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
public class VerProductoController {
    private JdbcTemplate jdbcTemplate;
    //Controaldor VER
    public VerProductoController(){
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());                
    }
   
    //Se hace peticion de los datos con GET 
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();        
        int id = Integer.parseInt(request.getParameter("id"));
        Producto datosProducto = this.selectProducto(id);
        //Se establece un objeto persona para acceder a los datos
        mav.setViewName("verProducto");
        mav.addObject("producto",new Producto(id,datosProducto.getNombre(),datosProducto.getDescripcion(),
        datosProducto.getPrecio(),datosProducto.getCategoria_id(),datosProducto.getUrl_imagen())); 
        return mav;
    }
    //Se estructura el modelo PERSONA
    @ModelAttribute("producto")
    public Producto datosProducto(HttpServletRequest request){
        Producto productoSeleccionada = new Producto();
        int id = Integer.parseInt(request.getParameter("id"));
        productoSeleccionada = selectProducto(id);
        return productoSeleccionada;
    }
    
    //SETEAMOS LOS DATOSS OBTENIDOS - VER CONTROLLER
    private Producto selectProducto(int id) {
        final Producto producto = new Producto();
        String sql = "select *from tbl_producto where id='"+id+"'";
        return (Producto) jdbcTemplate.query(sql, new ResultSetExtractor<Producto>(){
            public Producto extractData(ResultSet rs) throws SQLException,DataAccessException{
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
}
    