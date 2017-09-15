package com.vivah.web;

import javax.servlet.http.HttpServletRequest;

import com.vivah.model.User;

public class ProfileUpdate {

	public int updateMyProfile(HttpServletRequest request){
		
		User user = new User();
		user.setfName(request.getParameter(""));
		user.setlName(request.getParameter(""));
		user.setGender(request.getParameter(""));
		user.setCity(request.getParameter(""));
		user.setEducation(request.getParameter(""));
		user.setEmailId(request.getParameter(""));
		user.setState(request.getParameter(""));
		user.setReligion(request.getParameter(""));
		user.setJob(request.getParameter(""));
		user.setPhoneNum(request.getParameter(""));
		return 1;
	}
}
