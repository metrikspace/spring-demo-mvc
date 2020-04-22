<%@ taglib 
	prefix="form" 
	uri="http://www.springframework.org/tags/form"%>
<head>
	<style>
	.error {
		color: red;
		margin-left: 0.1rem;
	}
	.mt {
		margin-top: 0.5rem;
	}
	</style>
</head>
<body>
	<i>Fill out the form. Asterisk (*) means required.</i>
	<br/>
	<form:form action="confirm" modelAttribute="customer">
	First name (*): <form:input path="first"/>
	<form:errors cssClass="error mt" path="first"/>
	<br/>
	Last name (*): <form:input path="last"/>
	<form:errors cssClass="error" path="last"/>
	<br/>
	Passes (*): <form:input path="passes"/>
	<form:errors cssClass="error" path="passes"/>
	<br/>
	Postal code (*): <form:input path="postal"/>
	<form:errors cssClass="error" path="postal"/>
	<br/>
	Course code (*): <form:input path="courseCode"/>
	<form:errors cssClass="error" path="courseCode"/>
	<br/>
	<input 
		type="submit" 
		value="Send"/>
	</form:form>
</body>