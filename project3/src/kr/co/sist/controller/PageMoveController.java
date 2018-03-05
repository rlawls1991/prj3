package kr.co.sist.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.vo.StudentVO;

@Controller
public class PageMoveController {
	@RequestMapping(value="/page/redirect.do", method=GET)
    public String useRedirect(Model model) {
    	
    	String page="day0228/forward"; //정상적인 경우 이동
    	
    	if(new Random().nextBoolean()) {
    		//비정상적인 경우 이동(redirect) : ViewResolver를 사용하지 않고
    		//직접 요청을 하기 때문에 실제 경로와 파일명을 모두 명시해야 한다.
    		page="redirect../day0228/redirect_view.jsp"; // 비정상적인 경우 이동 (redirect)
    	}else {
    		model.addAttribute("date",new SimpleDateFormat("yyyy-MM-dd EEEE hh:mm:ss").format(new Date()));
    		model.addAttribute("subject",new String[] {"Oracle","Java SE","JDBC","HTML","JavaScript",
    				"CSS","Query","Java EE(Servlet/JSP)","JSON","XML","AJAX","MyBatis","Spring"});
    	}
    	
    	return page;
    }//useRedirect
	
	//요청을 처리하는 method가 반환형이 void인 경우에는
	//이동 방식을 변경할 수 없고 forward로 이동하면서
	//요청 URL과 동일한 jsp를 찾는다.
	// /day0228/include.do => WEB-INF/views/day0228/include.jsp
	@RequestMapping(value="/day0228/include.do",method=GET)
	public void include(Model model) {
		model.addAttribute("name","김홍기");
	}//include
	
	@RequestMapping(value="/include_test.do",method=GET)
	public String include_test(Model model) {
		List<StudentVO> list=new ArrayList<StudentVO>();
		
		if(new Random().nextBoolean()) {
    	list.add(new StudentVO("go.png","고광현","자바 기반 다이어리 앱 개발 연구"));
    	list.add(new StudentVO("ham.png","함민이","생체인식 센서를 이용한 시스템 연구"));
    	list.add(new StudentVO("hong.png","김홍기","simple kmeans 이용한 병원환경 개선"));
    	list.add(new StudentVO("jin.png","김진석","사용자 위치 기반의 관리장비 연구"));
    	list.add(new StudentVO("jun.png","김준우","금연 서포트 시스템연구"));
    	list.add(new StudentVO("park.png","박줄기","신경쇠약과 화장실관계 연구"));
		}else {
			list.add(new StudentVO("default_thesis.jpg","N/A","등록된 논문 없습니다."));
			
		}//end else
		model.addAttribute("thesis_data",list);
		return "day0228/data_include";
	}//include
	
	@RequestMapping(value="/forward/forward_a.do",method=GET)
	public String forwardA() {
		System.out.println("forward_a의 이동");
		//forward를 불러주면 Controller로 바로 요청을 보낸다.
		return "forward:forward_b.do";
	}//forwardA
	
	@RequestMapping(value="/forward/forward_b.do",method=GET)
	public String forwardB(Model model) {
		
		model.addAttribute("data",new String[] {"서울","경기","대전","대구","부산","광주"}); //로그인한사람만 볼 수 있는 데이터
		
		return "day0228/data_view";
	}//
	
}//class
