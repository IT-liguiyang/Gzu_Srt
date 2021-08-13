<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/17
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%-- post上传文件没有大小限制，而get有--%>
<form action="${pageContext.request.contextPath}/pic/uploadPic" method="post" enctype="multipart/form-data">
    上传用户：<input type="text" name="username"> <br/>
    <p><input type="file" name="file1"></p>
    <p><input type="submit">|<input type="reset"></p>

</form>
</body>
</html>
