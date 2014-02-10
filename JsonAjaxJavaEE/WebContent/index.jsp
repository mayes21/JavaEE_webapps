<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JsonAjax Java EE demo</title>
<script src="http://code.jquery.com/jquery-1.10.1.min.js">
	
</script>
<script>
	$(document).ready(function() {
		$('#country').change(function(event) {
			var $country = $("select#country").val();
			$.get('ActionServlet', {
				countryname : $country
			}, function(responseJson) {
				var $select = $('#states');
				//alert(responseJson);
				$select.find('option').remove();
				$.each(responseJson, function(key, value) {
					//alert(key+" - "+value);
					$('<option>').val(key).text(value).appendTo($select);
				});
			});
		});
	});
</script>
</head>
<body>
	<h1>Ajax Json Java EE demo</h1>
	Select Country:
	<select id="country">
		<option>Select Country</option>
		<option value="India">India</option>
		<option value="US">US</option>
	</select>
	<br />
	<br /> 
	Select State:
	<select id="states">
		<option>Select State</option>
	</select>


</body>
</html>