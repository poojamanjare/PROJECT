/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2017-07-24 05:31:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1500868533392L));
    _jspx_dependants.put("jar:file:/E:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/e-Nature/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1492505852000L));
    _jspx_dependants.put("jar:file:/E:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/e-Nature/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1500868434285L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1500435569284L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar", Long.valueOf(1500282486995L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/social-icon.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("    <!--    <a class=\"navbar-brand\" href=\"#\">e-NATURE</a>-->\r\n");
      out.write("      <img src=\"resources/images/logo1.jpg\" style=\"width:30%;height:30%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- ==============Collect the nav links ==========================-->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"></li>\r\n");
      out.write("        <li ><a href=\"index\">Home</a></li>\r\n");
      out.write("        \r\n");
      out.write("        <!--dropdown option for products -->\r\n");
      out.write("        <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Product Category<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Orchids Plants</a></li>\r\n");
      out.write("          <li><a href=\"#\">Rose Plants</a></li>\r\n");
      out.write("          <li><a href=\"#\">Marigold Plants</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("        <li><a href=\"contactus\">Contact Us</a></li>\r\n");
      out.write("         <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("         <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/adding\">Admin</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      <!-- =================Right-align navigation bar================ -->\r\n");
      out.write("     <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\r\n");
      out.write("      <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/goToLogin\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("      <!-- ==================End================================================ -->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("  \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-image: url(\"resources/images/wall2.jpg\");\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, intial-scale=1\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/social-icon.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>E-Nature</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- <nav class=\"navbar navbar-inverse\" role=\"navigation\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("       <a class=\"navbar-brand\" href=\"#\">e-NATURE</a>\n");
      out.write("      <img src=\"images\\logo1.jpg\" style=\"width:30%;height:30%\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ==============Collect the nav links ==========================\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"></li>\n");
      out.write("        <li ><a href=\"#\">Home</a></li>\n");
      out.write("        \n");
      out.write("        dropdown option for products\n");
      out.write("        <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Product Category<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"#\">Orchids Plants</a></li>\n");
      out.write("          <li><a href=\"#\">Rose Plants</a></li>\n");
      out.write("          <li><a href=\"#\">Marigold Palnts</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("         <li><a href=\"#\">About Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("      =================Right-align navigation bar================\n");
      out.write("     <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("      ==================End================================================\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>/.navbar-collapse\n");
      out.write("  </div>/.container-fluid\n");
      out.write("</nav>\n");
      out.write(" -->\n");
      out.write("<!-- \n");
      out.write("<div class= \"col-lg-12\" style=\"background-color:pink;\">NIIT</div>\n");
      out.write("<div class= \"col-lg-12\" style=\"background-color:pink;\">LTD</div>\n");
      out.write("<div class= \"col-lg-12\" style=\"background-color:pink;\">INDIA</div> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ==========================Carousel slider=================================== -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("<ol class=\"carousel-indicators\">\n");
      out.write("<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("<li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("<li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"active\"></li>\n");
      out.write("</ol>\n");
      out.write("\n");
      out.write("<div class=\"carousel-inner\">\n");
      out.write("<div class=\"carousel-inner\" role=\"listbox\" style=\" width:100%; height: 500px !important;\">\n");
      out.write("<div class=\"item active\">\n");
      out.write("<img src=\"resources/images/p8.jpg\" style=\"width:100%; height:50%\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"item\">\n");
      out.write("<img src=\"resources/images/flower.jpg\" style=\"width:100%;height:50%\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"item\">\n");
      out.write("<img src=\"resources/images/p9.jpeg\" style=\"width:100%;height:20%\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("<span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("<span class=\"sr-only\">Previous</span>\n");
      out.write("</a>\n");
      out.write("<a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("<span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("<span class=\"sr-only\">Next</span>\n");
      out.write("</a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- ================================================================= -->\n");
      out.write("<!-- <div class =\"container\">\n");
      out.write("<div class = \"jumbotron\">\n");
      out.write("<p style=\"font-size:50px; color:#538b01; font-weight:bold; font-style:italic;\">\n");
      out.write("Welcome to<span style=\"color: #ff0000\"> e-NATURE</span></p>\n");
      out.write("</div>\n");
      out.write("</div> -->\n");
      out.write("<!-- ================================================================= -->\n");
      out.write("<!-- <div class=\"conatiner\">\n");
      out.write("<p><a href=\"#\"><span class=\"glyphicon glyphicon-envolope\"></span></a><p>\n");
      out.write("</div> -->\n");
      out.write("<!--\n");
      out.write("<div class=\"container\">\n");
      out.write("<table class=\"table table-striped\">\n");
      out.write("<tr>\n");
      out.write("<th> Sr.No.</th> <th> Product Name</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th> 1</th> <th> rose</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th> 2</th> <th> marigold</th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>-->\n");
      out.write("<br><br>\n");
      out.write("<!-- =====================Images below Slider================================================ -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<div style=\"overflow:auto; background-color: white\">\n");
      out.write("<div class= \"col-lg-4\">\n");
      out.write("<img src=\"resources/images/p1.jpg\" width=\"350\" height=\"250\"/></div>\n");
      out.write("<div class= \"col-lg-4\">\n");
      out.write("<img src=\"resources/images/p2.jpg\" width=\"350\" height=\"250\"/></div>\n");
      out.write("<div class= \"col-lg-4\">\n");
      out.write("<img src=\"resources/images/p3.jpg\" width=\"350\" height=\"250\"/></div>\n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("<!-- ====================================================================================== -->\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div>\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css-file/social-icon.css\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"social-icon.css\"> -->\r\n");
      out.write("<title>Footer</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--=========================== Bottom navbar========================== -->\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-bottom\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("    <!--   <li class=\"active\"><a href=\"#\">About Us</a></li> -->\r\n");
      out.write("      <a href=\"#\" class=\"fa fa-facebook\"></a>\r\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-twitter\"></a>\r\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-google\"></a>\r\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-linkedin\"></a>\r\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-youtube\"></a>\r\n");
      out.write("      <a href=\"#\" class=\"fa fa-instagram\"></a>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- ===========================End===================================== -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- <!-- =========================== Bottom navbar==========================\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-bottom\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">About Us</a></li>\n");
      out.write("      <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-google\"></a>\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-linkedin\"></a>\n");
      out.write("\t  <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("      <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("===========================End===================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
