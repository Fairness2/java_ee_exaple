<%@ page import="products.Product" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Продукты</title>
</head>
<body>
    <h1>Список продуктов</h1>
    <ul>
        <%
            for (Product product: (List<Product>)request.getAttribute("products")) {
                out.println("<li>");
                out.println(product.toString());
                out.println("</li>");
            }
        %>
    </ul>
</body>
</html>
