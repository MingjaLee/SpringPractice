<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jerry
  Date: 17/7/3
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增用户</title>
</head>
<body>
    <%--表单提交到/user.html控制器中--%>
    <form method="post" action="<c:url value="/user.html"/>">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="userName" value="${user.userName}"/> </td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password" value="${user.password}"/> </td>
            </tr>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="realName" value="${user.realName}"/></td>
            </tr>
            <tr>
                <td>生日：</td>
                <td><input type="text" name="realName" value="${user.birthday}"/></td>
            </tr>
            <tr>
                <td>工资：</td>
                <td><input type="text" name="realName" value="${user.salary}"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="提交"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
