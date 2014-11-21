package com.gionee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet4AndroidClient
 */
@WebServlet("/Login.do")
public class LoginServlet4AndroidClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet4AndroidClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("--Get--");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("--Post--");
		request.setCharacterEncoding("UTF-8");
		String loginName = request.getParameter("loginName");
		String loginPwd = request.getParameter("loginPwd");
		
		System.out.println(loginName);
		System.out.println(loginPwd);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//返回
		PrintWriter out = null;
		try{
			out = response.getWriter();
			if(loginName.equals("tom") && loginPwd.equals("123")){
				//登陆成功，返回
				out.print("成功");
			}else{
				//登陆失败，返回
				out.print("失败");
			}
		}finally{
			if(out != null){
				out.close();
			}
		}
	}

}
