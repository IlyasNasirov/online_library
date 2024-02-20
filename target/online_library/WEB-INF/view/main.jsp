<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1 align="center">Welcome to Library</h1>
<br>
<table align="center">
    <tr>
        <td>Search field
            <form:form action="booksByName" >
                <input type="text" name="nameBook" />
                <input type="submit" value="Search">
            </form:form>
        </td>
<%--        <td>Liked</td>--%>
<%--        <td>Bucket</td>--%>
<%--        <td>My books</td>--%>
        <td>
            <input type="button" value="Log in"
                   onclick="window.location.href='signup'"/>
                </td>
    </tr>
</table>

    Get all books list
    <input type="button" value="Get"
           onclick="window.location.href='books'"/>
<br>
<security:authorize access="hasRole('ADMIN')">
    Add new book
    <input type="button" value="Add"
    onclick="window.location.href='addBook'"/>
</security:authorize>

</body>
</html>
