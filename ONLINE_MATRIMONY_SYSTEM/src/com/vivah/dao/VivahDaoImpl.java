/**
 * 
 */
package com.vivah.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.vivah.model.LoginInfo;
import com.vivah.model.User;

/**
 * @author Sj
 *
 */
public class VivahDaoImpl {

	public static String URI = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static String USERNAME = "matrimony";
	public static String PWD = "tiger";

	public void registerUser(User user){
		Connection con=null;
		PreparedStatement pstmt=null;
		Statement stmt;
		ResultSet rs;
		String sql="insert into user_info values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		try{
			System.out.println("Inside DAO");
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URI,USERNAME,PWD);
			pstmt=con.prepareStatement(sql);
			System.out.println("Inside DAO1");
			Integer rndm =  new Random().nextInt(10000);
			pstmt.setString(1,rndm+"" /*user.getUserId()*/);
			System.out.println(user.getfName());
			pstmt.setString(2, user.getfName());
			pstmt.setString(3, user.getlName());
			pstmt.setString(4, user.getGender());
			pstmt.setDate(5,new java.sql.Date(user.getDob().getTime()));
			pstmt.setString(6,user.getReligion());
			pstmt.setString(7,user.getState());
			pstmt.setString(8,user.getCity());
			pstmt.setString(9,user.getZodiac());
			pstmt.setString(10,user.getJob());
			pstmt.setString(11,user.getEducation());
			pstmt.setString(12,user.getEmailId());
			System.out.println("after email");
			pstmt.setInt(13,123);
			//pstmt.setLong(13,user.getPhoneNum());
			System.out.println("Inside DAO2");
			int row=pstmt.executeUpdate();
			if(row>0){
				//Successful
			}else{
				//Failed
			}
			System.out.println("Inside DAO3");
			pstmt.close();
			con.close();
		}catch(Exception e){
		}		
	}
	public int updateProfile(User user){
		Connection con=null;
		PreparedStatement pstmt=null;
		String sql="update user_info set FNAME=?,LNAME=?,GENDER=?,DOB=?,RELIGION=?,STATE=?,CITY=?,ZODIAC=?,JOB=?,EDUCATION=?,EMAIL=?,PHONENUM=? where USERID=? ";
		int rows=0;
		System.out.println("Inside DAO");
		try{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URI,USERNAME,PWD);
			pstmt=con.prepareStatement(sql);
			System.out.println("Inside DAO1");
			
			System.out.println(user.getfName());
			pstmt.setString(1, user.getfName());
			pstmt.setString(2, user.getlName());
			pstmt.setString(3, user.getGender());
			pstmt.setDate(4,new java.sql.Date(user.getDob().getTime()));
			pstmt.setString(5,user.getReligion());
			pstmt.setString(6,user.getState());
			pstmt.setString(7,user.getCity());
			pstmt.setString(8,user.getZodiac());
			pstmt.setString(9,user.getJob());
			pstmt.setString(10,user.getEducation());
			pstmt.setString(11,user.getEmailId());
			System.out.println("after email");
			pstmt.setInt(12,123);
			pstmt.setString(13, user.getUserId());
			rows=pstmt.executeUpdate();
		}catch(Exception e){
			
		}
		return rows;
	}
	public LoginInfo login (LoginInfo logininfo){
		String sql="select * from login_info where login_id="+logininfo.getLoginId()+" and password="+logininfo.getPassword() ;
		try{
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(URI,USERNAME,PWD);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				logininfo.setUserId(rs.getString("user_id"));
				return logininfo;
			}
		}catch(Exception e){
			
		}
		return  logininfo;
	}
	
	public List<User> viewAllProfile(User user){
		String sql="select * from user_info where gender!= "+user.getGender();
		List<User> viewAllList = new ArrayList<User>();
		try{
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(URI,USERNAME,PWD);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				User u= new User();
				u.setUserId(rs.getString("Userid"));
				u.setfName(rs.getString("fname"));
				u.setlName(rs.getString("lname"));
				u.setDob(rs.getDate("DOB"));
				u.setJob(rs.getString("JOB"));
				u.setCity(rs.getString("city"));
				u.setState(rs.getString("state"));
				u.setReligion(rs.getString("RELIGION"));
				
				
				
				viewAllList.add(u);
			}
		}catch(Exception e){
			
		}
		return viewAllList;
	}
	public User viewProfile(User user){
		String sql="select * from user_info where userid="+user.getUserId();
		User u= new User();
		try{
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(URI,USERNAME,PWD);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				u.setUserId(rs.getString("Userid"));
				u.setfName(rs.getString("fname"));
				u.setlName(rs.getString("lname"));
				u.setDob(rs.getDate("DOB"));
				u.setJob(rs.getString("JOB"));
				u.setCity(rs.getString("city"));
				u.setState(rs.getString("state"));
				u.setReligion(rs.getString("RELIGION"));
				u.setGender(rs.getString("Gender"));
				u.setZodiac(rs.getString("ZODIAC"));
				u.setEducation(rs.getString("Educiation"));
				u.setEmailId(rs.getString("email"));
				u.setPhoneNum(rs.getString("phonenum"));
				
				
				
				break;
			}
		}catch(Exception e){
			
		}
		return u;
	}
}
