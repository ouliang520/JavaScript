<%--
  Created by IntelliJ IDEA.
  User: celestial
  Date: 2021/11/7
  Time: 1:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var stuObj =${requestScope.key};//从request作用域中得到学生对象
        window.alert("学生编号 "+stuObj.sid+" 学生姓名 "+stuObj.sname)
    </script>
</head>
<body>

</body>
</html>
