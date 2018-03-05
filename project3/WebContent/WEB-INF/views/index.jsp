<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Treviso | Responsive HTML5 Template</title>
<!-- Load CSS -->
<link href="common1/css/style.css" rel="stylesheet" type="text/css" />
<!-- Load Icon Font -->
<link href="common1/css/webfont.css" rel="stylesheet" type="text/css" />
<!-- Load jQuery library -->
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<!-- Load jCarousel js -->
<script type="text/javascript" src="common1/js/jquery.jcarousel.js"></script>
<!-- Load MixItUup js -->
<script type="text/javascript" src="common1/js/jquery.mixitup.js"></script>
<!-- Load js -->
<script type="text/javascript" src="common1/js/custom.js"></script>
<link rel="stylesheet" type="text/css" href="common/css/main.css"/>
<script type="text/javascript">
  $(function(){
	  var obj=document.inputFrm;
	 $("#req").click(function(){
		 obj.action="req_test.do";
	     obj.submit();
	 });//req click
	 $("#var").click(function(){
		 obj.action="variable_test.do";
	     obj.submit();	 
	 alert(obj.action);
	 });//req click
	 $("#vo").click(function(){
		 obj.action="vo_test.do";
	     obj.submit();	 
	 alert(obj.action);
	 });//req click
  });
