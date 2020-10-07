<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Developer Registration Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>
<body>

<i>Kindly fill out the form</i>
<br><br>

	<form:form action="processForm" modelAttribute="developer">
	
		Developer Name* : <form:input path="developerName" />
		<form:errors path="developerName" cssClass="error" />
		<br><br>
			
		
		<br><br>
		Register as*
		<form:errors path="developerType" cssClass="error" />
		<br><br>
		Android Developer <form:radiobutton path="developerType" value="Android Developer" /><br>
		Web Developer <form:radiobutton path="developerType" value="Web Developer" /><br>
		Ios Developer <form:radiobutton path="developerType" value="Ios Developer" />
		
		
		<br><br>
		
		Mobile number : <form:input path="mobileNumber" />
		<form:errors path="mobileNumber" cssClass="error" />
		
		
		<br><br>
		email : <form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br><br>
		Developer Code : <form:input path="developerCode" />
		<form:errors path="developerCode" cssClass="error" />
		<br><br>
		
		<input type="submit" value="Submit" />
				
	</form:form>

</body>

</html>









