<%--
  Created by IntelliJ IDEA.
  User: Summer
  Date: 2019/7/25
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/register">
        用户名：<input type="text" name="name">
        <br/>
        密码：<input type="password" name="pwd" >
        <input type="submit" name="提交" value="submit">

    </form>
</body>
</html>
