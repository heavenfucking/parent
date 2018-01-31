<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<link rel="stylesheet" type="text/css" href="style/chat.css"/>
</head>
<body>
    
        <h1>网络聊天室</h1>
		<div id="userMessage">
			当前用户:<span>${name}</span>
			<a href="login.do">注销</a>
		</div>
        <section id="chatBox">
			<div id="users">
				<h2>在线用户</h2>
				<div id="usersInfo">
					<p>正在获取列表...</p>
				</div>
			</div>
			<div id="show">
				<section class="message">
					<p class="header"><span>用户1</span><time>19:01:22</time></p>
					<p class="content">这是聊天内容</p>
				</section>

			</div>
			<form action="#" id="input" method="post">
				<textarea name="message"></textarea>
				<button type="submit" id="submit">发送</button>
			</form>
		</section>

		<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="js/chat.js"></script>
		<script type="text/javascript" src="js/initialize.js"></script>
</body>
</html>

