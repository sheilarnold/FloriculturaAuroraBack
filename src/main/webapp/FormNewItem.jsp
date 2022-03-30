<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovoItem" var="url"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de novo item</title>
</head>
<body>
	<form action="${url}" method="POST">
		Item: <input type="text" name="nome"/><br>
		Descricao: <input type="text" name="descricao"/><br>
		Preço: <input type="number" name="preco"/><br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>