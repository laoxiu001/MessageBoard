<%@page import="java.util.Map"%>
<%@page import="user.dao.ListDao"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>ѧ������ƽ̨-�ظ�����</title>
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
							<li class="clrli"><a href="<%=basePath%>/admin/reply.jsp"><img
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
			<a class="clra">�ظ����� >> δ�ظ�����</a>
		</div>
		<div class="row">
			<div id="right" class="span10">
				<form>
					<table style="width: 90%; margin: 0px auto;"
						class="table table-striped table-hover table-bordered">
						<tr class="success">
							<td>���Ա��</td>
							<td>����</td>
							<td>��������</td>
							<td>��������</td>
							<td>�����</td>
							<td style="width: 100px;">����</td>
						</tr>
						<%
							ListDao ls = new ListDao();
							String sql = "Select * from message where m_object2 = '��ѧ��ƾ�ѧԺ' order by m_time";
							ls.getList(sql);
							Map map = null;
							for (int i = 0; i < ls.list.size(); i++) {
								map = (Map) ls.list.get(i);
						%>
						<tr>
							<td>
								<%
									out.print(map.get("id"));
								%>
							</td>
							<td>
								<%
									out.print(map.get("title"));
								%>
							</td>
							<td>
								<%
									out.print(map.get("m_time"));
								%>
							</td>
							<td>
								<%
									out.print(map.get("type"));
								%>
							</td>
							<td>
								<%
									out.print(map.get("click"));
								%>
							</td>
							<td><a style="cursor: pointer" href="<%= basePath%>/admin/message.jsp?id=<%= map.get("id")%>"
								title="�ظ�����"><svg
										class="icon" aria-hidden="true"> <use
										xlink:href="#icon-huifu"></use> </svg></a> <a style="cursor: pointer"
								onclick="forward('<%=map.get("m_object2")%>');" title="ת������">
									<svg class="icon" aria-hidden="true"> <use
										xlink:href="#icon-shenpizhuanjiao"></use> </svg>
							</a> <a style="cursor: pointer" onclick="del('<%=map.get("id")%>');"
								title="ɾ������"><svg class="icon" aria-hidden="true"> <use
										xlink:href="#icon-icon209"></use> </svg> </a></td>
						</tr>
						<%
							}
						%>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script>
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
		layer.msg('<%=msg%>');
	</script>
	<%
		}
		//��¼��Ϣչʾһ��֮��ʱ���msg��sessionֵ
		session.removeAttribute("msg");
	%>
</body>
</html>