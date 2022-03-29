<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List, br.com.floricultura.model.Item" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
