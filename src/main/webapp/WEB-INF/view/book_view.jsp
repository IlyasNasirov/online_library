<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h3>This is your book</h3>

<form:form modelAttribute="book">

  ID<form>${book.id}</form>
  Name<form>${book.nameBook}</form>
  author<form>${book.author}</form>
  year of publish<form>${book.year}</form>
  cost<form>${book.cost}</form>

</form:form>


</body>
</html>
