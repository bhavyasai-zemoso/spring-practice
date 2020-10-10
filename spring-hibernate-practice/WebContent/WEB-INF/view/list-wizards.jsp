<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Wizards</title>
	
	

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Wizarding World</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<input type="button" value="New Sorcerer"
				   onclick="window.location.href='addSorcerer'; return false;"
				   class="add-button"
			/>
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				
				<c:forEach var="wizard" items="${wizards}">
					
					<c:url var="updateLink" value="/wizard/updateWizard">
						<c:param name="wizardId" value="${wizard.id}" />
					</c:url>	
					
					<c:url var="deleteLink" value="/wizard/deleteWizard">
						<c:param name="wizardId" value="${wizard.id}" />
					</c:url>	
					<tr>
						<td> ${wizard.firstName} </td>
						<td> ${wizard.lastName} </td>
						<td> ${wizard.email}    </td>
						<td>	
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>








