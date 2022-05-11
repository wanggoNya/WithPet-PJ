<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<script type="text/javascript"> 
		if(confirm('정말 로그아웃 하시겠습니까?')) {
			<%
			session.removeAttribute("id"); //세션 객체에서 id값을 제거 
			%>
			location.href = "/user/login.jsp";
		}else{
			location.href = "/main/main.jsp";
		}
</script>