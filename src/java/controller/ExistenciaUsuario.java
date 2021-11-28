/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import model.Conectar;
import model.Usuario;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cesar
 */
@Controller
@RequestMapping("login.htm")
public class ExistenciaUsuario {
     private JdbcTemplate jdbcTemplate;
    private VerificarUsuario aux;
    
    public ExistenciaUsuario(){
        Conectar conectar = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
        this.aux = new VerificarUsuario();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("loginv", new Usuario());
        return mav;
    }
    
    @ModelAttribute("loginv")
    public Usuario loginv(){
        Usuario loginv = new Usuario();
        return loginv;
    }
    /*MUETSRA LOS DATOS DE LA TABLA*/
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("loginv") Usuario loginv,
            BindingResult result, SessionStatus status, HttpServletRequest request){
        this.aux.validate(loginv, result);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("login");
            mav.addObject("loginv", new Usuario());
            return mav;
        }else{
            String sql = "Select username, password from tbl_usuario where username='"+username+"' and password='"+password+"'";
            this.jdbcTemplate.query(sql, new ResultSetExtractor<Usuario>(){
            public Usuario extractData(ResultSet rs) throws SQLException,DataAccessException{
                if(rs.next()){
                    loginv.setUsername(rs.getString("username"));
                    loginv.setPassword(rs.getString("password"));
                }
                return loginv;
            }
            });
            if(loginv.getUsername()==username && loginv.getPassword()==password) return mav;
            else return new ModelAndView("redirect:/home.htm");
        }
    }
}
