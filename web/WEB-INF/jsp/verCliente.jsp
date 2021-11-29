<%-- 
    Document   : verCliente
    Created on : 28/11/2021, 12:32:02 AM
    Author     : jairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png">
        <title>Polleria - Ver : ${cliente.nombre_cliente}</title>
    </head>
    <body>
        <div class="container-md">
            <nav arial-label ="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item" aria-current="page">
                        <a href="listarProducto.htm">Listado Clientes</a>
                    </li>
                    <li class="breadcrumb-item" aria-current="page">
                        Datos de : 
                        ${cliente.nombre_cliente}
                    </li>
                </ol>

            </nav>
            <div class="container-md border border-primary p-1">
                <div class="row ">
                    <%--Imagen seccion del 30% --%> 
                    <article class="col-4 col-12-xsmall work-item">
                        <svg xmlns="http://www.w3.org/2000/svg" width="250" height="250" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                        <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                        <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                        </svg>				
                    </article> 

                    <%--Datos seccion del 70% --%> 
                    <article class="col-6 col-12-xsmall work-item">
                        <div clases="d-flex justify-content-around">
                            <h1> Cliente - Datos</h1>
                            <h2 class="text-secondary">Nombres y apellidos: ${cliente.nombre_cliente} ${cliente.apellido_cliente}</h2>                               
                        </div>           
                        <hr>
                        <h3 class="text-secondary"> DNI :${cliente.dni_cliente}  </h3>
                        <h3 class="text-secondary"> Celular: ${cliente.telefono_cliente}  </h3>
                        <hr>
                        <div class="d-flex justify-content-around">                                     
                            <!-- Pedido -->
                            <hr>
                        </div> 
                    </article> 
                </div>
            </div>
        </div>
    </body>
</html>