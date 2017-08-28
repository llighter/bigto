<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8" />

<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>whyNot SAMPLE</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
	});
</script>
</head>
<body>
	<table border="1">
		<tr>
			<th colspan="3">SAMPLE : MODEL</th>
		</tr>
		<c:forEach items="${sample }" var="sam" varStatus="status">
		<!-- .index는 0부터 시작하고 .count는 1부터 시작한다. -->
			<tr>
				<td>&nbsp;${status.count}&nbsp;</td>
				<td>&nbsp;${sam.model}</td>
				<td>&nbsp;${sample[status.index]}</td>
			</tr>
		</c:forEach>
	</table>
	
	<pre>
[ TODO ]
수정 사항 : project폴더 우클릭 -> Properties

수정 내용 :
- 프로젝트 오른쪽 버튼 클릭 -> Properties -> Java Build Path -> Libraries 에서 JavaSE1.6을 1.8로 변경
	Add Library -> JRE System Library -> 1.8 생성(기존 다운 및 연결해놓은 1.8최신버전이 있을 것이다.)
	Remove -> 1.6버전 제거

- 프로젝트 오른쪽 버튼 클릭 -> Properties -> Java Compiler
	설정에서 Compiler compliance level 을 1.8로 지정

- 프로젝트 오른쪽 버튼 클릭 -> Properties -> Project Facets
	Dynamic Web Module 을 3.0 으로, java는 1.8로 설정

- 프로젝트 오른쪽 버튼 클릭 -> Maven -> Update Project
	선택해서 설정 내용을 적용
	</pre>
</body>
</html>