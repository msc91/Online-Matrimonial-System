/**
 * 
 */
package com.vivah.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.vivah.dao.VivahDaoImpl;
import com.vivah.model.LoginInfo;
import com.vivah.model.User;

/**
 * @author SJ
 *
 */
public class RegistrationAction {

	private VivahDaoImpl daoImpl;
	public User registerUser(HttpServletRequest request){
		User user=new User();
		user.setfName((String)request.getParameter("fname"));
		user.setlName((String)request.getParameter("lname"));
		
		String strDate = (String)request.getParameter("birth");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setDob(date);
		user.setGender((String)request.getParameter("gender"));
		user.setState((String)request.getParameter("state"));
		user.setCity((String)request.getParameter("city"));
		user.setJob((String)request.getParameter("job"));
		user.setReligion((String)request.getParameter("religion"));
		user.setZodiac((String)request.getParameter("zodiac"));
		user.setEmailId((String)request.getParameter("email"));
		user.setEducation((String)request.getParameter("education"));
		user.setPhoneNum(request.getParameter("mobile"));
		//user.setPhoto((String)request.getParameter(""))
		daoImpl=new VivahDaoImpl();
		daoImpl.registerUser(user);
		System.out.println("After Dao in action");
		//Validation
		//Successful Registration
		return user;
	}
	
	public int login(HttpServletRequest request){
		int success=0;
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setLoginId(request.getParameter(""));
		loginInfo.setPassword(request.getParameter(""));
		loginInfo.setUserId(null);
		VivahDaoImpl vivahDaoImpl = new VivahDaoImpl();
		loginInfo=vivahDaoImpl.login(loginInfo);
		if(loginInfo.getUserId()!=null){
			success=1;
		}
		return success;
	}
}
