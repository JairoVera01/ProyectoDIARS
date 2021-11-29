<%-- 
    Document   : editClientes
    Created on : 28/11/2021, 12:06:40 AM
    Author     : jairo
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Polleria - Editar Clientes</title>
    </head>
    <body>
        <div class="container-md">
            <br>
          
            <form:form method="post" commandName="cliente" modelAttribute="cliente">
                <form:errors path="*" element ="div" cssClass="alert alert-danger"></form:errors>
                <h1 class="text-center text-muted"><u>EDITAR CLIENTES</u></h1>
                <hr>
                <p>
                <form:label path="nombre_cliente">Nombre: </form:label>
                <form:input path="nombre_cliente" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="apellido_cliente">Apellido: </form:label> 
                <form:input path="apellido_cliente" cssClass="form-control"></form:input>                    
                </p>
                <p>
                <form:label path="dni_cliente">DNI: </form:label>
                <form:input path="dni_cliente" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="direccion_id">Direccion ID: </form:label>
                <form:input path="direccion_id" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="telefono_cliente">Telefono: </form:label>
                <form:input path="telefono_cliente" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="estado_cliente">Estado Cliente: </form:label>
                <form:input path="estado_cliente" cssClass="form-control"></form:input>
                </p>
                <br>
                <hr>
                <p>
                    <input type="submit" value="Actualizar producto" class="btn btn-dark">
                </p>
            </form:form>    
        </div>
    </body>
</html>