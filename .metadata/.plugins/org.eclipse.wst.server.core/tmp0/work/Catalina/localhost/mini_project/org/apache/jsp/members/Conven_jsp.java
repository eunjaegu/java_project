/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2024-07-19 05:10:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.members;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Conven_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/java_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mini_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1712542756981L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>주변정보</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("     <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"../style/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../style/css/icomoon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../style/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div class=\"hero-wrap\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/bg.jpg');\">\r\n");
      out.write("      <div class=\"overlay\"></div>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row no-gutters slider-text d-flex align-itemd-end justify-content-center\">\r\n");
      out.write("          <div class=\"col-md-9 ftco-animate text-center d-flex align-items-end justify-content-center\">\r\n");
      out.write("          	<div class=\"text\">\r\n");
      out.write("	            <p class=\"breadcrumbs mb-2\"><span class=\"mr-2\">Nearby</span> <span>Information</span></p>\r\n");
      out.write("	            <h1 class=\"mb-4 bread\">주변정보</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("	<br><br>\r\n");
      out.write("    <section class=\"ftco-section\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row d-flex\">\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/burgerking.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3 d-block\">\r\n");
      out.write("               <h3 class=\"heading mt-3\">Burgerking is king~ 이름이 버거'킹' 이라고 불리는 이유가 있는 유명 햄버거 프랜차이즈 버거킹.</h3>               \r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3 ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p  class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/youktang.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">해장이 필요하거나 진한 국물이 먹고 싶을 때! 화곡역 인근 맛집 육탕상점.</h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/seoul_center.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">실무 SW교육을 듣고 싶을 때? 대한민국 최고의 강사가 교육하는 대한상공회의소 403호.</h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/market.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">여행지에서 필요한 물품이 없어서 곤란하셨죠? GS25, CU 입점! </h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/hotspring.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3 d-block\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">피곤을 날려줄 까치산 지하암반수 온천. 1000평 크기의 대형 편의시설 구비. </h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/airport.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">접근성이 좋은 대중교통의 중심지. 우리집에 놀러와 Hotel~ 화곡역, 김포공항으로 쉬운 접근성.</h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3 ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/hospital.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">위급상항시 상시 이용 가능한 권역응급으료센터 화곡병원. 우리집에 놀러와 Hotel 맞은편.</h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-3  ftco-animate\">\r\n");
      out.write("            <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("              <p class=\"block-20\" style=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style/images/grandcanyon.jpg');\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <div class=\"text mt-3\">\r\n");
      out.write("                <h3 class=\"heading mt-3\">멋진 풍경을 자랑하는 세계적인 관광지 Grand Canyon! 도보 20분, 자차 5분 거리 위치</h3>\r\n");
      out.write("                <div class=\"meta mb-3\">\r\n");
      out.write("                  <div>April 9, 2024</div>\r\n");
      out.write("                  <div>관리자</div>\r\n");
      out.write("                  <div><span class=\"icon-chat\"></span> 3</div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("  <script src=\"../style/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("  <script src=\"../style/js/jquery.stellar.min.js\"></script>\r\n");
      out.write("  <script src=\"../style/js/owl.carousel.min.js\"></script>\r\n");
      out.write("  <script src=\"../style/js/aos.js\"></script>\r\n");
      out.write("  <script src=\"../style/js/scrollax.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script src=\"../style/js/main.js\"></script>\r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/Footer.jsp", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /members/Conven.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /members/Conven.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/members/Conven.jsp(4,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}