</script>
</head>
<!-- Start Body -->
<body>
	<!-- Start Menu -->
	<div class="menubar" data-scroll="true">
		<a href="#" class="logo"></a>
		<ul class="mainmenu">
			<li class="active"><a href="#home">Home</a></li>
			<li><a href="#services">Services</a></li>
			<li><a href="#about">About</a></li>
			<li><a href="#portfolio">Portfolio</a></li>
			<li><a href="#blog">Blog</a></li>
			<li><a href="#contact">Contact</a></li>
		</ul>
	</div>
	<!-- End Menu -->
	
	<!-- Start Home -->
	<a class="scroll" id="home"></a>
	<div class="home hero">
		<div class="overlay"></div>
		<div class="herowrapper">
			<h1>SIST 프로젝트 사이트 <b class="rotate color">MVC,DI,AOP,ORM</b>.</h1>
		</div>
		<a href="javascript:void(0);" class="scrolldown">
			<h3>스프링 MVC</h3>
			<div data-icon="&#xe017;" class="icon"></div>
		</a>
	</div>
	<!-- End Home -->

	<!-- Start BlockQuote -->
	<div class="blockquote main">
		<blockquote> <b>스프링</b> </blockquote>
	</div>
	<!-- End BlockQuote -->

	<!-- Start Content -->
	<div class="content">
	<div class="section full">
			<h2>사용자 정보 입력</h2>
			<div>
			<form name="inputFrm" method="post"  id="inputFrm">
			<label>이름</label>
			<input type="text" name="name" class="inputBox"  style="width:150px"/><br/>
			<label>나이</label>
			<input type="text" name="age" class="inputBox" style="width:100px"/><br/>
			<label>주소</label>
			<input type="text" name="addr" class="inputBox" style="width:350px"/><br/>
			<input type="button" value="request사용" class="btn" id="req" style="width:80px;padding:0px;line-height:0px"/>
			<input type="button" value="변수사용" class="btn" id="var" style="width:80px;padding:0px;line-height:0px"/>
			<input type="button" value="VO사용" class="btn"  id= "vo" style="width:80px;padding:0px;line-height:0px"/>
			</form>
			</div>
			<div style="margin-top:10px">
			    <h2>처리된 데이터를 view로 보내는 객체들</h2>
			    <a href="req_process.do">HttpServeltRequest사용</a>
			    <a href="modelandview_process.do">ModelAndView사용</a>
			    <a href="model.do">Model사용</a>
			</div>
			<div style="margin-top:10px">
			    <h2>페이지 이동</h2>
			    <a href="page/redirect.do">redirect이동</a>
			</div>
			<div style="margin-top:10px">
			    <h2>include</h2>
			    <a href="day0228/include.do">include사용</a>
			</div>
    </div>

		<!-- Start HomePage Section -->
		<div class="section full">
			<h2>Latest Work</h2>

			<ul class="carousel" id="carousellatest">

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large1.jpg">
						<div class="content">
							<h5>요청</h5>
							<h6>POST방식의 요청</h6>
						</div>
						<form action="post_call.do" name="frm" method="post"></form>
						<div class="hover">
							<a href="#" onclick="frm.submit()" class="hover content">
								<h2>+</h2>
								<h5>요청</h5>
								<h6>POST방식의 요청</h6>
						    </a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

			<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large2.jpg">
						<div class="content">
							<h5>요청</h5>
							<h6>GET/POST</h6>
						</div>
						<form action="get_post_call.do" name="frm1"></form>
						<div class="hover">
							<div href="#" class="hover content">
								<h2>+</h2>
								<h5>요청</h5>
								<h6><a href="#" onclick="frm1.submit()">GET</a>
								<a href="#" onclick="frm1.method='post'; frm1.submit()">POST</a></h6>
							</div>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large3.jpg">
						<div class="content">
							<h5>Type Work</h5>
							<h6>illustration/branding</h6>
						</div>
						<div class="hover">
							<a href="#" class="hover content">
								<h2>+</h2>
								<h5>Type Work</h5>
								<h6>illustration/branding</h6>
							</a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large4.jpg">
						<div class="content">
							<h5>요청</h5>
							<h6>POST방식</h6>
						</div>
						<div class="hover">
							<a href="post_call.do" class="hover content">
								<h2>+</h2>
								<h5>요청</h5>
								<h6>POST방식</h6>
							</a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large5.jpg">
						<div class="content">
							<h5>Type Work</h5>
							<h6>illustration/branding</h6>
						</div>
						<div class="hover">
							<a href="#" class="hover content">
								<h2>+</h2>
								<h5>Type Work</h5>
								<h6>illustration/branding</h6>
							</a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large1.jpg">
						<div class="content">
							<h5>Type Work</h5>
							<h6>illustration/branding</h6>
						</div>
						<div class="hover">
							<a href="#" class="hover content">
								<h2>+</h2>
								<h5>Type Work</h5>
								<h6>illustration/branding</h6>
							</a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

				<!-- Start Single Block -->
				<li>
					<div class="section block">	
						<img src="common1/img/placeholder_large2.jpg">
						<div class="content">
							<h5>Type Work</h5>
							<h6>illustration/branding</h6>
						</div>
						<div class="hover">
							<a href="#" class="hover content">
								<h2>+</h2>
								<h5>Type Work</h5>
								<h6>illustration/branding</h6>
							</a>
						</div>	
					</div>
				</li>
				<!-- End Single Block -->

			</ul>

		</div>
		<!-- End HomePage Section -->

		<!-- Clear :) -->
		<div class="clear"></div>

		<!-- Start HomePage Section -->
		<!-- End HomePage Section -->

		<!-- Clear :) -->
		<div class="clear"></div>

	</div>
	

	<div class="clear"></div>


	<!-- Clear :) -->
	<div class="clear"></div>
	<!-- End Content -->

	<!-- Start Content -->
	<div class="content">

		<!-- Start Content -->
		<div class="content sidebar" id="snippets" style="position:relative;">
			
			<!-- Start Article -->
			<article class="post">				
				<div class="hover">	
					<div class="postimage">
						<img src="common1/img/post1.jpg">
						<div class="posthover"><a class="openpost" href="javascript:void(0);" data-id="2">read more</a></div>
					</div>
					<div class="postinfo">
						<h6 class="mid-gray"><b class="dark-gray">Posted:</b> 17/9/13</h6>
						<h6 class="mid-gray"><b class="dark-gray">Author:</b> Zan</h6>
						<h6 class="mid-gray"><b class="dark-gray">Comments:</b> 3</h6>
					</div>
				</div>

				<h3>A boat</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua.</p>

			</article>
			<!-- End Article -->

			<!-- Start Article -->
			<article class="post">
				<div class="hover">	
					<div class="postimage">
						<img src="common1/img/post2.jpg">
						<div class="posthover"><a class="openpost" href="javascript:void(0);" data-id="2">read more</a></div>
					</div>
					<div class="postinfo">
						<h6 class="mid-gray"><b class="dark-gray">Posted:</b> 17/9/13</h6>
						<h6 class="mid-gray"><b class="dark-gray">Author:</b> Zan</h6>
						<h6 class="mid-gray"><b class="dark-gray">Comments:</b> 3</h6>
					</div>
				</div>

				<h3>Another boat</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua.</p>

			</article>
			<!-- End Article -->

			<!-- Start Article -->
			<article class="post">				
				<div class="hover">	
					<div class="postimage">
						<img src="common1/img/post3.jpg">
						<div class="posthover"><a class="openpost" href="javascript:void(0);" data-id="2">read more</a></div>
					</div>
					<div class="postinfo">
						<h6 class="mid-gray"><b class="dark-gray">Posted:</b> 17/9/13</h6>
						<h6 class="mid-gray"><b class="dark-gray">Author:</b> Zan</h6>
						<h6 class="mid-gray"><b class="dark-gray">Comments:</b> 3</h6>
					</div>
				</div>

				<h3>One more boat</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua.</p>

			</article>
			<!-- End Article -->

			
			<!-- Clear :) -->
			<div class="clear"></div>
			<div id="sidebar" class="sidebar" >
			
			<div class="widget" style="position: absolute;top:-40px; left:700px">
				<h5>스프링</h5>
				<ul>
					<li><h6><b class="light-gray">></b> <a href="session/use_session.do">HttpSession사용</a><span class="light-gray"> (1)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="session/use_session_att.do">@SessionAttribute사용</a><span class="light-gray"> (1)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="session/remove_session.do">세션삭제</a><span class="light-gray"> (6)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="forward/forward_a.do">do의 이동(A를 거쳐 B로 이동)</a><span class="light-gray"> (1)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="forward/forward_b.do">데이터의 사용(B로만 이동)</a><span class="light-gray"> (2)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="cookie/add_cookie.do">쿠키 값 설정</a><span class="light-gray"> (7)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="cookie/read_cookie.do">쿠키 값 얻기</a><span class="light-gray"> (1)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="ajax/ajax.do">AJAX 사용</a><span class="light-gray"> (1)</span></h6></li>
				</ul>
			</div>
						
		</div>
		<!-- End Content -->


			<!-- Start Article -->
			<article class="post full" data-id="3">				
				<div class="hover">	
					<div class="postimage">
						<img src="common1/img/post3.jpg">
						<div class="posthover"><a class="backtoblog" href="javascript:void(0);" data-id="1"><< back to blog</a></div>
					</div>
					<div class="postinfo">
						<h6 class="mid-gray"><b class="dark-gray">Posted:</b> 17/9/13</h6>
						<h6 class="mid-gray"><b class="dark-gray">Author:</b> Zan</h6>
						<h6 class="mid-gray"><b class="dark-gray">Comments:</b> 3</h6>
					</div>
				</div>
				<div class="clear"></div>
				<h3>One more boat</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				<br>
				<br>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				<br>
				<br>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				<br>
				<br>
				Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				</p>
			</article>
			<!-- End Article -->

			<!-- Clear :) -->
			<div class="clear"></div>
		</div>
		<!-- End Content -->

		<!-- Start Sidebar -->


			<div class="widget">
				<h5>Text Widget</h5>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
				tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>

			<div class="widget twitter">
				<h5>Twitter Widget</h5>
				<a class="tweet" href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
				<a class="tweet" href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
				<a class="tweet" href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit.</a>
			</div>
			
			<!-- Clear :) -->
			<div class="clear"></div>
		</div>
		<!-- End Sidebar -->

		<!-- Clear :) -->
		<div class="clear"></div>
	
	<footer class="footer">
		<a href="#void"><h6>© Copyright 2017</h6></a>
	</footer>

</body>
<!-- End Body -->
</html>