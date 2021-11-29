/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author jairo
 */
public class ListarClienteController {

    private JdbcTemplate jdbcTemplate;
    public ListarClienteController() {
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
    }

    //Estructura de la Vista
    @RequestMapping("listarCliente.htm")
    public ModelAndView listarCliente() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listarCliente");
        return mav;
    }

    //Se obtienen los datos de la base de datos por consulta  select * from tbl_cliente
    @ModelAttribute("datosCliente")
    public List<Cliente> datosCliente() {
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        String sql = "select * from tbl_cliente";
        listaCliente = jdbcTemplate.query(sql, new ClienteMapper());
        return listaCliente;
    }

}
