<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/3/18
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>
    <div id="global">
        <form action="product_save.action" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <label for="name">Product Name: </label>
                <input type="text" name="name" id="name" value="" tabindex="1">
                <label for="description">Description: </label>
                <input type="text" name="description" id="description" tabindex="2">
                <label for="price">Price: </label>
                <input type="text" id="price" name="price" tabindex="3">

                <div id="buttons">
                    <label for="dummy"> </label>
                    <input id="reset" type="reset" tabindex="4">
                    <input id="subit" type="submit" tabindex="5" value="Add Product">
                </div>
            </fieldset>
        </form>
    </div>
</body>
</html>
