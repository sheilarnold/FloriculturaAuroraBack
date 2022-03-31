<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/Editar" var="url"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de novo item</title>
</head>
<body>
	<form action="${url}" method="POST">
		Id: ${item.id} <br>	
		<input type="hidden" name="id" value="${item.id}"/>
		Item: <input type="text" name="nome" value="${item.nome}"/><br>
		Descricao: <input type="text" name="descricao" value="${item.descricao}"/><br>
		Preço: <input type="number" name="preco" value="${item.preco_custo}"/><br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>