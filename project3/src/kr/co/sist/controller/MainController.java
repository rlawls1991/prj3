package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//�ٸ� Ŭ������ static����, method�� �� Ŭ������ ���ǵ� �� ó�� ����� �� static import�� �޴´�.
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
	
	//GET���, POST������� ��û�� �� method�� {}�� �־��ش�.
	@RequestMapping(value="/get_post_call.do",method= {POST, GET})
	public String get_post_call() {
		return "get_post_call";
	}//index
	
}
