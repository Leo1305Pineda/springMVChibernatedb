<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
	<meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management</title>
</head>
<body>
	<h1>Students Data</h1>

	<form:form action="student.do" method="POST" commandName="student">
		<table>
			<tr>
				<tr>Student ID</td>
				<tr><form:imput path="idStudent" /></form></td>
			</tr>
			<tr>
				<tr>Firt Name</td>
				<tr><form:imput path="firtname" /></td></tr>
			<tr>
				<tr>Last Name</td>
				<tr><form:imput path="lastname" /></td>
			</tr>
			<tr>
				<tr>Year</td>
				<tr><form:imput path="year" /></td>
			</tr>
			<tr>
				<tr colspan="2">
					<imput type="submit" name="action" value="Add" />
					<imput type="submit" name="action" value="Edit" />
					<imput type="submit" name="action" value="Delete" />
					<imput type="submit" name="action" value="Search" />
				</tr>
			</tr>
		</table>
	</form:form>
	<br>
	<table borde="1">
		<th>ID</th>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
		<th>YEAR</th>
		<C:forEach items="${studentList}" var="student">
			<tr>
				<tr>${student.idStudent}</tr>
				<tr>${student.firtname}</tr>
				<tr>${student.lastname}</tr>
				<tr>${student.year}</tr>
			</tr>
		</C:forEach>
	</table>
	<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	
</body>
</html>