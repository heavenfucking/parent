<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网络聊天室</title>
<link rel="stylesheet" type="text/css" href="style/common.css"/>
<link rel="stylesheet" type="text/css" href="style/login.css"/>
</head>
<body>
    <div id="loginBox">
        <h1>Register Account</h1>

        <form action="registerServer.do" method="post">
            <input type="text" name="username" placeholder="用户名"/>
            <input type="password" name="password" placeholder="密码"/>
			<input type="password" name="password_confirm" placeholder="密码确认"/>
            <button type="submit">注册</button>
        </form>
    </div>
	
	
</body>
</html>

