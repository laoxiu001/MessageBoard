<%@page import="user.dao.ListDao"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>ѧ������ƽ̨-���Բ鿴</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
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
<!-- ������iconfont����JS���� -->
<script src="<%=basePath%>/JS/iconfont/iconfont.js"></script>
<!--�������layer.JS���� -->
<script src="<%=basePath%>/JS/windows/layer.js"></script>
<style type="text/css">
.icon {
	width: 1em;
	height: 1em;
	vertical-align: -0.15em;
	fill: currentColor;
	overflow: hidden;
}
</style>
<link rel="stylesheet" href="<%=basePath%>/CSS/public.css">
<link rel="stylesheet" href="<%=basePath%>/CSS/admin/manage.css">
</head>
<body style="background-color: #eaecec;">
	<div id="top" class="container-fluid">
		<div class="row">
			<img class="span2" id="top_left" id="top_left" alt="��������ѧԺ"
				src="<%=basePath%>/img/admin/logo2.png"> <span><img
				class="span2" id="top_right" alt="�û�ͷ��"
				src="<%=basePath%>/img/admin/avatar.png">
				<ul id="flow">
					<li class="clrli"><a href="logout"><img
							src="<%=basePath%>/img/admin/logout.png">ע���˳�</a></li>
					<li class="clrli"><a href=""><img
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
							<li class="clrli"><a href="<%=basePath%>/admin/reply.jsp"><img
									alt="" src="<%=basePath%>/img/admin/reply.png"> �ظ�����</a></li>
							<li class="clrli"><a href="<%=basePath%>/admin/change.jsp"><img
									alt="" src="<%=basePath%>/img/admin/change.png"> �޸�����</a></li>
							<li class="clrli"><a href=""><img
									alt="<%=basePath%>/admin/inf.jsp"
									src="<%=basePath%>/img/admin/inf.png"> ��������</a></li>
						</ul>
					</div>

				</div>
			</div>
		</div>

		<div id="location">
			<a class="clra">�ظ����� >> δ�ظ�����</a>
		</div>
		<div class="row">
			<div id="right" class="span10">
				<form>
					<table style="width: 90%; margin: 0px auto;"
						class="table table-striped table-hover table-bordered">
						<tr>
							<td style="width: 90px">���Ա�ţ�</td>
							<td><a class="clra"> <%
 	String index = request.getParameter("index");
 	if (index == null) {
 		index = "1";
 	}
 	int id = Integer.parseInt(index);
 	ListDao ls = new ListDao();
 	String sql = "Select * from t_message where id = " + id + " ";
 	ls.getList(sql);

 	Map map = null;
 	map = (Map) ls.list.get(0);
 	out.print(map.get("id"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>���Ա��⣺</td>
							<td><a class="clra"> <%
 	out.print(map.get("title"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>�������ݣ�</td>
							<td><a class="clra"> <%
 	out.print(map.get("m_content"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>����ʱ�䣺</td>
							<td><a class="clra"> <%
 	out.print(map.get("m_time_s"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>�û���</td>
							<td><a class="clra"> <%
 	out.print(map.get("user"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>ѧ�ţ�</td>
							<td><a class="clra"> <%
 	out.print(map.get("number"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>����λ��</td>
							<td><a class="clra"> <%
 	out.print(map.get("reply"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>�ظ����ݣ�</td>
							<td><a class="clra"> <%
 	out.print(map.get("r_content"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>�ظ�ʱ�䣺</td>
							<td><a class="clra"> <%
 	out.print(map.get("r_time_s"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>����ʣ�</td>
							<td><a class="clra"> <%
 	out.print(map.get("click"));
 %>
							</a></td>
						</tr>
						<tr>
							<td>�������ͣ�</td>
							<td><a class="clra"> <%
 	out.print(map.get("type"));
 %>
							</a></td>
						</tr>
					</table>
				</form>
				<div id="right_btn">
					<button class="btn">3123</button>
				</div>
			</div>
		</div>
	</div>
	<script>
	/* �ظ�����JS */
 		function reply(m_content) {
	layer.prompt(
			{
			  formType: 2,
			  value: '',
			  title: '�ظ�����',
			  area: ['500px', '200px'] //�Զ����ı�����
			}, function(value, index, elem){
			  alert(value); //�õ�value
			  layer.close(index);
			});
		}
 	/* ת������JS */
 		function forward(m_object2) {
		}
 	/* ɾ������JS */
 		function del(id) {
			layer.confirm('ȷ��ɾ��������¼��', {icon: 8, title:'����'}, function(){
				  //do something
				  location.href = "<%=basePath%>/delete.jsp?id=" + id;  
				});
		}
	</script>
	<%
		String msg = (String) session.getAttribute("msg");
		if (msg != null && !msg.equals("")) {
			//�û����������ݵĲ����������ɹ�����ʧ�ܽ��
	%>
	<script type="text/javascript">
		layer.msg('<%=msg%>
		');
	</script>
	<%
		}
		//��¼��Ϣչʾһ��֮��ʱ���msg��sessionֵ
		session.removeAttribute("msg");
	%>
</body>
</html>