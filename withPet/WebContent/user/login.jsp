<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    <script type="text/javascript">
    function CheckForm(Join){
        
        //체크박스 체크여부 확인 [하나]
        var chk1=document.frmJoin.U_checkAgreement1.checked;
        var chk2=document.frmJoin.U_checkAgreement2.checked;
        var chk3=document.frmJoin.U_checkAgreement2.checked;
        var chk4=document.frmJoin.U_checkAgreement2.checked;
        var animalType;
        if(!chk1){
        	chk1=0;
           	animalType+=chk1;
        }else if(!chk2){
        	chk2=0;
        }
        if(!chk2) {
            alert('약관2에 동의해 주세요');
            return false;
        }

        //체크박스 체크여부 확인 [동일 이름을 가진 체크박스 여러개일 경우]
        var isSeasonChk = false;
        var arr_Season = document.getElementsByName("SEASON[]");
        for(var i=0;i<arr_Season.length;i++){
            if(arr_Season[i].checked == true) {
                isSeasonChk = true;
                break;
            }
        }
    
        if(!isSeasonChk){
            alert("계절의 종류를 한개 이상 선택해주세요.");
            return false;
        }

    }


 </script>
[출처] [javascript] Checkbox : 체크박스 체크여부 확인|작성자 자바킹

    
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
</head>
 <body class="text-center">
    <link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">


	
<main class="form-signin">
  <form action="logindb.jsp" method="post">
    <img class="mb-4" src="\flower.jpg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">로그인 하세요</h1>

    <div class="form-floating">
      <input type="text" class="form-control" name="uid" id="floatingInput" placeholder="">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" name="upw" id="floatingPassword" placeholder="">
      <label for="floatingPassword">비밀번호</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> 아이디 기억하기
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; mjs 2022</p>
  </form>
</main>



	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
    
  </body>
</html>