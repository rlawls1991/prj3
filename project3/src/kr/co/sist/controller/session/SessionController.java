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
	//HttpSession ���
	public String useHttpSession(HttpServletRequest request) {
		//1.���Ǿ��
		HttpSession session=request.getSession();
		//2.���� �����ð� ����
		session.setMaxInactiveInterval(60*60);//�ѽð�¥�� ����
		//3.���ǿ� �� ����
		session.setAttribute("id", "daesoon");
		session.setAttribute("name", "����");
		
		return "day0228/use_session";
	}
	
	//Model�� ����� ���ǰ� ����
	@RequestMapping(value="/session/use_session_att.do", method=GET)
	public String useSessionAttribute(Model model) {
		//Model�� �Ӽ��̸��� SessionAttribute�� �̸��� ���ٸ�
		//������ request�� ����ǰ� Session�� ����ȴ�.
		model.addAttribute("user_id","kim");
		model.addAttribute("user_name","��ȫ��");
		model.addAttribute("login_time", new Date());
		
		return "day0228/use_session_att";
	}//useSessionAttribute
	
	//���ǻ��� : SessionStatus ��ü ���
	//�����۾��� ���õ� do�� Controller�� �и��ؼ� �ۼ��ϸ�
	//requestScope����ִ� ���� �������. (���� class�� �����ϸ� ���ΰ�ħ�� �ؾ� ���� �������.)
	
	@RequestMapping(value="/session/remove_session.do",method=GET)
	public String removeSession(SessionStatus ss ) {

		ss.setComplete(); //���� ����
		return "day0228/remove_session";
	}//removeSession
	
	@RequestMapping(value="/cookie/add_cookie.do", method=GET)
	public String addCookie(HttpServletResponse response) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//1.��Ű����
		Cookie dateCookie=new Cookie("date",sdf.format(new Date()));
		Cookie nameCookie=new Cookie("name","��ȫ��");
		
		//2.�����ð� ����
		dateCookie.setMaxAge(60*60*24*1);  //�Ϸ�¥�� ��Ű
		nameCookie.setMaxAge(60*60*24*1);  //�Ϸ�¥�� ��Ű
		
		//3.��Ű�ɱ�
		response.addCookie(dateCookie);
		response.addCookie(nameCookie);
		
		return "forward:read_cookie.do";
	}//addCookie
	
	@RequestMapping(value="/cookie/read_cookie.do", method=GET)
	public String readCookie(@CookieValue(value="date",required=false, defaultValue="0")String date, 
			@CookieValue(value="name",required=false, defaultValue="�͸�")String name, Model model) {
		
		model.addAttribute("cookie_date", date);
		model.addAttribute("cookie_name", name);
		
		return "day0302/read_cookie";
	}

}//class
