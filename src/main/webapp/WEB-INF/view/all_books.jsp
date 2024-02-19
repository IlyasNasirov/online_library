<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<h3>This is page all_books</h3>
<br>
<table>
    <tr>
        <th>Book name</th>
        <th>Author</th>
        <th>Year of publish</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="book" items="${listBooks}">

        <tr>
            <td>${book.nameBook}</td>
            <td>${book.author}</td>
            <td>${book.year}</td>
            <td>${book.cost}</td>

        </tr>

    </c:forEach>

</table>

<input type="button" value="Back"
    onclick="window.location.href='main'"/>

</body>
</html>
