<%@page import="user.util.TokenUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>学生交流平台-发表留言</title>
<link rel="stylesheet" href="CSS/main.css">
<link rel="stylesheet" href="CSS/public.css">
<script type="text/javascript" src="JS/main.js"></script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生交流平台-发表留言</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Jquery -->
<script
	src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="<%=basePath%>/CSS/main.css">
<link rel="stylesheet" href="<%=basePath%>/CSS/public.css">
<link rel="stylesheet"
	href="<%=basePath%>/assets/themes/default/sangarSlider.css"
	type="text/css" media="all">
<link rel="stylesheet"
	href="<%=basePath%>/assets/themes/default/default.css" type="text/css"
	media="all">
<script type="text/javascript" src="<%=basePath%>/JS/main.js"></script>
<script type="text/javascript" src="<%=basePath%>/JS/jquery.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/jquery.touchSwipe.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/imagesloaded.min.js"></script>
<!-- jQuery Sangar Slider -->
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarBaseClass.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSetupLayout.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSizeAndScale.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarShift.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSetupBulletNav.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSetupNavigation.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSetupSwipeTouch.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarSetupTimer.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarBeforeAfter.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarLock.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarResponsiveClass.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarResetSlider.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/JS/sangarSlider/sangarTextbox.js"></script>
<script type="text/javascript" src="<%=basePath%>/JS/sangarSlider.js"></script>
<script type='text/javascript'>
	jQuery(document).ready(function($) {
		$('#sangar-example').sangarSlider({
			timer : true, // true or false to have the timer
			width : 1250, // slideshow width
			height : 400
		// slideshow height
		});
	})
