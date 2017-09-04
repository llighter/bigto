<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8" />
<c:set var="Path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<c:import url="./structure/head.jsp" />
<body>
	<c:import url="./structure/nav.jsp" />
	<div class="simple-slider">
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide" style="background-image:url('${ Path }/resources/img/aboutus_crop.jpg');"></div>
                <div class="swiper-slide" style="background-image:url('${ Path }/resources/img/graph01_crop.jpg');"></div>
                <div class="swiper-slide" style="background-image:url('${ Path }/resources/img/analysis_crop.jpg');"></div>
            </div>
            <div class="swiper-pagination"></div>
            <div class="swiper-button-prev"></div>
            <div class="swiper-button-next"></div>
        </div>
    </div>
    <div class="article-list">
        <div class="container">
            <div class="intro">
                <h2 class="text-center">Latest Articles</h2>
                <p class="text-center">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet
                    vitae. </p>
            </div>
            <div class="row articles">
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="${ Path }/resources/img/aboutus01.jpg"></a>
                    <h3 class="name">About us</h3>
                    <p class="description">우리는 빅티오다 으갸갸갸</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="${ Path }/resources/img/graph.png" ></a>
                    <h3 class="name">Graph</h3>
                    <p class="description">네 똥폰의 하락세를 알아보자</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="${ Path }/resources/img/analysis01.jpg"></a>
                    <h3 class="name">Analysis</h3>
                    <p class="description">이렇게 요렇게 저렇게 분석하면 짠</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
            </div>
        </div>
    </div>
	<c:import url="./structure/footer.jsp" />
	<c:import url="./structure/scripts.jsp" />
</body>
</html>