<!-- 
1. 그림바꾸기
2.아이디 비번 찾기 버튼 만들기 
3. pjlogin.jsp 에 form 을 더한 버젼
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
<link rel="stylesheet" href="main.css">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/blog/">
    <script src="header.html"></script>
    <script src="footer.html"></script>

    <body>
      <!-- Bootstrap core CSS -->
      <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<div class="image-box" src="img/main5.png">
</div>
<div class="container" >
  <div class="p- p-md-5 mb-4 text-white rounded " style="background-color: peachpuff;">





<main class="form-signin">
  <form action="logindb.jsp" method="POST">
    <img class="mb-4" src="https://austin.sogang.ac.kr/dataview/board/editor/20190703_1113_3410001.jpg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">with PET</h1>

    <div class="form-floating">
      <input type="text" name = "uid" class="form-control" id="floatingInput" placeholder="아이디">
      <label for="floatingInput"></label>
    </div>
    <div class="form-floating">
      <input type="password" name = "upw" class="form-control" id="floatingPassword" placeholder="암호">
      <label for="floatingPassword"></label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> 로그인 기억
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; Austin 2022</p>
  </form>
</main>







       </div>
       </div>
</main>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>