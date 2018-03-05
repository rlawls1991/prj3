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
    //Java EE�� Servlet���� �����ϴ� HttpServletRequest�� ����Ͽ� �Ķ���� ó��
    public String useHttpServletRequest(HttpServletRequest request) {
    	//�������� ���� ������ ���� ������ HttpServletRequest�� ����ؾ� �Ѵ�.
    	System.out.println("������ ���� ��� "+ request.getRemoteAddr());
    	System.out.println("�̸�"+request.getParameter("name"));
    	System.out.println("����"+request.getParameter("age"));
    	System.out.println("�ּ�"+request.getParameter("addr"));
    	
    	return "day0227/use_req";
    }//useHttpServletRequest
    
    @RequestMapping(value="/variable_test.do", method=POST)
    //method�� parameter�� HTML Form Control�� �̸��� ������
    //�Է°��� ������ Ÿ�� ���´�.(����ȯ�� �ڵ����� ����)
   // public String useVariable(String name, @RequestParam(required=false, defaultValue="0", value="age") int age, String addr) {
    //�������� null�� ���ö� @RequestParam�� ����ϰų�
    //Wrapper class�� ����Ͽ� ó��
   public String useVariable(String name,Integer age, String addr) {
    	System.out.println("������ �Է¹ޱ� : �̸� : "+name+", ���� : "+(age==null?0:age.intValue())+", �ּ� : "+ addr);
    	return "day0227/use_req";
    }//useVariable
    
    @RequestMapping(value="/vo_test.do",method=POST)
    //VO�� ����� �Ķ���� ó��
    public String useVO(ParamVO pv) {
    	
    	System.out.println("VO�� ����� parameteró�� : " + pv.getName()+","+(pv.getAge()==null?0:pv.getAge().intValue())+", "+pv.getAddr());
    	
    	return "day0227/use_req";
    }//useVO
    
    //////////////ó���� �����͸� View�� �ѱ涧////////////////
    //HttpServletRequest���
    @RequestMapping(value="/req_process.do", method=GET)
    public String useRequest(HttpServletRequest request) {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","����","�ڹ� ��� ���̾ �� ���� ����"));
    	list.add(new StudentVO("ham.png","�Թ���","��ü�ν� ������ �̿��� �ý��� ����"));
    	list.add(new StudentVO("hong.png","��ȫ��","simple kmeans �̿��� ����ȯ�� ����"));
    	list.add(new StudentVO("jin.png","������","����� ��ġ ����� ������� ����"));
    	list.add(new StudentVO("jun.png","���ؿ�","�ݿ� ����Ʈ �ý��ۿ���"));
    	list.add(new StudentVO("park.png","���ٱ�","�Ű���� ȭ��ǰ��� ����"));
    	
    	request.setAttribute("stu_data", list);
    	
    	return "day0227/req_view";
    }//useRequest
    
    //ModelAndView���
    @RequestMapping(value="/modelandview_process.do", method=GET)
    //ModelAndView����� ���� ��ȯ���� ModelAndView�� �Ǿ�� �Ѵ�.
    public ModelAndView useModelAndView() {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","����","����� ������ �Ͽ���"));
    	list.add(new StudentVO("ham.png","�Թ���","����� ���ı� �Ե�����"));
    	list.add(new StudentVO("hong.png","��ȫ��","��⵵ ����� �����"));
    	list.add(new StudentVO("jin.png","������","��⵵ �Ⱦ�� �����Ʒ���"));
    	list.add(new StudentVO("jun.png","���ؿ�","��⵵ ���ֽ� ������"));
    	list.add(new StudentVO("park.png","���ٱ�","����� ��絿 �����"));
    	
    	//1.ModelAndView����
    	ModelAndView mav=new ModelAndView();
    	//2.view������ ����
    	mav.setViewName("day0227/req_view");
    	//3.������ ����
    	mav.addObject("stu_data",list);
    	return mav;
    	
    	
    }//useRequest
    
    //Model���
    @RequestMapping(value="/model.do", method=GET)
    //Model�� ����� ���� ��ȯ���� String �̰� �Ű������� Model�� ����.
    public String useModel(Model model) {
    	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","����","��ȭ"));
    	list.add(new StudentVO("ham.png","�Թ���","����"));
    	list.add(new StudentVO("hong.png","��ȫ��","���뱹"));
    	list.add(new StudentVO("jin.png","������","���� ������ ����"));
    	list.add(new StudentVO("jun.png","���ؿ�","��ȭ"));
    	list.add(new StudentVO("park.png","���ٱ�","����"));
    	
    	//1.Model ������ ����
    	model.addAttribute("stu_data", list);
    	return "day0227/req_view";
    	
    }//useModel
    
}//class
