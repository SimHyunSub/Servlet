package kr.gudi;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {

	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");											//서블렛 오류 			입출력오류
		
		getParam(req);
		/*
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			
			String paramName = (String) names.nextElement();
			//System.out.println(paramName);
			
			String value = req.getParameter(paramName);
			System.out.println(paramName + " : " + value);
			}
		 */
		}
		//String key = req.getParameter("key");
		//System.out.println(key);
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("doPost");
		req.setCharacterEncoding("utf-8"); //post방식으로 보낼 때 한글깨짐 셋팅해주는 메소드 한글이 깨지는것은 Request를 의심해라 ! 
		getParam(req);
		/*
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			
			String paramName = (String) names.nextElement();
			//System.out.println(paramName);
			
			String value = req.getParameter(paramName);
			System.out.println(paramName + " : " + value);
			}
		 */
		
	}
	void getParam(HttpServletRequest req) {
		
		Enumeration<String> names = req.getParameterNames();
		while (names.hasMoreElements()) {
			
		String paramName = (String) names.nextElement();
		//System.out.println(paramName);
			
		String value = req.getParameter(paramName);
		System.out.println(paramName + " : " + value);
		
		}
	}

}
