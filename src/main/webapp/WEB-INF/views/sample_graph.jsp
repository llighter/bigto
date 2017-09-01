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
	<div>
        <div class="row">
            <div class="col-md-4 col-md-offset-2">
            	<div>
				    <ul class="nav nav-tabs">
				        <li class="active"><a href="#tab-1" data-toggle="tab">테스트</a></li>
				        <li><a href="#tab-2" data-toggle="tab">서비스 조회</a></li>
				    </ul>
				    <div class="tab-content">
				        <div class="tab-pane active" id="tab-1">
				            <button class="btn btn-primary" id="randomizeData">Randomize Data</button>
			                <button class="btn btn-info" id="phone">아이폰6 Data</button>
			                
			                <!-- <input type="text" id="krname" value="아이폰6" />
			                <input type="text" id="gb" value="16" />
			                <input type="text" id="conditions" value="상" />
			                <input type="text" id="changes" value="확정기변" /> -->
			                
			                <div>
				                <select id="krname">
				                    <optgroup label="스마트폰 모델명">
				                    	<option value="" selected="">--select--</option>
				                    </optgroup>
				                </select>
				                <select id="gb">
				                    <optgroup label="용량 선택">
				                        <option value="" selected="">--select--</option>
				                    </optgroup>
				                </select>
				                <select id="conditions">
				                    <optgroup label="기기 상태">
				                        <option value="" selected="">--select--</option>
				                    </optgroup>
				                </select>
				                <select id="changes">
				                    <optgroup label="기기 변경 유형">
				                        <option value="" selected="">--select--</option>
				                    </optgroup>
				                </select>
				                <button class="btn btn-danger" id="spec">조회</button>
			                </div>
				        </div>
				        <div class="tab-pane" id="tab-2">
				        	<select id="graph_type">
				                <optgroup label="옵션을 선택해주세요.">
				                    <option value="line" selected>일자별 평균가격 조회</option>
				                    <option value="bar">일자별 등록개수 조회</option>
				                </optgroup>
				            </select>
				            <input type="date" id="start_date" min="2015-01-01" max="2018-01-01"/>
				            <input type="date" id="end_date" min="2015-01-01" max="2018-01-01"/>
				            <button class="btn btn-primary" type="button" id="add">추가</button>
				        	<div id="option_case">
					        	<div class="graph_option">
						            <select id="krname">
						                <optgroup label="스마트폰 모델명">
						                    <option value="" selected="">--select--</option>
						                </optgroup>
						            </select>
						            <select id="gb">
						                <optgroup label="용량 선택">
						                    <option value="" selected="">--select--</option>
						                </optgroup>
						            </select>
						            <button class="btn btn-danger search" type="button" id="search">조회</button>
					            </div>
							</div>
				        </div>
				    </div>
				</div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <canvas id="myChart" width="200px" height="100px"></canvas>
            </div>
        </div>
    </div>
	<c:import url="./structure/footer.jsp" />
	<c:import url="./structure/scripts.jsp" />
</body>
</html>