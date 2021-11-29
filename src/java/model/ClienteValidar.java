package model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ClienteValidar implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Producto.class.isAssignableFrom(type);
    }

    @Override
    //Validamos que los campos no esten vacios
    public void validate(Object o, Errors errors) {
        Cliente cliente = (Cliente) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre_cliente",
                "required.nombre_cliente", "ERROR:El campo nombre es obligatorio!!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellido_cliente",
                "required.apellido_cliente", "ERROR:El campo descripcion es obligatorio!!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dni_cliente",
                "required.dni_cliente", "ERROR:El campo precio es obligatorio!!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direccion_id",
                "required.direccion_id", "ERROR:El campo categoria_id es obligatorio!!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono_cliente",
                "required.telefono_cliente", "ERROR:El campo url_imagen es obligatorio!!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estado_cliente",
                "required.estado_cliente", "ERROR:El campo url_imagen es obligatorio!!");
    }
}
