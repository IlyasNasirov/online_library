<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<input type="button" value="main"
       onclick="window.location.href='main'"/>
<br>
<h3>Please fill a field:</h3>
<br>
<form:form action="doneView" modelAttribute="newBook">
Name of book<form:input path="nameBook"></form:input>
    <br>
Author <form:input path="author"></form:input>
    <br>
Year of publish<form:input path="year"></form:input>
    <br>
Cost<form:input path="cost"></form:input>
    <br>
   <input type="submit" value="Create">
</form:form >
</body>
</html>
