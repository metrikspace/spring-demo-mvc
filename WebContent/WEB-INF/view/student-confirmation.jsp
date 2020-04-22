<%@ taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core"%>
First name: ${student.firstName}
<br/><br/>
Second name: ${student.lastName}
<br/><br/>
Country: ${student.country}
<br/><br/>
Programming Language: ${student.language}
<br/><br/>
Operating System: 
<c:forEach var="item" items="${student.os}">
<li>${item}
</c:forEach>