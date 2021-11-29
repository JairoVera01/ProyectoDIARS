<%-- 
    Document   : listarClientes
    Created on : 28/11/2021, 12:05:23 PM
    Author     : jairo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png">
        <title>Polleria - Listas Clientes</title>
    </head>
    <body>
        <br>
        <h1 class="text-center text-muted"><u>LISTADO DE CLIENTES</u></h1>
        
        <div class="container-md">
        <p>
            <a href="<c:url value ="homeCliente.htm"></c:url>"class="btn btn-dark">
            Regresar</a>
            <a href="<c:url value ="addCliente.htm"></c:url>"class="btn btn-dark">
            Crear nuevo cliente</a>
            <hr>
        </p>
        
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>DNI</th>               
                <th>Telefono</th>
                <th>Estado</th>
            </thead>
            <tbody>
                 <c:forEach items="${datosCliente}" var="dato">
                    <tr>
                        <td><c:out value="${dato.id}"></c:out></td>
                        <td><c:out value="${dato.nombre_cliente}"></c:out></td>
                        <td><c:out value="${dato.apellido_cliente}"></c:out></td>
                        <td><c:out value="${dato.dni_cliente}"></c:out></td>
                        <td><c:out value="${dato.telefono_cliente}"></c:out></td>
                        <td><c:out value="${dato.estado_cliente}"></c:out></td>
                        <td><a href="verCliente.htm?id=${dato.id}" class="btn btn-dark">Ver</a>
                            <a href="editCliente.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                            <a href="deleteCliente.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                        </td>
                    </tr>                    
                </c:forEach>
            </tbody>
        </table>
        <hr>
        </div>
    </body>
</html>
