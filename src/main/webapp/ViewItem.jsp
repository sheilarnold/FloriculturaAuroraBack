<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Floricultura Aurora | Item</title>
</head>
<body>
	<c:if test="${not empty nome}">
		Item cadastrado: ${nome}
	</c:if>
	
	<c:if test="${empty nome}">
		Nenhuma empresa cadastrada!
	</c:if>
</body>
</html>