</script>
</head>
<body onload="createCode()">
	<div class="container-fluid">
		<div id="top" class="row">
			<div id="top_left" class="fl col-xs-6">
				<a href="#"><img src="<%=basePath%>/img/logo1.png" alt="Logo"></a>
			</div>
			<div id="top_right" class="fr col-xs-6">
				<div class="school">
					<ul>
						<li class="clrli"><a class="clra" href="#">学校概况</a></li>
						<li class="clrli"><a class="clra" href="#">创新创业</a></li>
						<li class="clrli"><a class="clra" href="#">教学科研</a></li>
						<li class="clrli"><a class="clra" href="#">校园文化</a></li>
						<li class="clrli"><a class="clra" href="#">信息公开</a></li>
						<li class="clrli"><a class="clra" href="#">招生信息</a></li>
						<li class="clrli"><a class="clra" href="#">就业信息</a></li>
					</ul>
					<a href="#"><img id="touch"
						src="<%=basePath%>/img/facebook.png" /></a> <a href="#"><img
						id="touch" src="<%=basePath%>/img/twitter.png" /></a> <a href="#"><img
						id="touch" src="<%=basePath%>/img/Google+.png" /></a> <a href="#"><img
						id="touch" src="<%=basePath%>/img/telegram.png" /></a>
				</div>
				<div id="top_right">
					<form class="search"
						action="<%=basePath%>/result/Search_result.jsp">
						<select id="choose" name="select">
							<option value="id">编号</option>
							<option value="title">标题</option>
						</select> <input name="input" id="s_input" type="text"
							placeholder="请输入搜索内容"> <input class="fr" type="submit"
							id="button" value="" />
					</form>
				</div>
			</div>
		</div>

		<div class="navbar navbar-default" role="navigation">
			<div class="navbar-header">
				<!-- .navbar-toggle样式用于toggle收缩的内容，即nav-collapse collapse样式所在元素 -->
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".navbar-responsive-collapse">
					<span class="sr-only">Toggle Navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- 确保无论是宽屏还是窄屏，navbar-brand都显示 -->
				<a class="navbar-brand">学生交流平台</a>
			</div>
			<!-- 屏幕宽度小于768px时，div.navbar-responsive-collapse容器里的内容都会隐藏，显示icon-bar图标，当点击icon-bar图标时，再展开。屏幕大于768px时，默认显示。 -->
			<div class="collapse navbar-collapse navbar-responsive-collapse">
				<ul class="nav navbar-nav">
					<li><a href="<%=basePath%>/index.jsp">首 页</a></li>
					<li><a href="<%=basePath%>/Principal.jsp?object=all">校长留言板</a></li>
					<li><a href="<%=basePath%>/Department.jsp?object=all">部门留言板</a></li>
					<li><a href="<%=basePath%>/College.jsp?object=all">学院留言板</a></li>
					<li class="active"><a href="<%=basePath%>/Message.jsp">发表留言</a></li>
				</ul>
			</div>
		</div>

		<div id="picture">
			<div class="htmleaf-container">
				<div class="htmleaf-content bgcolor-3">
					<div class='sangar-slideshow-container' id='sangar-example'>
						<div class='sangar-content-wrapper'>
							<div class='sangar-content'>
								<img src='<%=basePath%>/img/lb1.jpg' /> <a href='#'></a>
							</div>
							<div class='sangar-content'>
								<img src='<%=basePath%>/img/lb2.jpg' /> <a href='#'></a>
							</div>
							<div class='sangar-content'>
								<img src='<%=basePath%>/img/lb3.jpg' /> <a href='#'></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<div id="message">
				<div class="bluebar">
					<a><img src="img/message.png"> 发表留言</a>
				</div>
				<div id="message_bottom">
						<%
							String token = TokenUtil.getInstance().makeToken();//创建令牌
							request.getSession().setAttribute("token", token);//使用session保存token(令牌)
						%>
						<form name="form" id="form"
							action="${pageContext.request.contextPath }/PublishServlet"
							method="post" target="_blank">
							<table style="margin:0px auto;">
								<tr style="height: 50px">
									<input type="hidden" name="token" value="<%=token%>">
									<!-- 隐藏域存储token令牌 -->
									<td><a style="font-size: 16px width:80px">是否匿名:</a></td>
									<td> <input type="radio" name="choose" checked="checked"
										onclick="anonymous()">是 <input type="radio"
										name="choose" onclick="unanonymous()">否&nbsp;</td>
								</tr>
								<tr style="height: 50px">
									<td><a style="font-size: 16px width:80px">用 户：</a>
									<td><input id="user" name="user" type="text" style="width: 70px; height: 30px;" value="保密"></td>
								</tr>
								<tr style="height: 50px">
									<td><a style="font-size:16px;width:80px;">学 号：</a>
									<td><input id="number" name="number" type="text" style="width: 100px; height: 30px;" value="保密"> 
								</tr style="height: 50px">
									<td><a style="font-size:16px;width:80px;">标 题：</a></td>
									<td><input id="title" name="title" type="text"
										style="height: 30px;"></td>
								</tr>
								<tr style="height: 50px">
									<td style="font-size:16px;width:80px;"><a>留言类型：</a></td>
									<td><select name="type" id="type">
											<option value="点我选择">点我选择</option>
											<option value="建议">建议</option>
											<option value="咨询">咨询</option>
											<option value="投诉">投诉</option>
											</select>
									</td>
								</tr>
								<tr style="height: 50px">
									<td style="font-size:16px;width:80px;">
										<a>留言对象：</a>
									</td>
									<td>
											<select name="m_object"
										id="m_object">
											<option value="false,false">-----点我选择-----</option>
											<option value="false,false">-------校 长-------</option>
											<option value="校长,高层校长">高层校长</option>
											<option value="校长,分管校长">分管校长</option>
											<option value="校长,学院校长">学院校长</option>
											<option value="false,false">-------部 门-------</option>
											<option value="部门,行政部门">行政部门</option>
											<option value="部门,后勤服务部门">后勤服务部门</option>
											<option value="部门,食堂监管部门">食堂监管部门</option>
											<option value="部门,校园安保部门">校园安保部门</option>
											<option value="部门,财务部门">财务部门</option>
											<option value="false,false">-------学 院-------</option>
											<option value="学院,数学与财经学院">数学与财经学院</option>
											<option value="学院,机电学院">机电学院</option>
											<option value="学院,文传学院">文传学院</option>
											<option value="学院,网络工程学院">网络工程学院</option>
											<option value="学院,外国语学院">外国语学院</option>
											<option value="学院,体育学院">体育学院</option>
										</select>
									</td>
								</tr>
								<tr>
									<td style="font-size:16px;width:80px;">留言内容：</td>
									<td><textarea id="m_content" name="m_content" id=""
											cols="55" rows="10"></textarea></td>
								</tr>
								<tr style="height: 50px">
									<td style="font-size:16px;width:80px;">验 证 码：</td>
									<td>
										<div class="code" alt="看不清？点我刷新验证码" id="checkCode"
											onclick="createCode()"></div> <input
										style="float: left; width: 60px; height: 30px;" type="text"
										id="inputCode" />
									</td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit" name="submit" id="submit"
										value="提交" class="button" onclick="return publish()"></td>
								</tr>
							</table>
						</form>
					</div>
					<div class="cb"></div>
				</div>
			</div>
		</div>
	<div id="bottom">
		<div id="bottom_text">
			<a> 版权所有 2011 重庆文理学院 地址: 重庆市永川区红河大道319号 邮编: 402160</br>
				校友会电话：023-49891798 校办电话：023-49891910
			</a> <a href="#" class="admin">管理登录</a>
		</div>
	</div>
</body>
</html>