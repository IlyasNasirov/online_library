<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1>Welcome to Library</h1>
<br>
<h2>What dou want?</h2>
<br>
    Get all books list
    <input type="button" value="Get"
           onclick="window.location.href='books'"/>
<br>
I would like to add a new book
    <input type="button" value="Add"
    onclick="window.location.href='addBook'"/>


</body>
</html>
