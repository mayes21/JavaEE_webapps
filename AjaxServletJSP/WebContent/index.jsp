<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Ajax</title>
<script src="http://code.jquery.com/jquery-1.10.1.min.js">
	</script>
<script>
            $(document).ready(function() {                        
                $('#submit').click(function(event){  
                    var username=$('#user2').val();
                    //alert(username);
                 $.get('ActionServlet',{user2:username},function(responseText) { 
                        $('#welcometext').text(responseText);         
                    });
                });
            });
    </script>
</head>
<body>
	<form id="form1">
		<h1>Demo -> Ajax [Jquery], JSP, Servlet</h1>
		SAisissez votre nom : <input type="text" id="user2" /> <input type="button"
			id="submit" value="Ajax Submit" /> <br />
		<div><h1 id="welcometext"></h1></div>
	</form>


</body>
</html>