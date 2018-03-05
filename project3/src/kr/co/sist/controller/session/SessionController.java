package kr.co.sist.controller.session;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"user_id","user_name","login_time"})
public class SessionController {
	@RequestMapping(value="/session/use_session.do",method=GET)
	//HttpSession 사용
	public String useHttpSession(HttpServletRequest request) {
		//1.세션얻기
		HttpSession session=request.getSession();
		//2.세션 생존시간 설정
		session.setMaxInactiveInterval(60*60);//한시간짜리 세션
		//3.세션에 값 설정
		session.setAttribute("id", "daesoon");
		session.setAttribute("name", "김대순");
		
		return "day0228/use_session";
	}
	
	//Model을 사용한 세션값 저장
	@RequestMapping(value="/session/use_session_att.do", method=GET)
	public String useSessionAttribute(Model model) {
		//Model의 속성이름과 SessionAttribute의 이름이 같다면
		//정보가 request에 저장되고 Session에 저장된다.
		model.addAttribute("user_id","kim");
		model.addAttribute("user_name","김홍기");
		model.addAttribute("login_time", new Date());
		
		return "day0228/use_session_att";
	}//useSessionAttribute
	
	//세션삭제 : SessionStatus 객체 사용
	//삭제작업에 관련된 do는 Controller를 분리해서 작성하면
	//requestScope들어있는 값이 사라진다. (같은 class에 존재하면 새로고침을 해야 값이 사라진다.)
	
	@RequestMapping(value="/session/remove_session.do",method=GET)
	public String removeSession(SessionStatus ss ) {

		ss.setComplete(); //세션 삭제
		return "day0228/remove_session";
	}//removeSession
	
	@RequestMapping(value="/cookie/add_cookie.do", method=GET)
	public String addCookie(HttpServletResponse response) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//1.쿠키생성
		Cookie dateCookie=new Cookie("date",sdf.format(new Date()));
		Cookie nameCookie=new Cookie("name","김홍기");
		
		//2.생존시간 설정
		dateCookie.setMaxAge(60*60*24*1);  //하루짜리 쿠키
		nameCookie.setMaxAge(60*60*24*1);  //하루짜리 쿠키
		
		//3.쿠키심기
		response.addCookie(dateCookie);
		response.addCookie(nameCookie);
		
		return "forward:read_cookie.do";
	}//addCookie
	
	@RequestMapping(value="/cookie/read_cookie.do", method=GET)
	public String readCookie(@CookieValue(value="date",required=false, defaultValue="0")String date, 
			@CookieValue(value="name",required=false, defaultValue="익명")String name, Model model) {
		
		model.addAttribute("cookie_date", date);
		model.addAttribute("cookie_name", name);
		
		return "day0302/read_cookie";
	}

}//class
