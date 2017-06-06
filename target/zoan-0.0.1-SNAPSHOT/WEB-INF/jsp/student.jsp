<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat,01 Dec 2001 00:00:00 GMT">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="static/js/html5shiv.min.css"></script>
      <script src="static/js/respond.min.js"></script>
    <![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management</title>
</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading">Student</div>
		<div class="panel-body">

			<form role="student" action="student.do" method="POST">
				<div class="form-group">
					<input type="text" class="form-control" name="idStudent"
						placeholder="idStudent">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name="firtname"
						placeholder="firstname">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name="lastname"
						placeholder="lastname">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name="year"
						placeholder="year">
				</div>

				<div class="row">
					<div class="btn-group" role="group" aria-label="...">
						<button name="action" value="add" type="submit"
							class="btn btn-default">add</button>
						<button name="action" value="edit" type="submit"
							class="btn btn-default">edit</button>
						<button name="action" value="delete" type="submit"
							class="btn btn-default">delete</button>
						<button name="action" value="search" type="submit"
							class="btn btn-default">search</button>
					</div>
				</div>
			</form>
			<br>
			<div class="table-responsive">
				<table class="table">
					<thead>
						<tr>
							<th>Id</th>
							<th>Firstname</th>
							<th>Lastname</th>
							<th>Year</th>
						</tr>
					</thead>
					<tbody>
						<C:forEach items="${studentList}" var="student">
							<tr>
								<td>${student.idStudent}</td>
								<td>${student.firtname}</td>
								<td>${student.lastname}</td>
								<td>${student.year}</td>
							</tr>
						</C:forEach>
					</tbody>
				</table>
			</div>
		</div>

		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="static/jquery/1.12.4/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="static/js/bootstrap.min.js"></script>
</body>
</html>