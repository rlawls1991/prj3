package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.sist.service.LoginService;
import kr.co.sist.service.ThesisService;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@SessionAttributes({"user_id","user_name"})
@Controller
public class LoginController {
    @RequestMapping(value="/login.do", method= {GET,POST})
    public String main(String id, String passwd,HttpSession session, Model model) {
    	//로그인 수행
    	LoginService ls=new LoginService();
    	//파라메터가 null이 아니면서 세션에 값이 없을 때 수행
    	String session_id=(String)session.getAttribute("user_id");
    	if(session_id==null&&id!=null&& !"".equals(id)) {
    	String name=ls.loginProcess(id, passwd);
    	//이름을 세션 입력
    	model.addAttribute("user_id",id);
    	model.addAttribute("user_name",name);
    	}//end if
    	
    	//Model 첫번쨰 화면에서 보여줄 데이터들 설정
    	ThesisService ts=new ThesisService();
    	model.addAttribute("thesis", ts.searchThesis());
    	model.addAttribute("loc", ts.searchLoc());
    	
    	return "day0302/index";
    }//main
    
    @RequestMapping(value="/ajax/ajax.do", method=GET)
    public String useAjax(Model model) {
    	ThesisService ts=new ThesisService();
    	model.addAttribute("thesis", ts.searchAjaxThesis());
    	return "day0302/ajax_list";
    }
    
    @RequestMapping(value="/ajax/detail_thesis.do", method=GET)
    public String useAjax(int num,Model model) {
    	ThesisService ts=new ThesisService();
    	model.addAttribute("thesis_detail", ts.searchThesisDetail(num));
    	return "day0302/thesis_detail";
    }
}//class
