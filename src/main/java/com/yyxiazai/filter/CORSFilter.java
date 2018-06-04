package com.yyxiazai.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ((HttpServletResponse)resp).addHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse)resp).addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        ((HttpServletResponse)resp).addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, is-login");
        ((HttpServletResponse)resp).addHeader("Access-Control-Max-Age", "1800");//30 min
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
