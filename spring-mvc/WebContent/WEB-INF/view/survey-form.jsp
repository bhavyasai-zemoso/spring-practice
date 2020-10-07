<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title> Wizarding World - Survey Form </title>
</head>

<body>

	<form:form action="surveyProcessForm" modelAttribute="character">
	
		Favourite Character name: <form:input path="characterName" />
		
		<br><br>
		Dark Art Professors:
		
		<form:select path="professor">
		
			<form:options items="${character.professorOptions}" />
			
		</form:select>
		<br><br>
		Favorite Part:
		
		Philosopher's Stone <form:radiobutton path="favouritePart" value="Philosopher's Stone" />
		Chamber of Secrets <form:radiobutton path="favouritePart" value="Chamber of Secrets" />
		Half Blood Prince <form:radiobutton path="favouritePart" value="Half Blood Prince" />
		Deathly Hallows <form:radiobutton path="favouritePart" value="Deathly Hallows" />

		<br><br>
		<br><br>
		<input type="submit" value="SUBMIT" />
	
	</form:form>
	
<br><br>


</body>

</html>
