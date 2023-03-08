<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Peso Ideal</title>
</head>
<body>
    <form name="peso-ideal" action="calc" method="get">
        <label for="sexo">Sexo:</label>
        <select id="sexo" name="sexo">
            <option value="M">M</option>
            <option value="F">F</option>
        </select>
        <label for="altura">Altura(m)</label>
        <input type="text" name="altura" id="altura">
        <input type="submit" value="Calcular" name="calcular">
        <h1>Seu peso ideal é: ${peso}</h1>
    </form>
</body>
</html>