<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1 align="center">Hello Manager!</h1><br/><br/>
	
	<div id="create-div">
		<form action="create" method="post">
			Name:<input type="text" name="add-name"><br> 
			Salary:<input type="text" name="add-salary"><br> 
			<input type="submit" value="Add Employee" id="add-submit">
		</form>
	</div>
	
	<br/>
	<div id="read-div">
		<form action="read" method="post">
			Read Employee with ID:<input type="text" name="read-id"><br>
			<input type="submit" value="Read Employee" id="read-submit">
		</form>
	</div>
	
	<br/><br/><br/>
	<div id="update-div">
		<form action="update" method="post">
			Change salary of Employee with ID:<input type="text" name="update-id"><br>
			to:<input type="text" name="update-salary"><br> 
			<input type="submit" value="Update Employee" id="update-submit">
		</form>
	</div>
	
	<br/>
	<div id="delete-div">
		<form action="delete" method="post">
			Delete Employee with ID:<input type="text" name="delete-id"><br>
			<input type="submit" value="Delete" id="delete-submit">
		</form>
	</div>
	<!-- <a href="<c:url value = "/employees"/>">Go to tweets</a> -->
	<style>
	#create-div{
		border-style: solid;
		border-color: gray;
		border-radius:2px;
		height: 110px;
		width: 450px;
		margin-left:3%;
	}
	#create-div form{
		margin-top:3%;
		margin-left:15%;
	}
	#create-div form input{
		margin-top:0.5%;
	}
	#add-submit{
		margin-left:26%;
		margin-top:10px !important;
		font-size:16px;
	}
	
	
	#read-div{
		border-style: solid;
		border-color: rgb(255, 102, 0);
		border-radius:2px;
		height: 90px;
		width: 500px;
		margin-left:40%;
		margin-top:-8.5%;
	}
	#read-div form{
		margin-top:3%;
		margin-left:15%;
	}
	#read-div form input{
	margin-top:0.5%;
	}
	#read-submit{
		font-size:16px;
		margin-top:3.5% !important;
		margin-left:20%;
	}
	
	#update-div{
		border-style: solid;
		border-color: rgb(0, 92, 230);
		border-radius:2px;
		height: 100px;
		width: 600px;
		margin-left:3%;
	}
	#update-div form{
		margin-top:3%;
		margin-left:14%;
	}
	#update-div form input{
	margin-top:0.5%;
	}
	#update-submit{
		font-size:16px;
		margin-left:30%;
		margin-top:1% !important;
	}
	
	#delete-div{
		border-style: solid;
		border-color: rgb(0, 153, 153);
		border-radius:2px;
		height: 90px;
		width: 600px;
		margin-left:50%;
		margin-top:-9%;
	}
	#delete-div form{
		margin-top:3%;
		margin-left:14%;
	}
	#delete-div form input{
	margin-top:0.5%;
	}
	#delete-submit{
		font-size:16px;
		margin-left:30%;
		margin-top:3% !important;
	}
	
</style>
</body>
</html>