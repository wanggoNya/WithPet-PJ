<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력</title>
</head>
<body>
<!-- CSS only -->


<div class = "container bg-warning shadow mx-auto mt-5 p-5 w-75">
<div class="alert alert-primary" role="alert">  
</div>

   <form class="row g-3" action="student_tableinput.jsp" method="post">
   
   
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">학번 :</label>
    <input type="text" name="hakbun" class="form-control" id="inputEmail4">
  </div>
  <br>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">학과 :</label>
    <input type="text" name="dept" class="form-control" id="inputPassword4">
  </div>
  <br>
  
  <div class="col-12">
    <label for="inputAddress" class="form-label">이름 :</label>
    <input type="text"  name="name" class="form-control" id="inputAddress" >
  </div>
  <br>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">주소 :</label>
    <input type="text"  name="addr" class="form-control" id="inputAddress2" >
  </div>
  <br>
   <div class="col-12">
    <label for="inputAddress2" class="form-label">연락처 :</label>
    <input type="text"  name="phone" class="form-control" id="inputAddress2" >
  </div>
 
 <br>
 
  <div class="col-12 text-center">
    <button type="submit" class="btn btn-primary">전송</button>
  </div>
  <br>
</form>
</div>
</body>
</html>