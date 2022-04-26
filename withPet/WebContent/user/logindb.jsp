<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String uid=request.getParameter("uid");
	String upw=request.getParameter("upw");
	
	UserDAO dao = new UserDAO();
	int result= dao.login(uid,upw);
	
	if(result==1){//실패 케이스 1 아이디와가 아예 없다
		response.sendRedirect("useradd.jsp");
	}else if(result==2){ //비번이 틀린 케이스
		response.sendRedirect("login.jsp");
	}else{//세션 성공
		//세션 설정 - > 제품 목록으로 보내자
		session.setAttribute("id", uid);
		response.sendRedirect("/product/productlist.jsp");
	}
	
	
	String dog=document.getElementById("DOG").checked;
	String 
	String cat=request.getParameter("CAT");	1or0
	String bird=request.getParameter("BIRD");
	String etc=request.getParameter("ETC");
	String animalType="";
	
	if(dog.getElementById("input_check").checked) {
	    document.getElementById("input_check_hidden").disabled = true;
	}

animalType=dog+cat+bird+etc;
		animalType +="1";
	}else{
		animalType +="0";
	}
	

%>