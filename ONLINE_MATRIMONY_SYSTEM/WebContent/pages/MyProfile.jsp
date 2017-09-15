<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Matrimony</title>
</head>
<body>
<h4>My Profile</h4>
<form action="updateProfile.do" method="post">
<table>
<tr><td>First Name:</td><td><input type="text" name="fname" id="fname" value="<%=%>"/></td></tr>
<tr><td>Last Name:</td><td><input type="text" name="lname" id="lname" value="<%=%>"/></td></tr>
<tr><td>Gender:</td><td><input type="text" name="gender" id="gender" value="<%=%>"/></td></tr>
<tr><td>Date of Birth:</td><td><input type="text" name="birth" id="birth" value="<%=%>"/></td></tr>
<tr><td>Religion:</td><td><input type="text" name="religion" id="religion" value="<%=%>"/></td></tr>
<tr><td>State:</td><td><input type="text" name="state" id="state" value="<%=%>"/></td></tr>
<tr><td>City:</td><td><input type="text" name="city" id="city" value="<%=%>"/></td></tr>
<tr><td>Zodiac:</td><td><input type="text" name="zodiac" id="zodiac" value="<%=%>"/></td></tr>
<tr><td>Job:</td><td><input type="text" name="job" id="job" value="<%=%>"/></td></tr>
<tr><td>Education:</td><td><input type="text" name="education" id="education" value="<%=%>"/></td></tr>
<tr><td>Email Id:</td><td><input type="text" name="email" id="email" value="<%=%>"/></td></tr>
<tr><td>Mobile Number</td><td><input type="text" name="mobile" id="mobile" value="<%=%>"/></td></tr>
<tr><td><input type="submit" value="Update"/></td></tr>
</table>
</form>
</body>
</html>