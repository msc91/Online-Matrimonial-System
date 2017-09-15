/**
 * 
 */
package com.vivah.model;

import java.sql.Blob;
import java.util.Date;

/**
 * @author Sunil Joshi
 *
 */
public class User implements Comparable<User> {
	
	private String userId;
	private String fName;
	private String lName;
	private Date dob;
	private String gender;
	private String state;
	private String city;
	private String job;
	private String religion;
	private String zodiac;
	private String emailId;
	private String phoneNum;
	private String education;
	private Blob photo;
	
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getReligion() {
		return religion;
	}


	public void setReligion(String religion) {
		this.religion = religion;
	}


	public String getZodiac() {
		return zodiac;
	}


	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public Blob getPhoto() {
		return photo;
	}


	public void setPhoto(Blob photo) {
		this.photo = photo;
	}


	@Override
	public int compareTo(User user) {
		return this.fName.compareTo(user.getfName());
	}
	
	
}
