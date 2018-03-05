<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<div id="thesis" class="section full">
			<h2>국제 학술지 논문</h2>
			

			<ul class="carousel" id="carousellatest">
                 <c:forEach var="stu" items="${thesis_data }">
				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="/spring_mvc_prj/images/${stu.img }" style="width:220px; height:220px">
						<div class="content">
							<h5>${stu.name }</h5>
							<h6>${stu.thesis }</h6>
						</div>
						<form action="post_call.do" name="frm" method="post"></form>
						<div class="hover">
							<a href="#" onclick="frm.submit()" class="hover content">
								<h2>+</h2>
								<h5>${stu.name }</h5>
								<h6>${stu.thesis }</h6>
						    </a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->
				</c:forEach>

			

			</ul>

		</div>