<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link rel="stylesheet" href="css/index.css" type="text/css"/>
    </head>
    <body>
        <header class="header">
            <img src="images/logo.png"/>
        </header>
        <main class="main"> 
            <div class="main-left">
                <img src="images/image.png" width="490px"/>
            </div>
            
            <div class="main-rigth">
                <fieldset>
                    <legend>Iniciar Sesion</legend>
                    <form class="main-rigthForm" action="/user" method="post">
                        <p>
                            <label for="usuario">Usuario:</label>
                            <input type="text" name="usuario" id="usuario" required/>
                        </p>
                        <p>
                            <label for="clave">Clave:</label>
                            <input type="password" name="clave" id="clave" required>
                        </p>
                        <p>
                            <input type="submit" value="Ingresar"> 
                        </p>
                    </form>     
                </fieldset>
            </div>
        </main>
    </body>
</html>
