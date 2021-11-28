package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProductoValidar implements Validator{
    @Override
    public boolean supports(Class<?> type) {
        return Producto.class.isAssignableFrom(type);
    }
    @Override
    //Validamos que los campos no esten vacios
    public void validate(Object o, Errors errors){
        Producto producto = (Producto)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"nombre",
                "required.nombre","ERROR:El campo nombre es obligatorio!!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"descripcion",
                "required.descripcion","ERROR:El campo descripcion es obligatorio!!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"precio",
                "required.precio","ERROR:El campo precio es obligatorio!!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"categoria_id",
                "required.categoria_id","ERROR:El campo categoria_id es obligatorio!!"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"url_imagen",
                "required.url_imagen","ERROR:El campo url_imagen es obligatorio!!"); 
}
}
