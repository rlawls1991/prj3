package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//다른 클래스의 static변수, method를 내 클래스에 정의된 것 처럼 사용할 때 static import를 받는다.
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MainController {
	@RequestMapping(value="/index.do",method= GET)
	public String index() {
		return "index";
	}//index
	@RequestMapping(value="/post_call.do",method= POST)
	public String post_call() {
		return "post_call";
	}//index
	
	//GET방식, POST방식으로 요청할 때 method에 {}을 넣어준다.
	@RequestMapping(value="/get_post_call.do",method= {POST, GET})
	public String get_post_call() {
		return "get_post_call";
	}//index
	
}
