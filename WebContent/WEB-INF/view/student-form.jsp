<%@ taglib 
	prefix="form" 
	uri="http://www.springframework.org/tags/form"%>
	<form:form action="confirmation" modelAttribute="student">
	First name(*): <form:input 
		path="firstName" />
	<br/><br/>
	Last name: <form:input 
		path="lastName" />
	<br/><br/>
	<form:select path="country">
		<form:options 
			items="${student.countryOptions}"/>
	</form:select>
	<br/><br/>
	Programming Language:
	<br/>
	<form:radiobuttons 
		items="${student.languageOptions}"
		path="language"/> 
	<br/><br/>
	Operating System:
	<br/>
	<form:checkboxes 
		items="${student.osOptions}"
		path="os"/> 
	<br/><br/>
	<input 
		type="submit" 
		value="Submit" />
</form:form>