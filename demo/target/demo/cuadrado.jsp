<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Figuras Geométricas</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/estilos.css'>
    <script src='main.js'></script>
</head>
<body>
    <h1>Cuadrado</h1>
    <form action="servlet" method="post">
        <label>Lado</label>
        <input type="text" name="lado">
        <button type="submit" name="control" value="areacu">Enviar</button>
    </form>
    
</body>
</html>
