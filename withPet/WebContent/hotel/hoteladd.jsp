<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
   Verti by HTML5 UP
   html5up.net | @ajlkn
   Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
   <head>
      <title>WithPet :: 위드펫 </title>
      <meta charset="utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
      <link rel="stylesheet" href="assets/css/main.css" />
   </head>
   <body class="is-preload homepage">
      <div id="page-wrapper">

         <%@ include file='header.jsp' %>
         
         <!-- Banner -->
            <div id="banner-wrapper">
               <div id="banner" class="box container">
                  <!--여기사이에  -->
                        
                              <!-- Bootstrap core CSS -->
      <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">




<style>

  .input-form {
    max-width: 680px;

    margin-top: 80px;
    padding: 32px;

    background: #fff;
    -webkit-border-radius: 10px;
    -moz-border-radius: 10px;
    border-radius: 10px;
  }
</style>
<div class="container">
  <div class="input-form-backgroud row">
    <div class="input-form col-md-12 mx-auto">
      <h4 class="mb-3">호텔 등록 신청</h4>
      
      <form action="hoteladddb.jsp" method="post" class="validation-form" enctype="multipart/form-data"  novalidate >
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="name">호텔명</label>
            <input name="name" type="text" class="form-control" id="name" placeholder="" value="" required>
            <div class="invalid-feedback">
              호텔 이름을 입력해주세요.
            </div>
          </div>
         
        </div>

        <div class="mb-3">
          <label for="address">주소</label>
          <input name="address" type="text" class="form-control" id="name" placeholder="서울특별시 강남구 역삼로 23번길 23-11" required>
          <div class="invalid-feedback">
            주소를 입력해주세요.
          </div>
        </div>
                 <div class="mb-3">
          <label for="phoneNumber">호텔 대표 전화 번호<span class="text-muted">&nbsp;</span></label>
          <input name="phoneNumber" type="text" class="form-control" id="address2" placeholder="000-000-0000">
          
        </div>
         
<div class="mb-3">
  <label for="formFileSm" class="form-label">호텔 사진 등록</label>
  <input name="covers" class="form-control form-control-sm" id="formFileSm" type="file">
</div>

<div class="mb-3">
          <label for="email">상세정보</label>
          <input name="content" type="text" class="form-control" id="email" placeholder="상세정보를 입력하세요" required>
          <div class="invalid-feedback">
            상세정보를 입력하세요.
          </div>
        </div>
        
        
 <div class="mb-3">
          <label for="email">가격<span class="text-muted">&nbsp;(1박 기준)</span></label>
          <input name="price" type="text" class="form-control" id="email" placeholder="" required>
          <div class="invalid-feedback">
            가격을 입력해주세요.
          </div>
        </div>
        
        <div class="mb-3">
  <label for="formFileSm" class="form-label">위탁 가능 동물종 선택<span class="text-muted">&nbsp;(복수 선택 가능)</span></label>
  
<div class="form-check">
  <input name="dog"  type="checkbox">
  <label class="form-check-label" for="flexCheckDefault">
    강아지  &nbsp &nbsp
  </label>

  <input name="cat" type="checkbox">
  <label class="form-check-label" for="flexCheckChecked">
    고양이	&nbsp &nbsp
  </label>
  
  <input name="bird" type="checkbox">
  <label class="form-check-label" for="flexCheckDefault">
    새  &nbsp &nbsp 
  </label>

  <input name="etc" type="checkbox">
  <label class="form-check-label" for="flexCheckChecked">
    그외 동물
  </label>
</div>
  
</div>
</div>
        </div>


       
        <hr class="mb-4">
        <div class="custom-control custom-checkbox">
          <input type="checkbox" class="custom-control-input" id="aggrement" required>
          <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
        </div>
        <div class="mb-4"></div>
        
<button type="submit" class="btn btn-light btn-lg btn-block">가입완료</button>
      </form>
    </div>
  </div>
  
  <footer class="my-3 text-center text-small">
    <p class="mb-1">&copy;</p>
  </footer>
</div>
<script>
  window.addEventListener('load', () => {
    const forms = document.getElementsByClassName('validation-form');

    Array.prototype.filter.call(forms, (form) => {
      form.addEventListener('submit', function (event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }

        form.classList.add('was-validated');
      }, false);
    });
  }, false);
</script>
</body>
</html>
</main>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                        
                        
                  <!--여기사이에  -->
               </div>
            </div>


         <%@ include file='footer.jsp' %>

   </body>
</html>