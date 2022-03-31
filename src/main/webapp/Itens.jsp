<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List, br.com.floricultura.model.Item" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>
	
	<ul>
		<c:forEach items="${itens}" var="item">
			<li>
				Item: ${item.nome} | <a href="/FloriculturaAurora/Remover?id=${item.id}">Remover</a> | <a href="/FloriculturaAurora/Editar?id=${item.id}">Editar</a>
				<ul>					
					<li>Descrição: ${item.descricao}</li>
					<li>Preço de custo: ${item.preco_custo}</li>
					<li>Data de validade: <fmt:formatDate value="${item.validade}" pattern="dd/MM/YYYY"/></li>
				</ul>
			</li>
		</c:forEach>
	</ul>
	
	<button><a href="/FloriculturaAurora/FormNewItem.jsp">Adicionar novo item</a></button>
</body>
</html>
