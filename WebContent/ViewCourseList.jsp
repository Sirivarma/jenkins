<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=2>
		<tr>
			<th>Program Id
			<th>Program Name
			<th>Start Date
			<th>End Date
			<th>Session Per Week
			<th>Action</th>
		</tr>
		<c:forEach items="${list}" var="apply">
			<tr>
				<td>${apply.scheduledProgramId}
				<td>${apply.programName}
				<td>${apply.startDate}
				<td>${apply.endDate}
				<td>${apply.sessionPerWeek}
				<td><a href="applyCourse.obj">Apply</a></td>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>