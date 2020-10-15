<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title> Employee Home Page</title>
</head>

<body>
	<h2> Employee Home Page</h2>
	<hr>
	
	<p>
	Welcome to   Employee Home Page!
	</p>
	
	<hr>
	
	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		Role(s): <security:authentication property="principal.authorities" />
	</p>
	
	<security:authorize access="hasRole('MANAGER')">
	
		
		<p>
			<a href="${pageContext.request.contextPath}/managers">As a manager</a>
		</p>

	</security:authorize>	
	
	
	<security:authorize access="hasRole('DEVELOPER')">  
		<p>
			<a href="${pageContext.request.contextPath}/developers">As a developer</a>
		</p>
	
	</security:authorize>
	
	<hr>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
	
</body>

</html>









