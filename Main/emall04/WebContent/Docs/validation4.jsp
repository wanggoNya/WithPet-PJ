<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 인지 여부 검사</title>
</head>
<body>

<script type ="text/javascript">
function CheckForm() {
	
	
	/* if(!isNaN(document.loginForm.id.value.substr(0,1))){ */
		
		var regExp = /Java/i;	// var regExp = new RegExp('java','i');
		var str = document.loginForm.title.value;
		var result = regExp.exec(str);
		alert(result[0]);
		
		
    	}
	form.submit();
	
}

</script>
<form action="Testdb.jsp" name="loginForm">
아이디 : <input type="text" name="title">
<input type="submit" onclick="CheckForm()">
</form>
</body>
</html>