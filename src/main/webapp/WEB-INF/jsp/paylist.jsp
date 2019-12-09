<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Cписок покупок</title></head>
  <body>
  <h1>Cписок Покупок</h1>
  <ul>
    <c:forEach items="${parcels}" var="parcel">
      <li><a href="/pay/${parcel.id}"> <b>${parcel.name}</b>,  ;<b>${parcel.count}</b>, ;<b>${parcel.purchase_date}</b> </a>
    </c:forEach>
  </ul>
  </body>
</html>