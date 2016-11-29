<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="http://getbootstrap.com/dist/css/bootstrap.css"
	rel="stylesheet">
<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
	rel="stylesheet">
<style type="text/css">
@import
url(
"<spring:url value="
/
css
/style.css"/>");
</style>
</head>
<body>
	<div class="container">
		<div class="pull-right">
			<a href="?language=en">English</a>|<a href="?language=ar">Arabic</a>
		</div>
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li><a href="<spring:url value="/"/>">Home</a></li>


			</ul>
			<h3 class="text-muted">Ministry of Company Registration</h3>
		</div>


		<div class="jumbotron">
			<h1>ROC Website</h1>
			<p></p>
		</div>

		<div class="row">
			<h1>Registration Form</h1>
			<div class="jumbotron">
				<form:form modelAttribute="company" action="register" method="post"
					class="form-horizontal">
					<p>
						<form:errors path="*" cssStyle="color : red;" />
					</p>
					<div class="form-group">
						<label class="col-xs-3 control-label" for="companyName"> <spring:message
								code="company.companyName" text="Company Name:" /></label>
						<form:input class="col-xs-9 form-control" path="companyName"
							id="companyName" tabindex="1" />
					</div>
					<div class="form-group">
						<label class="col-xs-3 control-label" for="regId"><spring:message
								code="company.regId" text="Registration Number:" /></label>
						<form:input class="col-xs-9 form-control" path="regId" id="regId"
							tabindex="2" />
					</div>
					<div class="form-group">
						<label class="col-xs-3 control-label" for="registationDate"><spring:message
								code="company.registationDate" text="Registration Date:" /></label>
						<form:input type="date" class="col-xs-9 form-control"
							path="registationDate" id="registationDate" tabindex="3" />
					</div>
					<div class="form-group">
						<div class="col-xs-offset-3 col-xs-9">
							<input class="btn btn-default" type="submit" id="register"
								value="Register">
						</div>
					</div>
				</form:form>
			</div>

			<div class="footer"></div>

		</div>
</body>
</html>