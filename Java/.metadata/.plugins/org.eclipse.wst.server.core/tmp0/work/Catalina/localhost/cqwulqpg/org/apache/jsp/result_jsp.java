/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-04-19 09:45:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>专业分数查看-结果</title>\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,user-scalable=0\">\r\n");
      out.write("<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/main.css\">\r\n");
      out.write("<!--图表JS插件-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top\">\r\n");
      out.write("\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\"><img src=\"img/back.png\" alt=\"点我返回\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"center-block\" style=\"width: 200px;\">\r\n");
      out.write("\t\t\t<a>统计信息</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"text-center\">\r\n");
      out.write("\t\t<h3>XX专业报考及录取人数</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"chart\" style=\"width: 100%; height: 400px;\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    var myChart = echarts.init(document.getElementById('chart'));\r\n");
      out.write("    option = {\r\n");
      out.write("        tooltip : {\r\n");
      out.write("            trigger: 'axis',\r\n");
      out.write("            axisPointer : {            // 坐标轴指示器，坐标轴触发有效\r\n");
      out.write("                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            data:['报考人数','录取人数']\r\n");
      out.write("        },\r\n");
      out.write("        grid: {\r\n");
      out.write("            left: '3%',\r\n");
      out.write("            right: '4%',\r\n");
      out.write("            bottom: '3%',\r\n");
      out.write("            containLabel: true\r\n");
      out.write("        },\r\n");
      out.write("        xAxis : [\r\n");
      out.write("            {\r\n");
      out.write("                type : 'category',\r\n");
      out.write("                data : ");
      out.print(request.getAttribute("year"));
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        ],\r\n");
      out.write("        yAxis : [\r\n");
      out.write("            {\r\n");
      out.write("                type : 'value'\r\n");
      out.write("            }\r\n");
      out.write("        ],\r\n");
      out.write("        series : [\r\n");
      out.write("            {\r\n");
      out.write("                name:'报考人数',\r\n");
      out.write("                type:'bar',\r\n");
      out.write("                data:");
      out.print(request.getAttribute("plan"));
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                name:'录取人数',\r\n");
      out.write("                type:'bar',\r\n");
      out.write("                data:");
      out.print(request.getAttribute("plan"));
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("    myChart.setOption(option);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"table-striped table-hover table-responsive\">\r\n");
      out.write("\t\t<table class=\"table-striped table-hover\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><strong>专业</strong></td>\r\n");
      out.write("\t\t\t<td><strong>最低分</strong></td>\r\n");
      out.write("\t\t\t<td><strong>最高分</strong></td>\r\n");
      out.write("\t\t\t<td><strong>线差</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t\t<td><strong>年份</strong></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>汉语言文学（师范）</td>\r\n");
      out.write("\t\t\t<td>537</td>\r\n");
      out.write("\t\t\t<td>547</td>\r\n");
      out.write("\t\t\t<td>1212</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>汉语言文学（现代文秘）</td>\r\n");
      out.write("\t\t\t<td>534</td>\r\n");
      out.write("\t\t\t<td>527</td>\r\n");
      out.write("\t\t\t<td>1312</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>数学与应用数学（师范）</td>\r\n");
      out.write("\t\t\t<td>537</td>\r\n");
      out.write("\t\t\t<td>545</td>\r\n");
      out.write("\t\t\t<td>1232</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t\t<td>2011</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>经济统计学</td>\r\n");
      out.write("\t\t\t<td>527</td>\r\n");
      out.write("\t\t\t<td>537</td>\r\n");
      out.write("\t\t\t<td>312</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t\t<td>2014</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>汉语言文学（师范）</td>\r\n");
      out.write("\t\t\t<td>537</td>\r\n");
      out.write("\t\t\t<td>547</td>\r\n");
      out.write("\t\t\t<td>1212</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t\t<td>2013</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>财务管理</td>\r\n");
      out.write("\t\t\t<td>533</td>\r\n");
      out.write("\t\t\t<td>523</td>\r\n");
      out.write("\t\t\t<td>122</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>制药工程</td>\r\n");
      out.write("\t\t\t<td>543</td>\r\n");
      out.write("\t\t\t<td>545</td>\r\n");
      out.write("\t\t\t<td>1434</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t\t<td>2016</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"text-center\">\r\n");
      out.write("\t\t<h3>XX专业录取分数统计</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"chart2\" style=\"width: 100%; height: 400px;\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    var myChart = echarts.init(document.getElementById('chart2'));\r\n");
      out.write("    option = {\r\n");
      out.write("    \t    tooltip: {\r\n");
      out.write("    \t        trigger: 'axis'\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    legend: {\r\n");
      out.write("    \t        data:['平均分数','控制线','线差']\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    grid: {\r\n");
      out.write("    \t        left: '3%',\r\n");
      out.write("    \t        right: '4%',\r\n");
      out.write("    \t        bottom: '3%',\r\n");
      out.write("    \t        containLabel: true\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    toolbox: {\r\n");
      out.write("    \t        feature: {\r\n");
      out.write("    \t            saveAsImage: {}\r\n");
      out.write("    \t        }\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    xAxis: {\r\n");
      out.write("    \t        type: 'category',\r\n");
      out.write("    \t        boundaryGap: false,\r\n");
      out.write("    \t        data: ['2013','2014','2015','2016']\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    yAxis: {\r\n");
      out.write("    \t        type: 'value'\r\n");
      out.write("    \t    },\r\n");
      out.write("    \t    series: [\r\n");
      out.write("    \t        {\r\n");
      out.write("    \t            name:'平均分数',\r\n");
      out.write("    \t            type:'line',\r\n");
      out.write("    \t            data:[520, 532, 501, 534]\r\n");
      out.write("    \t        },\r\n");
      out.write("    \t        {\r\n");
      out.write("    \t            name:'控制线',\r\n");
      out.write("    \t            type:'line',\r\n");
      out.write("    \t            data:[520, 582, 591, 534]\r\n");
      out.write("    \t        },\r\n");
      out.write("    \t        {\r\n");
      out.write("    \t            name:'线差',\r\n");
      out.write("    \t            type:'line',\r\n");
      out.write("    \t            data:[50, 57, 81, 70]\r\n");
      out.write("    \t        }\r\n");
      out.write("    \t    ]\r\n");
      out.write("    \t};\r\n");
      out.write("    myChart.setOption(option);\r\n");
      out.write("</script>\r\n");
      out.write("\t<a href=\"index.jsp\">index</a>\r\n");
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
