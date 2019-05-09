<%@ page language="java" import="java.util.*"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试JSP表达式的使用</title>
</head>
<body>
<!-- 输出变量 -->
<%
    String manager = "小李";
%>
管理员：<%=manager%>
<%="管理员：" + manager%>
<!-- 输出表达式计算结果 -->
<%=1 + 2%>
<!-- 执行Java代码 -->
<%
    int x = 10;
    out.println(x);
%>
<!-- 将表达式插入到HTML标记中-->
<%
    String url = "test.png";
%>
<img src="images/<%=url%>" />
<br>
<!-- 输出系统时间 -->
<%=new Date()%>
<!-- 执行多个片断 -->
<%
    for (int i = 0; i < 5; i++) {
%>
<H2>http://blog.csdn.net/u010142437</H2>
<%
    }
%>
</body>
</html>
