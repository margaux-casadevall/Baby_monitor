/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2023-01-15 19:49:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Patient;

public final class addData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("models.Patient");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

    Patient patient = (Patient)request.getAttribute("patient");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Document</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/addData.css\">\r\n");
      out.write("  <style>\r\n");
      out.write("    button{\r\n");
      out.write("      border: none;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      appearance: none;\r\n");
      out.write("      background-color: inherit;\r\n");
      out.write("      margin-left:10px;\r\n");
      out.write("      margin-top:20px;\r\n");
      out.write("    }\r\n");
      out.write("    button:hover {\r\n");
      out.write("        box-shadow: 0px 0px 5px 2px black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    img{\r\n");
      out.write("      width: 70px;\r\n");
      out.write("      height: 70px;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <img\r\n");
      out.write("            alt=\"Logo\"\r\n");
      out.write("            src=\"../images/logo.png\"\r\n");
      out.write("        />\r\n");
      out.write("        <h1>Premature</h1>\r\n");
      out.write("        <br />\r\n");
      out.write("        <h2>Baby Monitor</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <form action=\"/logout\">\r\n");
      out.write("            <button type=\"submit\">\r\n");
      out.write("                <img src=\"../images/exit.png\" alt=\"LogOut\"/>\r\n");
      out.write("              </button>\r\n");
      out.write("          </form>\r\n");
      out.write("    <span class=\"text05\">\r\n");
      out.write("        <span>Patient ID: ");
      out.print(patient.getId());
      out.write("</span>\r\n");
      out.write("    </span>\r\n");
      out.write("    <span class=\"text07\">\r\n");
      out.write("        <span>");
      out.print(patient.getHospital());
      out.write("</span>\r\n");
      out.write("    </span>\r\n");
      out.write("    <form action=\"/\">\r\n");
      out.write("        <button type=\"submit\" class=\"home-btn\">\r\n");
      out.write("            <img src=\"../images/house.jpg\" alt=\"Home\"/>\r\n");
      out.write("        </button>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <main id=\"main-holder-1\">\r\n");
      out.write("        <span class=\"text21\"><span>NEW MEASUREMENT AND COMMENT</span></span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form id=\"form\" action=\"/patient/add?id=");
      out.print(patient.getId());
      out.write("\" method=\"post\">\r\n");
      out.write("            <input name=\"measurement\" id=\"username-field\" class=\"measurement-form-field\" placeholder=\"Measurement (mmol)\">\r\n");
      out.write("            <input name=\"comment\" id=\"comment-field\" class=\"comment-form-field\" placeholder=\"Comment\">\r\n");
      out.write("            <input type=\"time\" name=\"time\" class=\"measurement-form-field\" style=\"top: 80%\" required>       \r\n");
      out.write("            <button class=\"save\" type=\"submit\">\r\n");
      out.write("                <span class=\"text17\"><span>Save</span></span>\r\n");
      out.write("            </button> \r\n");
      out.write("        </form>\r\n");
      out.write("        <span class=\"text11\"><span>mmol</span></span>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>");
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
