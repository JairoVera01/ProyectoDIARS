<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Polleria</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
                <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/main.css" />
	</head>
	<body class="is-preload">
		<!-- Header -->
			<header id="header">
				<div class="inner">
                                    <a href="https://www.instagram.com/polleriaamerica/?hl=es" class="image avatar" target="_blank"><img src="${pageContext.request.contextPath}/resources/images/polleria_america_logo.png" alt="" /></a>
                                        <h1><strong><i>Somos Polleria y Parrilladas America</i></strong>,
                                         Un restaurante donde Ofrecemos deliciosos platos <br/>
					preparados con frescos ingredientes de la mejor calidad.<br/>
                                        Encuentranos en nuestras redes sociales como: <a href="https://www.instagram.com/polleriaamerica/?hl=es" target="_blank"><strong>Polleria - Parriladas America</strong></a>.</h1>
                                </div>
			</header>
		<!-- Main -->
			<div id="main">
				<!-- One -->
					<section id="one">
						<header class="major">
                                                    <h1>
                                                        Bienvenidos a Polleria - Parriladas America                                                       
                                                        
                                                        
                                                    </h1>
                                                    
                                                    
						</header>
						
					</section>
				<!-- Two -->
					<section id="two">
                                                <h3><u>Nuestros Clientes:</u></h3>
                                                <div class="row" >
                                                <c:forEach items="${datosCliente}" var="dato"> 
                                                    <article class="col-4 col-medium work-item">
                                                        <h3><i>Cliente N° ${dato.id}</i></h3>
                                                        <h3>    
                                                        <a href="verCliente.htm?id=${dato.id}" style="color: black">
                                                        Datos: ${dato.nombre_cliente} ${dato.apellido_cliente}
                                                        </a>
                                                        </h3>
							<p>DNI: ${dato.dni_cliente}</p>
                                                        <p>Celular: ${dato.telefono_cliente}</p>
                                                    </article> 
                                                    
                                                </c:forEach> 
                                                </div>
                                                <hr>
                                                <div style="width: 100%">
                                                    <ul class="actions">
                                                    <li><a href="listarCliente.htm" class="button">LISTAR CLIENTES</a></li>
                                                    <li><a href="addCliente.htm" class="button">AGREGAR CLIENTES</a></li>
                                                    
                                                    </ul>
                                                </div>
         					
                                                <hr>
                                                <div style="width: 100%">
                                                    <h4>Opciones:</h4>
                                                <ul class="actions">
						<li><a href="" class="button">CLIENTES</a></li>
                                                <li><a href="" class="button">MESAS DISPONIBLES</a></li>
                                                <li><a href="" class="button">MESEROS</a></li>
                                                <li><a href="" class="button">PEDIDOS</a></li>
						</ul>
                                                </div>
                                                
                                                <hr>
                                                <h4>
                                                    <u>Visitanos en:</u> 
                                                </h4>
                                                <p>
                                                    Av. Benavides 5197 · Surco<br>
                                                    Lun ~ Jue & Dom 12 pm - 11 pm<br>
                                                    Vie & Sab 12 pm - 12 am
                                                </p>
                                                <h4>
                                                    <u>Mapa de nuestro local:</u> 
                                                </h4>
                                                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3900.758493155385!2d-76.9837927!3d-12.1286698!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xcee1b2363af891b6!2sPollos%20Parrilladas%20Am%C3%A9rica!5e0!3m2!1ses-419!2spe!4v1637721793466!5m2!1ses-419!2spe" width="100%" height="400" style="border-radius: 20px;" allowfullscreen="" loading="lazy"></iframe>
                                                
                                                
					</section>
			</div>
		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<ul class="icons">
                                            <li><a href="https://www.instagram.com/polleriaamerica/?hl=es" target="_blank" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="https://wa.me/51989913836"  target="_blank" class="icon brands fa-whatsapp"><span class="label">WhatsApp</span></a></li>
						<li><a href="mailto:reserva@polleria-america.com" target="_blank" class="icon solid fa-envelope"><span class="label">Email</span></a></li>
                                                <li><a href="https://www.facebook.com/polleriaamerica"  target="_blank" class="icon brands fa-facebook-messenger"><span class="label">Facebook</span></a></li>
                                        </ul>                                                                
					<ul class="copyright">
						<li>&copy;Polleria - Parriladas America <b> Servicio de delivery</b></li>
					</ul>
                                    
				</div>
                            
			</footer>
		<!-- Scripts -->
			<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>
			<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.poptrox.min.js"></script>
			<script src="${pageContext.request.contextPath}/resources/assets/js/browser.min.js"></script>
			<script src="${pageContext.request.contextPath}/resources/assets/js/breakpoints.min.js"></script>
			<script src="${pageContext.request.contextPath}/resources/assets/js/util.js"></script>
			<script src="${pageContext.request.contextPath}/resources/assets/js/main.js"></script>
                   
	</body>
</html>
