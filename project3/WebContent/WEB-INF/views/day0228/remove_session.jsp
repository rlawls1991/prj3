<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>세션삭제 페이지</title>
<!-- Load CSS -->
<link href="../common1/css/style.css" rel="stylesheet" type="text/css" />
<!-- Load Icon Font -->
<link href="../common1/css/webfont.css" rel="stylesheet" type="text/css" />
<!-- Load jQuery library -->
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<!-- Load jCarousel js -->
<script type="text/javascript" src="../common1/js/jquery.jcarousel.js"></script>
<!-- Load MixItUup js -->
<script type="text/javascript" src="../common1/js/jquery.mixitup.js"></script>
<!-- Load js -->
<script type="text/javascript" src="../common1/js/custom.js"></script>
<link rel="stylesheet" type="text/css" href="../common/css/main.css"/>
<script type="text/javascript">

  $(function(){
	  var offset=$("#session_view").offset();
	  $("html,body").animate({scrollTop:offset.top-10},1000);
	
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
		<!-- Start HomePage Section -->
		<div id="session_view">
		   <table border="1">
		     <tr>
		     <td width="100">&nbsp;</td>
		     <td width="200">request의 값</td>
		     <td width="200">session의 값</td>
		     </tr>
		     <tr>
		     <td width="100">아이디</td>
		     <!-- 세션의 값을 EL에서 사용할 때에는 scope객체를 명시하지 않게되면 EL이
		     requestScope, sessionScpe, applicationScope, applicationScope중 이름 같은 객체의 값을 가져와서
		     보여주므로 scope객체를 명시하여 사용한다. -->
		     <td width="200">${sessionScope.user_id }</td>
		     </tr>
		     <tr>
		     <td width="100">이름</td>
		     <td width="200">${sessionScope.user_name }</td>
		     </tr>
		     <tr>
		     <td width="100">로그인 시간</td>
		     <td width="200">
		     <fmt:formatDate value="${login_time }" pattern="yyyy-MM-dd-a hh:mm:ss"/>
		     <td width="200"> 
		     <fmt:formatDate value="${sessionScope.login_time }" pattern="yyyy-MM-dd-a hh:mm:ss"/></td>
		     </tr>
		   </table>
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
						<img src="../common1/img/post1.jpg">
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
						<img src="../common1/img/post2.jpg">
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
						<img src="../common1/img/post3.jpg">
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
					<li><h6><b class="light-gray">></b> <a href="#">Lifestyle</a><span class="light-gray"> (4)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Design</a><span class="light-gray"> (2)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Dribbble</a><span class="light-gray"> (6)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Food</a><span class="light-gray"> (1)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Twitter</a><span class="light-gray"> (2)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Quotes</a><span class="light-gray"> (7)</span></h6></li>
					<li><h6><b class="light-gray">></b> <a href="#">Late Night</a><span class="light-gray"> (1)</span></h6></li>
				</ul>
			</div>
						
		</div>
		<!-- End Content -->


			<!-- Start Article -->
			<article class="post full" data-id="3">				
				<div class="hover">	
					<div class="postimage">
						<img src="../common1/img/post3.jpg">
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