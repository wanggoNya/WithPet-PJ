
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8");%>
<%
	// JDBC 드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
// DB연결
String url = "jdbc:mysql://localhost:3306/univ";
String id = "root";
String pw = "yeasd3676!";
Connection conn = null; // 디비 연결 객체
PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
conn = DriverManager.getConnection(url, id, pw);
// 테이블에 데이터 넣기 SQL
String hakbun = request.getParameter("hakbun");
String dept = request.getParameter("dept");
String name = request.getParameter("name");
String addr = request.getParameter("addr");
String phone = request.getParameter("phone");
String sql = "INSERT INTO student VALUES(?,?,?,?,?)"; // 넣는 데이터 종류 수만큼 물음표 삽입
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, hakbun);
pstmt.setString(2, dept);
pstmt.setString(3, name);
pstmt.setString(4, addr);
pstmt.setString(5, phone);
pstmt.executeUpdate();
// DB 연결 종료
if (pstmt != null)
	pstmt.close();
if (conn != null)
	conn.close();
out.print("Student 테이블 삽입이 성공했습니다.");
response.sendRedirect("studentinput_access.jsp");
%>
</body>
</html>