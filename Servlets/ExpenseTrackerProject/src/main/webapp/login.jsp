<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="components/all_css.jsp"%>
<style type="text/css">
	.card-sh{
		box-shadow: 0 0 6px 0 rgba(0, 0, 0, 0.3);
	}
</style>
</head>
<body class="bg-light">

	<%@include file="components/navbar.jsp"%>
	
	<div class="container p-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card card-sh">
					<div class="card-header">
						<p class="text-center fs-3">Register page</p>
					</div>
					
					<div class="card-body">
						<form>
							
							<div class="mb-3">
								<label>Email</label>
								<input type="email" name="uemail" class="form-control">
							</div>
							
							<div class="mb-3">
								<label>Password</label>
								<input type="Password" name="upassword" class="form-control">
							</div>
							
							<button class="btn btn-success col-md-12">Login Page</button>
							<div class="text-center mt-2">
								Don't have account <a href="register.jsp" class="text-decoration-none">create one</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>