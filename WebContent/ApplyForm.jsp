<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register  </h1>
<table border=2>
<sf:form action="applyAction.obj" method="post" modelAttribute="apply">
<tr><td>Enter Full Name:</td><td> <sf:input path="fullName"/></td></tr>
<tr><td>Enter Date Of Birth: </td><td><sf:input path="dateOfBirth"/></td></tr>
<tr><td>Enter Your Highest Qualification:</td><td><sf:input path="highestQualification"/></td></tr>
<tr><td>Enter Marks Obtained:</td><td> <sf:input path="marksObtained"/></td></tr>
<tr><td>Scheduled Program Id</td><td><sf:input  readonly="readonly" path="ScheduledProgramId"/></td></tr>
<tr><td>Enter Goals: </td><td><sf:input path="goals"/></td></tr>
<tr><td>Enter your Email Id:</td><td> <sf:input path="emailId"/></td></tr>

<tr><td><input type="submit" value="Apply"></td></tr>
</sf:form>
</table>
</body>
</html>