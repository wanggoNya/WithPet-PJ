<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 카카오 지도 담을 공간 생성 -->
<div id="map" style="width:500px;height:400px;"></div>

<%
   String lat=request.getParameter("lat");
   String lng=request.getParameter("lng");
%>

<!-- 실제 지도를 그리는 javascript API -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=246f7a71adaa58874899830150482f73"></script>

<!-- 지도를 띄우는 코드 작성 -->
<script type="text/javascript">
var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var options = { //지도를 생성할 때 필요한 기본 옵션
   center: new kakao.maps.LatLng(<%=lat%>,<%=lng%> ), //지도의 중심좌표.
   level: 3 //지도의 레벨(확대, 축소 정도)
};

var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
</script>
</body>
</html>