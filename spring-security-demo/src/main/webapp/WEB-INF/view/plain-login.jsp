<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>

<head>
	<title>Custom Login Page</title>
	
	<style>
		.failed {
			color: red;
		}
		.logout{
			color: green;
		}
	</style>
	
</head>

<body>

<h3>Custom Login Page</h3>

	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	
		<c:if test="${param.error != null}">

			<i class="failed">You entered invalid username/password.</i>

		</c:if>

		<c:if test="${param.logout != null}">

			<div class="logout">You have been logged out.</div>

		</c:if>

		<p>
			User name: <input type="text" name="username" />
		</p>

		<p>
			Password: <input type="password" name="password" />
		</p>
		
		<input type="submit" value="Login" />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form:form>

</body>

</html>












