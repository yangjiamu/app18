<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/3/18
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>Save Product</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>
    <div id="global">
        <h4>The product has been saved.</h4>
        <p>
            <h5>Details: </h5>
            Product Name: ${product.name}<br/>
            Description: ${product.description}<br/>
            Price: ${product.price}<br/>
        </p>
    </div>
</body>
</html>
