/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-04-17 08:47:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.result;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Message_005fwrong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>学生交流平台-留言失败</title>\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<!-- Jquery -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/CSS/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/CSS/public.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/assets/themes/default/sangarSlider.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/assets/themes/default/default.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/main.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/jquery.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/jquery.touchSwipe.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/imagesloaded.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery Sangar Slider -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarBaseClass.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSetupLayout.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSizeAndScale.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarShift.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSetupBulletNav.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSetupNavigation.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSetupSwipeTouch.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarSetupTimer.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarBeforeAfter.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarLock.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarResponsiveClass.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarResetSlider.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider/sangarTextbox.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/JS/sangarSlider.js\"></script>\r\n");
      out.write("\t<script type='text/javascript'>\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t$('#sangar-example').sangarSlider({\r\n");
      out.write("\t\t\t\ttimer : true, // true or false to have the timer\r\n");
      out.write("\t\t\t\twidth : 1250, // slideshow width\r\n");
      out.write("    \t\t\theight : 400 // slideshow height\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div id=\"top\" class=\"row\">\r\n");
      out.write("\t\t\t<div id=\"top_left\" class=\"fl col-xs-6\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"");
      out.print(basePath);
      out.write("/img/logo1.png\" alt=\"Logo\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"top_right\" class=\"fr col-xs-6\">\r\n");
      out.write("\t\t\t\t<div class=\"school\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">学校概况</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">创新创业</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">教学科研</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">校园文化</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">信息公开</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">招生信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clrli\"><a class=\"clra\" href=\"#\">就业信息</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img id=\"touch\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.print(basePath);
      out.write("/img/facebook.png\" /></a> <a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\tid=\"touch\" src=\"");
      out.print(basePath);
      out.write("/img/twitter.png\" /></a> <a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\tid=\"touch\" src=\"");
      out.print(basePath);
      out.write("/img/Google+.png\" /></a> <a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\tid=\"touch\" src=\"");
      out.print(basePath);
      out.write("/img/telegram.png\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"top_right\">\r\n");
      out.write("\t\t\t\t\t<form class=\"search\"\r\n");
      out.write("\t\t\t\t\t\taction=\"");
      out.print(basePath);
      out.write("/result/Search_result.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<select id=\"choose\" name=\"select\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"id\">编号</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"title\">标题</option>\r\n");
      out.write("\t\t\t\t\t\t</select> <input name=\"input\" id=\"s_input\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"请输入搜索内容\"> <input class=\"fr\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"button\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<!-- .navbar-toggle样式用于toggle收缩的内容，即nav-collapse collapse样式所在元素 -->\r\n");
      out.write("\t\t\t\t<button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-responsive-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle Navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<!-- 确保无论是宽屏还是窄屏，navbar-brand都显示 -->\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\">学生交流平台</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 屏幕宽度小于768px时，div.navbar-responsive-collapse容器里的内容都会隐藏，显示icon-bar图标，当点击icon-bar图标时，再展开。屏幕大于768px时，默认显示。 -->\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navbar-responsive-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.print(basePath);
      out.write("/index.jsp\">首 页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("/Principal.jsp?object=all\">校长留言板</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("/Department.jsp?object=all\">部门留言板</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("/College.jsp?object=all\">学院留言板</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("/Message.jsp\">发表留言</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"picture\">\r\n");
      out.write("\t\t<div class=\"htmleaf-container\">\r\n");
      out.write("\t\t\t<div class=\"htmleaf-content bgcolor-3\">\r\n");
      out.write("\t\t\t\t<div class='sangar-slideshow-container' id='sangar-example'>\r\n");
      out.write("\t\t\t\t\t<div class='sangar-content-wrapper'>\r\n");
      out.write("\t\t\t\t\t\t<div class='sangar-content'>\r\n");
      out.write("\t\t\t\t\t\t\t<img src='");
      out.print(basePath);
      out.write("/img/lb1.jpg' />\r\n");
      out.write("\t\t\t\t\t\t\t<a href='#'></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class='sangar-content'>\r\n");
      out.write("\t\t\t\t\t\t\t<img src='");
      out.print(basePath);
      out.write("/img/lb2.jpg' />\r\n");
      out.write("\t\t\t\t\t\t\t<a href='#'></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class='sangar-content'>\r\n");
      out.write("\t\t\t\t\t\t\t<img src='");
      out.print(basePath);
      out.write("/img/lb3.jpg' />\r\n");
      out.write("\t\t\t\t\t\t\t<a href='#'></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"middle\">\r\n");
      out.write("\t\t<div id=\"search_result\">\r\n");
      out.write("\t\t\t<div class=\"bluebar\">\r\n");
      out.write("\t\t\t\t<a><img src=\"");
      out.print(basePath);
      out.write("/img/Message_wrong.png\"> 留言失败</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"greycontent_visiable\">\r\n");
      out.write("\t\t\t\t<div class=\"cb\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"result\">\r\n");
      out.write("\t\t\t\t\t<div class=\"result_content\">\r\n");
      out.write("\t\t\t\t\t\t<a>对不起，留言失败，请修正后重试。<br /> <a>原因可能为：</a> <a class=\"red\">");
      out.print(request.getAttribute("result"));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t</br> 如果您认为此错误不该发生，请联系管理员。\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"bottom\">\r\n");
      out.write("\t\t<div id=\"bottom_text\">\r\n");
      out.write("\t\t\t<a> 版权所有 2011 重庆文理学院 地址: 重庆市永川区红河大道319号 邮编: 402160</br>\r\n");
      out.write("\t\t\t\t校友会电话：023-49891798 校办电话：023-49891910\r\n");
      out.write("\t\t\t</a> <a href=\"#\" class=\"admin\">管理登录</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
