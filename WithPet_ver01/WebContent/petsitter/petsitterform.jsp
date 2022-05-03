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
<title>WithPet :: 위드펫</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="/assets/css/main.css" />
</head>
<body class="is-preload homepage">
				<!-- Bootstrap core CSS -->
				<!-- CSS only -->
				<link
					href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
					rel="stylesheet"
					integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
					crossorigin="anonymous">
				<!-- Bootstrap CSS -->
				<link rel="stylesheet"
					href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
					integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
					crossorigin="anonymous">
	<div id="page-wrapper">
				<link rel="stylesheet" href="/assets/css/main.css" />
		<%@ include file='/header.jsp'%>

		<!-- Banner -->
		<div id="banner-wrapper">
			<div id="banner" class="box container">
				<!--여기사이에  -->




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
							<h4 class="mb-3">펫시터 등록 신청</h4>
					<form action="petsitteradddb.jsp" method="post"
						enctype="multipart/form-data">

						<div class="form-group row">
							<label class="col-sm-2">펫시터 아이디</label>
							<div class="col-sm-3">
								<input type="text" name="id" class="form-control">
							</div>

							<div class="form-group row">
								<label class="col-sm-2">펫시터 설명</label>
								<div class="col-sm-3">
									<input type="text" name="content" class="form-control">
								</div>


								<div class="form-group row">
									<label class="col-sm-2" for="formFileSm">펫시터 이미지</label>
									<div class="col-sm-3">
										<input name="images" class="form-control form-control-sm"
											id="formFileSm" type="file">
									</div>
								</div>

								<div class="form-group row">
									<label class="col-sm-2" for="formFileSm">보유 자격증</label>
									<div class="col-sm-3">
										<input name="certificateds"
											class="form-control form-control-sm" id="formFileSm"
											type="file">
									</div>
								</div>


								<div class="form-group row">
									<label class="col-sm-2">펫시터 주소</label>
									<div class="col-sm-3">
										<input type="text" name="address" class="form-control">
									</div>

								</div>

								<div class="form-group row">
									<label class="col-sm-2">펫시터 연락처</label>
									<div class="col-sm-3">
										<input type="text" name="phoneNumber" class="form-control">
									</div>

								</div>

							</div>
						</div>

						<div class="form-group row" align="center">
							<div class="col-sm-6">
								<input type="submit" class="btn btn-primary" value="등록">
								<input type="reset" class="btn btn-danger" value="취소">
							</div>
						</div>

					</form>
				</div>
									<footer class="my-3 text-center text-small">
						<p class="mb-1">&copy;</p>
					</footer>
				</div>
</body>
<script>
function findAddr(){
	new daum.Postcode({
        oncomplete: function(data) {
        	
        	console.log(data);
        	
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var jibunAddr = data.jibunAddress; // 지번 주소 변수
            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('member_post').value = data.zonecode;
            if(roadAddr !== ''){
                document.getElementById("member_addr").value = roadAddr;
            } 
            else if(jibunAddr !== ''){
                document.getElementById("member_addr").value = jibunAddr;
            }
        }
    }).open();
}
</script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>


</body>
</html>
</main>

<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>


<!--여기사이에  -->
</div>
</div>


<%@ include file='/footer.jsp'%>

</body>
</html>