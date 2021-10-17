<%-- 
    Document   : index
    Created on : 16-10-2021, 19:54:45
    Author     : marcos oyarzo, gonzalo saavedra, aylin ledeza, carlos gaete
--%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="ModeloDAO.UsuarioDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <link href="dist/css/bootstrap-grid.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap-reboot.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-image: url(scss/fondo.jpg) " >
        <h1>LOGIN</h1>
        <br>        
        <br>
        <div class="container">
            <form action="Controlador">
                <div class="form-group text-center">
                <img src="img/login.png" height="80" width="80"/>
                <p><strong>Login</strong></p>
                </div>
                <div class="form-group">
                    <div class="container">
                    <label>Usuario:</label>
                    <input class="form-control" type="text" name="txtUsuario" placeholder="Ingrese nombre de usuario">
                    <label>Contraseña:</label>
                    <input class="form-control" type="password" name="txtPass">
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="login">
                    <!--<a class="btn btn-success btn-lg" href="Controlador?accion=login">Entrar</a>-->
                    </div>
                </div>    
            </form>
            
        </div>
        
    </body>
</html>