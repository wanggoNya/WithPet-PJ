<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%-- 자바 빈즈 작성 규칙
   1. 클래스로 만들 때는 java.io.Serializable 인터페이스 구현해야 한다.
   2. 인수가 없는 기본 생성자가 있어야 한다.
   3. 모든 멤버 변수는 private으로 설정해야 한다.
   4. Getter/Setter() 메서드가 모든 변수에 존재 해야한다.
<jsp:useBean id ="member" class="com.dto.MemberBean" scope="page"/>

MemberBean member = (MemberBean) request.getAttribute("member");
         if(member == null) {
                  member = new MemberBean();
                  request.setAttrybute("member", member);
 --%>



<jsp:useBean id="date" class="java.util.Date" />
<!-- 자바빈즈로 date클래스를 사용하도록 useDate부름 -->
<%
out.print("오늘의 날짜와 시각"); // 문자열 출력
%>

<%=date%>
</body>
</html>