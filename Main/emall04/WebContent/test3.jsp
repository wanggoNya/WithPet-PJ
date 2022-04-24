<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko"> <!-- 코드언어 표시 == 웹 표준지침 준수 -->
<head>
<meta charset="UTF-8">
<title>회원가입</title> 
<link rel = "icon" href="image/wave.ico">
<style>
@import url("signUpCss3.css");
</style>
<!-- 자바스크립트(유효성검사 해당) -->
<script src ="signUpjs3.js"></script> 
<!-- 다음 우편번호찾기 API -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>

   <div id="wrap" class="wrapper">
      <form method ="post" name="join" id="join">
        <!-- 회원가입 타이틀부분 -->
         <header>
            <div id="header">
               <h1 class="h_loho">
                  <span><img alt="참치라이더 메인문구" src="image/main.png"></span>
                  <p>라이더 멤버가 되어주세요!!</p>
               </h1>
               </div>
         </header>

         <div id="container">
            <div class="row_group">
               <div class="userInput">
        <!-- 아이디 입력 -->
                  <h3 class="list">아이디<span id="idError"></span></h3>
                  <span class="box int_id" ><input type="text" id="id" class="int check"
                     maxlength="20"></span>
               </div>
               <div class="userInput">
        <!-- 비밀번호 입력 -->
                  <h3 class="list">비밀번호<span id="pwError"></span></h3>
                  <span class="box int_id"><input type="password" id="pw" class="int check"
                     maxlength="20"></span>
               </div>
        <!-- 비밀번호 재확인 입력 -->
               <div class="userInput">
                  <h3 class="list">비밀번호 재확인<span id="pwCheckError"></span></h3>
                  <span class="box int_id"><input type="password" id="pwCheck" class="int check" 
                     maxlength="20"></span>
               </div>
            </div>
               <div class="row_group">
        <!-- 성명 입력 -->
               <div class="userInput">
                  <h3 class="list">성명<span id="nameError"></span></h3>
                  <span class="box int_id"><input type="text" id="name" class="int check"
                     maxlength="20"></span>
               </div>
        <!-- 전화번호 입력 -->
               <div class="userInput">
                  <h3 class="list">전화번호("-" 제외)<span id="phoneNumError"></span></h3>
                  <span class="box int_id"><input type="text" id="phoneNum" class="int check"
                     maxlength="11"></span>
               </div>
        <!-- 주소 입력 -->
               <div class="userInput">
                  <h3 class="list">
                     자택주소<span id="addressError"></span>
                  </h3>
                  <div id="address" class="int_id">
                  <span>
                  <input type="text" id="sample4_postcode" class="d_form mini line addressCheck" placeholder="우편번호" readonly>
                  <input type="button" id="addressButton" class="d_form mini" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" readonly>
                  </span>
                  <input type="text" id="sample4_roadAddress" class="d_form mini line" placeholder="도로명주소" readonly>
                  <input type="text" id="sample4_jibunAddress" class="d_form mini line" placeholder="지번주소" readonly>
                  <span id="guide" style="color:#999;display:none"></span>
                  <input type="text" id="sample4_extraAddress" class="d_form mini line" placeholder="참고주소" readonly>
                  <input type="text" id="sample4_detailAddress" class="d_form mini line addressCheck" placeholder="상세주소" >
                  </div>
               </div>

