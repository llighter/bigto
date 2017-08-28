<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8" />
<!DOCTYPE html>
<html>
<c:import url="./structure/head.jsp" />
<body>
	<c:import url="./structure/nav.jsp" />
	<div class="simple-slider">
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
                <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
                <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
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
                    <a href="#"><img class="img-responsive" src="assets/img/desk.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.
                        Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="assets/img/building.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.
                        Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
                <div class="col-md-4 col-sm-6 item">
                    <a href="#"><img class="img-responsive" src="assets/img/loft.jpg"></a>
                    <h3 class="name">Article Title</h3>
                    <p class="description">Aenean tortor est, vulputate quis leo in, vehicula rhoncus lacus. Praesent aliquam in tellus eu gravida.
                        Aliquam varius finibus est, interdum justo suscipit id.</p><a href="#" class="action"><i class="glyphicon glyphicon-circle-arrow-right"></i></a></div>
            </div>
        </div>
    </div>
	<c:import url="./structure/footer.jsp" />
	<c:import url="./structure/scripts.jsp" />
</body>
</html>