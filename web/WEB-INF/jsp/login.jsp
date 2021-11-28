<%-- 
    Document   : login
    Created on : 28/11/2021, 12:28:26 AM
    Author     : cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/file/style_1.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/file/login.css"/>
        <title>INICIO</title>
    </head>
    <body>
        <nav  class="navbar navbar-light bg-light">
            <div style="transform: translateX(25%)" class="container-fluid" >
                <a  class="navbar-brand" href="#" style="align-content: center">
                    
                    <img  src="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png" style="align-items: start" class=" image avatar d-inline-block align-text-top">
                    <h1 style="display: inline-block; transform: translateY(150%)" >INICIO DE SESIÓN - POLLERIA AMERICA</h1>            
                </a>
            </div>
        </nav>
        
        <section class="vh-100 container-fluid">
            <div class="container-fluid h-custom">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div style="padding-top: 3.5rem" class="col-md-9 col-lg-6 col-xl-5">
                        
                        <iframe  class="embed-responsive-item" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3900.7514299711884!2d-76.98528298464807!3d-12.129152546742263!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105b87594e33983%3A0xcee1b2363af891b6!2sPollos%20Parrilladas%20Am%C3%A9rica!5e0!3m2!1ses-419!2spe!4v1638102349065!5m2!1ses-419!2spe"  width="720" height="480" style="border-radius: 25px;" allowfullscreen="" loading="lazy"></iframe>
                    </div>
                    <div class="login col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                        <form commandName="loginv" modelAttribute="loginv" method="post">
                            <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
                                <p class="lead fw-normal mb-0 me-3">Inicio de sesión</p>
                            </div>
                            
                            <hr style="margin-top: 25px; margin-bottom: 25px;">
                            <!-- Email input -->
                            <div class="form-outline mb-4">
                                <label class="form-label" for="username">Usuario</label>
                                <input type="text" id="username" name="username" class="input form-control form-control-lg"
                                       placeholder="Ingrese correo" />
                                
                            </div>

                            <!-- Password input -->
                            <div class="form-outline mb-3">
                                <label class="form-label" for="password">Contraseña</label>
                                <input type="password" id="password" name="password" data-type="password" class="input form-control form-control-lg"
                                       placeholder="Ingrese Contraseña" />
                                
                            </div>

                            <div class="d-flex justify-content-between align-items-center">
                                <!-- Checkbox -->
                                <div class="form-check mb-0">
                                    <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
                                    <label class="form-check-label" for="form2Example3">
                                        Recuerdame
                                    </label>
                                </div>
                                
                            </div>

                            <div class="text-center text-lg-start mt-4 pt-2">
                                <button type="submit" class="btn btn-dark btn-lg" name="btnIngresar"
                                        style="padding-left: 2.5rem; padding-right: 2.5rem;">INGRESAR</button>
                                
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
