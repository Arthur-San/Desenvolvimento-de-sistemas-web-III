package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidatar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    a:link, a:visited {\n");
      out.write("\t  \ttext-decoration: none; \n");
      out.write("\t\tcolor:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\ta:hover, a:active {\n");
      out.write("\t  \ttext-decoration: none;\n");
      out.write("\t\tcolor:gray;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    .titulos{\n");
      out.write("      text-align: left;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <title>Candidatar-se</title>\n");
      out.write("  </head>\n");
      out.write("  <body style=\"text-align: center;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  \t<!--CABEÇALHO-->  \t\t\n");
      out.write("  \t\t<div class=\"card text-center\">\n");
      out.write("\t\t  <div class=\"card-header\">\n");
      out.write("\t\t    <h1>VAGAS DE EMPREGO</h1>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\t\t  \n");
      out.write("\n");
      out.write("\n");
      out.write("  \t  <!--NAV-->\n");
      out.write("\t<div style=\"background-color: #01DFD7; padding: 0.5%\">\n");
      out.write("\t\t<div class=\"container\" name=\"nav\">\n");
      out.write("\t\t  <div class=\"row\">\n");
      out.write("\t\t  \t<div class=\"col\" >\n");
      out.write("\t\t      <a href=\"index.html\">Menu</a>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t    <div class=\"col\" >\n");
      out.write("\t\t      <a href=\"cadastrar-se.html\">Cadastrar-se</a>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t    <div class=\"col\" >\n");
      out.write("\t\t      <a href=\"pesquisar.html\">Pesquisar vagas</a>\n");
      out.write("\t\t    </div>\t\n");
      out.write("\n");
      out.write("\t\t    <div class=\"col\" >\n");
      out.write("\t\t      <a href=\"candidatar.html\">Candidatar-se</a>\n");
      out.write("\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t    <div class=\"col\" >\n");
      out.write("\t\t      <a href=\"renunciar.html\">Renunciar vaga</a>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--CONTEÚDO-->\t\n");
      out.write("\t<div class=\"jumbotron text-center\">\n");
      out.write("  <h1>ESCOLHA A SUA ÁREA!</h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div style=\"background-color: #33ffff; padding: 1%\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3><a href=\"#\">Ciências Biológicas</a></h3>\n");
      out.write("      <p>Lorem ipsum dolor..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3><a href=\"#\">Ciências Exatas</a></h3>\n");
      out.write("      <p>Lorem ipsum dolor..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <h3><a href=\"#\">Ciências Sociais</a></h3>\n");
      out.write("      <p>Lorem ipsum dolor..</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t<!--RODAPÉ-->\t\n");
      out.write("\t  \t<div class=\"card-body\" style=\"background-color: #01DFD7;\">\n");
      out.write("\t\t    <blockquote class=\"blockquote mb-0\">\n");
      out.write("\t\t      <p>DADOS DO RODAPÉ</p>\n");
      out.write("\t\t      <footer class=\"blockquote-footer\">OUTROS DADOS</footer>\n");
      out.write("\t\t    </blockquote>\n");
      out.write("\t  \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
