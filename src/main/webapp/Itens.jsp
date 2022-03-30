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
				Item: ${item.nome}
				<ul>					
					<li>Descrição: ${item.descricao}</li>
					<li>Preço de custo: ${item.preco_custo}</li>
					<li>Data de validade: <fmt:formatDate value="${item.validade}" pattern="dd/MM/YYYY"/></li>
				</ul>
			</li>
		</c:forEach>
	</ul>
	
====================
	<ul>
		<%
			List<Item> lista = (List<Item>)request.getAttribute("itens");
				
			for(Item item : lista){
		%>
			<li>
				Item: <%=item.getNome()%>
				<ul>
					<li>Descrição: <%=item.getDescricao()%></li>
					<li>Preço de custo: <%=item.getPreco_custo()%>
				</ul>
			</li>
		<% } %>
	</ul>

</body>
</html>
