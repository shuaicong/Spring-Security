/**
 * 
 */
package com.imooc.web.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午3:26:11
 */
@Component
public class Timeinterceptor implements HandlerInterceptor {

	/**
	 * @描述：
	 * @作者：alter
	 * @时间：2017年11月26日 下午3:26:11
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @throws Exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
		long start = (long) request.getAttribute("startTime");
		System.out.println("time interceptor 耗时：" + (new Date().getTime() - start));
		System.out.println("ex is :" + ex);
	}

	/**
	 * @描述：
	 * @作者：alter
	 * @时间：2017年11月26日 下午3:26:11
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @throws Exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle");
		long start = (long) request.getAttribute("startTime");
		System.out.println("time interceptor 耗时：" + (new Date().getTime() - start));
	}

	/**
	 * @描述：
	 * @作者：alter
	 * @时间：2017年11月26日 下午3:26:11
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object handle) throws Exception {
		System.out.println("preHandle");
		System.out.println(((HandlerMethod)handle).getBean().getClass().getName());
		System.out.println(((HandlerMethod)handle).getMethod().getName());
		request.setAttribute("startTime", new Date().getTime());
		return true;
	}

}
