package com.vivah.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vivah.model.User;
import com.vivah.web.ProfileUpdate;
import com.vivah.web.RegistrationAction;

/**
 * Servlet implementation class Controller
 */
@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		
		if(uri.endsWith("login.do")){
			//Login
			RegistrationAction action = new RegistrationAction();
			int success=action.login(request);
			if(success==1){
				
			}else{
				
			}
		}else if(uri.endsWith("search.do")){
			//Search
		}else if(uri.endsWith("registration.do")){
			RegistrationAction registrationAction = new RegistrationAction();
			System.out.println("Inside Action 11");
			User user = registrationAction.registerUser(request);
			System.out.println("Inside Action");
			request.getRequestDispatcher("/pages/registration.jsp").forward(request, response);
		}else if(uri.endsWith("logout.do")){
			//Logout
		}else if(uri.endsWith("updateProfile.do")){
			ProfileUpdate profileUpdate = new ProfileUpdate();
			int rows=profileUpdate.updateMyProfile(request);
			if(rows>0){
				
			}
		}else if(uri.endsWith("otherProfile.do")){
			String viewId=(String)request.getAttribute("view");
			//
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		doGet(request, response);
	}

}
