<%-- 
    Document   : editProducto
    Created on : 26/11/2021, 04:30:31 PM
    Author     : jairo
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Polleria - Editar Productos</title>
    </head>
    <body>
        <div class="container-md">
            <br>
          
            <form:form method="post" commandName="producto" modelAttribute="producto">
                <form:errors path="*" element ="div" cssClass="alert alert-danger"></form:errors>
                <h1 class="text-center text-muted"><u>EDITAR PRODUCTOS</u></h1>
                <hr>
                <p>
                <form:label path="nombre">Nombre: </form:label>
                <form:input path="nombre" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="descripcion">Descripcion: </form:label> 
                <form:input path="descripcion" cssClass="form-control"></form:input>                    
                </p>
                <p>
                <form:label path="precio">Precio: </form:label>
                <form:input path="precio" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="categoria_id">Categoria ID: </form:label>
                <form:input path="categoria_id" cssClass="form-control"></form:input>
                </p>
                <p>
                <form:label path="url_imagen">URL Imagen: </form:label>
                <form:input path="url_imagen" cssClass="form-control"></form:input>
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