package kr.co.sist.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


import kr.co.sist.vo.StudentVO;
import kr.co.sist.vo.ThesisVO;

public class ThesisService {
	public List<StudentVO> searchThesis(){
	List<StudentVO> list=new ArrayList<StudentVO>();
    	list.add(new StudentVO("go.png","����","�ڹ� ��� ���̾ �� ���� ����"));
    	list.add(new StudentVO("ham.png","�Թ���","��ü�ν� ������ �̿��� �ý��� ����"));
    	list.add(new StudentVO("hong.png","��ȫ��","simple kmeans �̿��� ����ȯ�� ����"));
    	list.add(new StudentVO("jin.png","������","����� ��ġ ����� ������� ����"));
    	list.add(new StudentVO("jun.png","���ؿ�","�ݿ� ����Ʈ �ý��ۿ���"));
    	list.add(new StudentVO("park.png","���ٱ�","�Ű���� ȭ��ǰ��� ����"));
    	
    	return list;
		}
	public List<ThesisVO> searchAjaxThesis(){
		List<ThesisVO> list=new ArrayList<ThesisVO>();
		list.add(new ThesisVO(1,"go.png","����","�ڹ� ��� ���̾ �� ���� ����"));
		list.add(new ThesisVO(2,"ham.png","�Թ���","��ü�ν� ������ �̿��� �ý��� ����"));
		list.add(new ThesisVO(3,"hong.png","��ȫ��","simple kmeans �̿��� ����ȯ�� ����"));
		list.add(new ThesisVO(4,"jin.png","������","����� ��ġ ����� ������� ����"));
		list.add(new ThesisVO(5,"jun.png","���ؿ�","�ݿ� ����Ʈ �ý��ۿ���"));
		list.add(new ThesisVO(6,"park.png","���ٱ�","�Ű���� ȭ��ǰ��� ����"));
		
		return list;
	}
	public String searchThesisDetail(int key){
		String detail="";
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "���̻��� �ڼ��� ������ �����Ѵ�!!");
		map.put(2, "������ ������ ���հ��� ����");
		map.put(3, "¼�� ����");
		map.put(4, "���󿡳� �̷�������!");
		map.put(5, "���� �������� ���� �ƴ� ����");
		map.put(6, "���� ����");
		
		detail=map.get(key);
		
		return detail;
	}
	public List<StudentVO> searchLoc(){
		List<StudentVO> list=new ArrayList<StudentVO>();
		list.add(new StudentVO("go.png","����","����� ������ �Ͽ���"));
    	list.add(new StudentVO("ham.png","�Թ���","����� ���ı� �Ե�����"));
    	list.add(new StudentVO("hong.png","��ȫ��","��⵵ ����� �����"));
    	list.add(new StudentVO("jin.png","������","��⵵ �Ⱦ�� �����Ʒ���"));
    	list.add(new StudentVO("jun.png","���ؿ�","��⵵ ���ֽ� ������"));
    	list.add(new StudentVO("park.png","���ٱ�","����� ��絿 �����"));
		
		return list;
	}

}
