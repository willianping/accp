<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>学生管理系统2</h2>
    <hr>
    <a href="list.bdqn">查询学生</a>
    <a href="add.jsp">新增学生</a>
    <hr>
    <c:choose>
        <c:when test="${studentlist!=null && studentlist.size()>0}">
            <table width="80%">
                <tr>
                    <th>序号</th>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>生日</th>
                    <th>班级</th>
                    <th>操作</th>
                </tr>
                <c:forEach var="stu" items="${studentlist}" varStatus="vs">
                    <tr>
                        <td>${vs.count}</td>
                        <td>${stu.sid}</td>
                        <td>${stu.name}</td>
                        <td>${stu.age}</td>
                        <td>${stu.gender}</td>
                        <td>${stu.birthday}</td>
                        <td>XXX</td>
                        <td>
                            <a href="#">分班</a>
                            <a href="#">删除</a>
                            <a href="#">更新</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            暂无学生信息
        </c:otherwise>
    </c:choose>

    <hr>
分页
</body>
</html>
