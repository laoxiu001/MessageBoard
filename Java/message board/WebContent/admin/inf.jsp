<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>ѧ������ƽ̨-��������</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!-- ���°汾�� Bootstrap ���� CSS �ļ� -->
<link rel="stylesheet"
	href="<%=basePath%>/CSS/bootstrap/bootstrap.min.css">
<!-- jquery -->
<script src="<%=basePath%>/CSS/bootstrap/jquery.min.js"></script>
<!-- ��ѡ�� Bootstrap �����ļ���һ�㲻�����룩 -->
<link rel="stylesheet"
	href="<%=basePath%>/CSS/bootstrap/bootstrap-theme.min.css">
<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
<script src="<%=basePath%>/CSS/bootstrap/bootstrap.min.js"></script>
<!--�������layer.JS���� -->
<script src="<%=basePath%>/JS/windows/layer.js"></script>

<link rel="stylesheet" href="<%=basePath%>/CSS/public.css">
<link rel="stylesheet" href="<%=basePath%>/CSS/admin/manage.css">
</head>
<body>
	<div id="top" class="container-fluid">
		<div class="row">
			<img class="span2" id="top_left" id="top_left" alt="��������ѧԺ"
				src="<%=basePath%>/img/admin/logo2.png"> <span><img
				class="span2" id="top_right" alt="�û�ͷ��"
				src="<%=basePath%>/img/admin/avatar.png">
				<ul id="flow">
					<li class="clrli"><a href="logout"><img
							src="<%=basePath%>/img/admin/logout.png">ע���˳�</a></li>
					<li class="clrli"><a href="<%=basePath%>/admin/inf.jsp"><img
							src="<%=basePath%>/img/admin/inf.png">��������</a></li>
				</ul> </span> <a class="span4" id="top_user">��ӭ�ؼң��û�12138 </a>

		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<div id="left" class="span2">
				<div id="left_visiable">
					<div id="left_visiable_avatar">
						<img alt="�û�ͷ��" src="<%=basePath%>/img/admin/avatar_white.png">
					</div>

					<div id="left_visiable_userid">
						<a>��ţ�1056314532</a>
					</div>

					<div id="nav">
						<ul>
							<li class="clrli"><a href="<%=basePath%>/admin/index.jsp"><img
									alt="" src="<%=basePath%>/img/admin/index.png"> ��ҳ����</a></li>
							<li class="clrli"><a href="<%=basePath%>/admin/reply_s"><img
									alt="" src="<%=basePath%>/img/admin/reply.png"> �ظ�����</a></li>
							<li class="clrli"><a href="<%=basePath%>/admin/change.jsp"><img
									alt="" src="<%=basePath%>/img/admin/change.png"> �޸�����</a></li>
							<li class="clrli"><a href="<%=basePath%>/admin/inf.jsp"><img
									alt="<%=basePath%>/admin/inf.jsp"
									src="<%=basePath%>/img/admin/inf.png"> ��������</a></li>
						</ul>
					</div>

				</div>
			</div>
		</div>

		<div id="location">
			<a class="clra">�������� >> </a>
		</div>
		<div class="row">
			<div id="right" class="span10"
				style="width: 900px; height: 400px; margin-left: 400px;">
				<div style="width: 600px;" class="center-block">
					<form class="form-horizontal" role="form">
						<table>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">�û����</label>
								<div class="col-sm-10">
									<input value="000001" class="form-control" id="" style="width: 300px;" readonly="readonly">
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">�û���</label>
								<div class="col-sm-10">
									<input value="12138" class="form-control" id="" style="width: 300px;">
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">������λ</label>
								<div class="col-sm-10">
									<select class="form-control" style="width: 300px;">
										<option value="����ѧԺ">����ѧԺ</option>
										<option value="�����ѧԺ">�����ѧԺ</option>
										<option value="��ѧ��ƾ�ѧԺ">��ѧ��ƾ�ѧԺ</option>
										<option value="�Ĵ�ѧԺ">�Ĵ�ѧԺ</option>
										<option value="���ù���ѧԺ">���ù���ѧԺ</option>
										<option value="���繤��ѧԺ">���繤��ѧԺ</option>
										<option value="����ѧԺ">����ѧԺ</option>
										<option value="���ڷ�����">���ڷ�����</option>
										<option value="У԰��������">У԰��������</option>
										<option value="��������">��������</option>
										<option value="������">������</option>
										<option value="ʳ�ü�ܲ���">ʳ�ü�ܲ���</option>
										<option value="�ֹ�У��">�ֹ�У��</option>
										<option value="�ֹ����">�ֹ����</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">��ϵ��ʽ</label>
								<div class="col-sm-10">
									<input value="15724684532" class="form-control" id="" style="width: 300px;">
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">�����˺�</label>
								<div class="col-sm-10">
									<input value="cqwu.edu.12138@gmail.com" class="form-control" id="" style="width: 300px;">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-default">�޸�</button>
								</div>
							</div>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>