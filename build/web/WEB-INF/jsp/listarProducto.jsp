<%-- 
    Document   : listarProducto
    Created on : 24/11/2021, 09:39:45 PM
    Author     : jairo
--%>
<!-- Listar productos TBL_PRODUCTO -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png">
        <title>Polleria - Listas Prodcutos</title>
    </head>
    <body>
        <br>
        <h1 class="text-center text-muted"><u>LISTADO DE PRODUCTOS</u></h1>
        
        <div class="container-md">
        <p>
            <a href="<c:url value ="home.htm"></c:url>"class="btn btn-dark">
            Regresar</a>
            <a href="<c:url value ="addProducto.htm"></c:url>"class="btn btn-dark">
            Crear nuevo producto</a>
            <hr>
        </p>
        
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Precio</th>               
                <th>Opciones</th>
            </thead>
            <tbody>
                 <c:forEach items="${datosProducto}" var="dato">
                    <tr>
                        <td><c:out value="${dato.id}"></c:out></td>
                        <td><c:out value="${dato.nombre}"></c:out></td>
                        <td><c:out value="${dato.descripcion}"></c:out></td>
                        <td><c:out value="S/.${dato.precio}"></c:out></td>
    
                        <td><a href="verProducto.htm?id=${dato.id}" class="btn btn-dark">Ver</a>
                            <a href="editProducto.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                            <a href="deleteProducto.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                        </td>
                    </tr>                    
                </c:forEach>
            </tbody>
        </table>
        <hr>
        </div>
    </body>
</html>
