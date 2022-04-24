<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- setProperty 는 useBean 과 합께 자바빈즈의 Setter()매서드에 접근하여
자바 빈즈의 멤버변수인 프로퍼티의 값을 저장하는 태그이다. setProperty태그는 폼 페이지로부터
전달되는 요철 파라미터 값을 지접 저장하거나 자바 빈즈의 프로퍼티로 변겨앟여 값을 저장할수 있다.

속성
name - useBen 태그에 id 송성값으로 설정된 자바빈즈를 식별하기 위한 이름이다.
property - 자바 빈즈의 프로퍼티 이름이다. 이름에 '*'를 사용하면 모든 요청 파라미터가
자바빈즈 프로퍼티의 setter()매서드에 전달됨을 의미한다.
values - 변경할 자바빈즈의 프로퍼티 값이다. 만약 프로퍼티 값이 null 이거나 존재하지 않는 요청
인 경우에는 SetProperty 가 무시된다.
param - 요청 파라미터의 이름. param 과 values를동시에 모두 사용할수 없으면 하나만 선택하여 사용가능

 
<jsp:setProperty name="자바빈즈 이름" property="속성이름" value="값" />

<form action="memberdb.jsp" method="post">
	<input name = "id" value="admin">
</form>


 -->





</body>
</html>