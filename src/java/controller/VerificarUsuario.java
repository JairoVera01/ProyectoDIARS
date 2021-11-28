/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Usuario;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author cesar
 */
public class VerificarUsuario implements Validator{
    
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    @Override
    public boolean supports(Class<?> type) {
        return Usuario.class.isAssignableFrom(type);
    }
    /*VALIDAR LOS INPUT Y LOS TEXTAREA*/
    @Override
    public void validate(Object o, Errors errors) {
        Usuario login = (Usuario)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","required.username", "Error: El campo username es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","required.password", "Error: El campo password es obligatorio");
        if(!(login.getUsername()!=null && login.getUsername().isEmpty())){
            this.pattern=pattern.compile(EMAIL_PATTERN);
            this.matcher=pattern.matcher(login.getUsername());
            if(!matcher.matches()){
                errors.rejectValue("username", "username.incorrect","Error: El correo no es valido");
            }
        }
    } 
}
