<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.container {
  position: relative;
  border: 2px solid black;
  z-index: 1;
  outline-style:double;
  max-width: 500px;
  margin: auto;
  padding: 45px;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, intial-scale=1">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- <link rel="stylesheet" type="text/css" href="resources/css-file/register.css"> -->
<title>Contact Us</title>
</head>
<body>
<div class="container">
<h1 style="text-align: center;">Contact Form</h1>
<div class="col-md-12">
	<div class="row">
		<form name="frm1" method="post">
		<div class="col-lg-12">
                                <div class="form-part">
                                    <ul>
                                       <br><br>
                                            <div class="form-group shaddow">
                                                <div class="input-group">
                                                <label>Name</label>
                                                     <input type="text" class="form-control no-radius" name="fname" required="required"/>
                                                </div>
                                            </div>
                                       <br><br>
                                      
                                            <div class="form-group">
                                                <div class="input-group shaddow">
                                                <label>Email</label>
                                                    <input type="text" required="required" name="femail"  aria-describedby="inputGroupSuccess1Status" class="form-control no-radius"/>
                                                </div>
                                            </div>
                                        <br><br>
                                            <div class="form-group">
                                                <div class="input-group shaddow">
                                                <label>Mobile No.</label>
                                                   <input type="text" class="form-control no-radius" aria-describedby="inputGroupSuccess1Status"  name="fphone" required="required"/>
                                                </div>
                                            </div>
                                       <br><br>
                                       <label>Message</label>
                                            <textarea rows="4" class="form-control no-radius shaddow"></textarea>
                                        
                                        <br><br>
                                            <button type="button" class="btn btn-lg btn-info">Send</button>
                                      
                                    </ul>
                                </div>
                                </div>
                            </form>
	</div></div>
</div>
<br>
<br>
<div>
 <%@include file="footer.jsp" %> 
</div>
</body>
</html>