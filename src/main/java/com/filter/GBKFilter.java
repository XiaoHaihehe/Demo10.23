package com.filter;

import javax.servlet.*;
import java.io.IOException;

public class GBKFilter implements Filter {

	public void destroy() {
		System.out.println("过滤器销毁");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
		System.out.println("过滤器执行");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request,response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过滤器创建");
		
	}

}
