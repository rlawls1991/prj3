package kr.co.sist.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.vo.ParamVO;
import kr.co.sist.vo.StudentVO;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ParamController {
    @RequestMapping(value="/req_test.do", method=POST)
    //Java EE의 Servlet에서 제공하는 HttpServletRequest를 사용하여 파라메터 처리
    public String useHttpServletRequest(HttpServletRequest request) {
    	//접속자의 여러 정보를 얻을 때에는 HttpServletRequest를 사용해야 한다.
    	System.out.println("접속자 정보 얻기 "+ request.getRemoteAddr());
    	System.out.println("이름"+request.getParameter("name"));
    	System.out.println("나이"+request.getParameter("age"));
    	System.out.println("주소"+request.getParameter("addr"));
    	
    	return "day0227/use_req";
    }//useHttpServletRequest
    
    @RequestMapping(value="/variable_test.do", method=POST)
    //method의 parameter와 HTML Form Control의 이름이 같으면
    //입력값이 변수를 타고 들어온다.(형변환을 자동으로 수행)
   // public String useVariable(String name, @RequestParam(required=false, defaultValue="0", value="age") int age, String addr) {
    //정수값에 null이 들어올때 @RequestParam을 사용하거나
    //Wrapper class를 사용하여 처리
   public String useVariable(String name,Integer age, String addr) {
    	System.out.println("변수로 입력받기 : 이름 : "+name+", 나이 : "+(age==null?0:age.intValue())+", 주소 : "+ addr);
    	return "day0227/use_req";
    }//useVariable
    
    @RequestMapping(value="/vo_test.do",method=POST)
    //VO를 사용한 파라메터 처리
    public String useVO(ParamVO pv) {
    	
    	System.out.println("VO를 사용한 parameter처리 : " + pv.getName()+","+(pv.getAge()==null?0:pv.getAge().intValue())+", "+pv.getAddr());
    	
    	return "day0227/use_req";
    }//useVO
    
    //////////////처리된 데이터를 View로 넘길때////////////////
    //HttpServletRequest사용
    @RequestMapping(value="/req_process.do", method=GET)
    public String useRequest(HttpServletRequest request) {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","고광현","자바 기반 다이어리 앱 개발 연구"));
    	list.add(new StudentVO("ham.png","함민이","생체인식 센서를 이용한 시스템 연구"));
    	list.add(new StudentVO("hong.png","김홍기","simple kmeans 이용한 병원환경 개선"));
    	list.add(new StudentVO("jin.png","김진석","사용자 위치 기반의 관리장비 연구"));
    	list.add(new StudentVO("jun.png","김준우","금연 서포트 시스템연구"));
    	list.add(new StudentVO("park.png","박줄기","신경쇠약과 화장실관계 연구"));
    	
    	request.setAttribute("stu_data", list);
    	
    	return "day0227/req_view";
    }//useRequest
    
    //ModelAndView사용
    @RequestMapping(value="/modelandview_process.do", method=GET)
    //ModelAndView사용할 때는 반환형이 ModelAndView가 되어야 한다.
    public ModelAndView useModelAndView() {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","고광현","서울시 강남구 일원동"));
    	list.add(new StudentVO("ham.png","함민이","서울시 송파구 롯데월드"));
    	list.add(new StudentVO("hong.png","김홍기","경기도 오산시 까산이"));
    	list.add(new StudentVO("jin.png","김진석","경기도 안양시 예비훈련장"));
    	list.add(new StudentVO("jun.png","김준우","경기도 광주시 곤지암"));
    	list.add(new StudentVO("park.png","박줄기","서울시 사당동 현충원"));
    	
    	//1.ModelAndView생성
    	ModelAndView mav=new ModelAndView();
    	//2.view페이지 설정
    	mav.setViewName("day0227/req_view");
    	//3.데이터 설정
    	mav.addObject("stu_data",list);
    	return mav;
    	
    	
    }//useRequest
    
    //Model사용
    @RequestMapping(value="/model.do", method=GET)
    //Model을 사용할 때는 반환형은 String 이고 매개변수로 Model을 선언.
    public String useModel(Model model) {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","고광현","영화"));
    	list.add(new StudentVO("ham.png","함민이","피자"));
    	list.add(new StudentVO("hong.png","김홍기","순대국"));
    	list.add(new StudentVO("jin.png","김진석","음식 조리후 섭취"));
    	list.add(new StudentVO("jun.png","김준우","만화"));
    	list.add(new StudentVO("park.png","박줄기","족발"));
    	
    	//1.Model 데이터 설정
    	model.addAttribute("stu_data", list);
    	return "day0227/req_view";
    	
    }//useModel
    
}//class
