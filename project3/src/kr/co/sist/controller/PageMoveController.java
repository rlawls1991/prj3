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
    	
    	String page="day0228/forward"; //�������� ��� �̵�
    	
    	if(new Random().nextBoolean()) {
    		//���������� ��� �̵�(redirect) : ViewResolver�� ������� �ʰ�
    		//���� ��û�� �ϱ� ������ ���� ��ο� ���ϸ��� ��� ����ؾ� �Ѵ�.
    		page="redirect../day0228/redirect_view.jsp"; // ���������� ��� �̵� (redirect)
    	}else {
    		model.addAttribute("date",new SimpleDateFormat("yyyy-MM-dd EEEE hh:mm:ss").format(new Date()));
    		model.addAttribute("subject",new String[] {"Oracle","Java SE","JDBC","HTML","JavaScript",
    				"CSS","Query","Java EE(Servlet/JSP)","JSON","XML","AJAX","MyBatis","Spring"});
    	}
    	
    	return page;
    }//useRedirect
	
	//��û�� ó���ϴ� method�� ��ȯ���� void�� ��쿡��
	//�̵� ����� ������ �� ���� forward�� �̵��ϸ鼭
	//��û URL�� ������ jsp�� ã�´�.
	// /day0228/include.do => WEB-INF/views/day0228/include.jsp
	@RequestMapping(value="/day0228/include.do",method=GET)
	public void include(Model model) {
		model.addAttribute("name","��ȫ��");
	}//include
	
	@RequestMapping(value="/include_test.do",method=GET)
	public String include_test(Model model) {
		List<StudentVO> list=new ArrayList<StudentVO>();
		
		if(new Random().nextBoolean()) {
    	list.add(new StudentVO("go.png","����","�ڹ� ��� ���̾ �� ���� ����"));
    	list.add(new StudentVO("ham.png","�Թ���","��ü�ν� ������ �̿��� �ý��� ����"));
    	list.add(new StudentVO("hong.png","��ȫ��","simple kmeans �̿��� ����ȯ�� ����"));
    	list.add(new StudentVO("jin.png","������","����� ��ġ ����� ������� ����"));
    	list.add(new StudentVO("jun.png","���ؿ�","�ݿ� ����Ʈ �ý��ۿ���"));
    	list.add(new StudentVO("park.png","���ٱ�","�Ű���� ȭ��ǰ��� ����"));
		}else {
			list.add(new StudentVO("default_thesis.jpg","N/A","��ϵ� �� �����ϴ�."));
			
		}//end else
		model.addAttribute("thesis_data",list);
		return "day0228/data_include";
	}//include
	
	@RequestMapping(value="/forward/forward_a.do",method=GET)
	public String forwardA() {
		System.out.println("forward_a�� �̵�");
		//forward�� �ҷ��ָ� Controller�� �ٷ� ��û�� ������.
		return "forward:forward_b.do";
	}//forwardA
	
	@RequestMapping(value="/forward/forward_b.do",method=GET)
	public String forwardB(Model model) {
		
		model.addAttribute("data",new String[] {"����","���","����","�뱸","�λ�","����"}); //�α����ѻ���� �� �� �ִ� ������
		
		return "day0228/data_view";
	}//
	
}//class
