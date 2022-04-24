<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
   <%!// 선언문
   String title = "회원 가입";%>
   <!-- CSS only -->
   <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">

   <%@ include file="/_header.jsp"%>
   <div class="alert alert-secondary" role="alert">
      <div class="container">
         <h1 class="display-3" align="Center">
            <%=title%>
         </h1>
      </div>
   </div>
   <div class="container">
      <form action=".jsp" method="post">

         <div class="form-group row" >
            <label class="col-sm-2">아이디</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="uid" class="form-control">
            </div>

         </div>

            <label class="col-sm-2">암호</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="password" name="upw" class="form-control">
            </div>

         </div>
            <label class="col-sm-2">이름</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="uname" class="form-control">
            </div>

         </div>
            <label class="col-sm-2">성별</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <select class="form-select form-select-lg mb-3"
                  aria-label=".form-select-lg example">
                  <option selected>성별</option>
                  <option value="1">남성</option>
                  <option value="2">여성</option>
               </select>
            </div>

         </div>
            <label class="col-sm-2">생년월일</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="ubirth" class="form-control">
            </div>
         </div>
            <label class="col-sm-2">이메일</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="uemail" class="form-control">
            </div>
         </div>
            <label class="col-sm-2">전화번호</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="uphone" class="form-control" placeholder="010-1234-5678">
            </div>
         </div>
            <label class="col-sm-2">주소</label>
         <div class="form-group row">
            <div class="col-sm-3">
               <input type="text" name="uaddr" class="form-control">
            </div>
         </div>
         </div>



         <div class="form-group row" align="center">
            <div class="col-sm-60">
               <input type="submit" class="btn btn-primary" value="가입하기">
            </div>
         



      </form>
   </div>







   <%@ include file="/_footer.jsp"%>


   <!-- JavaScript Bundle with Popper -->
   <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"></script>


</body>
</html>