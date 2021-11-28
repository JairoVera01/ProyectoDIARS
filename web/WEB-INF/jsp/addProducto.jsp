<%-- 
    Document   : addProducto
    Created on : 26/11/2021, 03:05:57 PM
    Author     : jairo
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png">
        <title>Polleria - Agregar Productos</title>
    </head>
    <body>
        <div class="container-md">
            <nav aria-label ="breadcrumb">
                             
            </nav>
            <br>
            <form:form method="post" commandName="producto" modelAttribute="producto">
                <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                <h1 class="text-center text-muted" ><u>AGREGAR NUEVOS PRODUCTOS</u></h1>
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
                <form:label path="url_imagen">URL Imagen Producto: </form:label>
                <form:textarea path="url_imagen" cssClass="form-control"></form:textarea>
                </p>
               
                <hr>
                <p>
                <input type="submit" value="AGREGAR NUEVO PRODUCTO" class="btn btn-dark">
                </p>
            </form:form>
                <ol class="breadcrumb">
                    <li class="breadcrumb-item" aria-current="page">
                        <a href="listarProducto.htm" class=""> Listado de Productos</a>  
                    </li>
                    <li class="breadcrumb-item" aria-current="page"> 
                        <a href="#" class=""> Agregar Productos</a>
                    </li>
                </ol>   
        </div>
    </body>
</html>

