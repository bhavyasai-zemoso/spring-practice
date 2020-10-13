<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Wizard</title>
	<style>
		.error {color:red}
	</style>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-wizard-style.css">
</head>

<body>

			<h2>New Wizard!!!</h2>

	
		<h3>Save Wizard</h3>
	
		<form:form action="saveWizard" modelAttribute="wizard" method="POST">
		<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First name*</label></td>
						<td>
							<form:input path="firstName" />
							<form:errors path="firstName" cssClass="error" />
						</td>
					</tr>
				
					<tr>
						<td><label>Last name*</label></td>
						<td><form:input path="lastName" />
						<form:errors path="lastName" cssClass="error" />
						</td>
					</tr>

					<tr>
						<td><label>Email*</label></td>
						<td><form:input path="email" />
						<form:errors path="email" cssClass="error" />
						</td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/wizard/list">Socerers List</a>
		</p>
	

</body>

</html>
