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
    	list.add(new StudentVO("go.png","고광현","자바 기반 다이어리 앱 개발 연구"));
    	list.add(new StudentVO("ham.png","함민이","생체인식 센서를 이용한 시스템 연구"));
    	list.add(new StudentVO("hong.png","김홍기","simple kmeans 이용한 병원환경 개선"));
    	list.add(new StudentVO("jin.png","김진석","사용자 위치 기반의 관리장비 연구"));
    	list.add(new StudentVO("jun.png","김준우","금연 서포트 시스템연구"));
    	list.add(new StudentVO("park.png","박줄기","신경쇠약과 화장실관계 연구"));
    	
    	return list;
		}
	public List<ThesisVO> searchAjaxThesis(){
		List<ThesisVO> list=new ArrayList<ThesisVO>();
		list.add(new ThesisVO(1,"go.png","고광현","자바 기반 다이어리 앱 개발 연구"));
		list.add(new ThesisVO(2,"ham.png","함민이","생체인식 센서를 이용한 시스템 연구"));
		list.add(new ThesisVO(3,"hong.png","김홍기","simple kmeans 이용한 병원환경 개선"));
		list.add(new ThesisVO(4,"jin.png","김진석","사용자 위치 기반의 관리장비 연구"));
		list.add(new ThesisVO(5,"jun.png","김준우","금연 서포트 시스템연구"));
		list.add(new ThesisVO(6,"park.png","박줄기","신경쇠약과 화장실관계 연구"));
		
		return list;
	}
	public String searchThesisDetail(int key){
		String detail="";
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "더이상의 자세한 설명은 생략한다!!");
		map.put(2, "오지고 지리고 렛잇고한 연구");
		map.put(3, "쩌는 연구");
		map.put(4, "세상에나 이런연구가!");
		map.put(5, "위의 연구보다 좀더 아능 연구");
		map.put(6, "논문상 수상각");
		
		detail=map.get(key);
		
		return detail;
	}
	public List<StudentVO> searchLoc(){
		List<StudentVO> list=new ArrayList<StudentVO>();
		list.add(new StudentVO("go.png","고광현","서울시 강남구 일원동"));
    	list.add(new StudentVO("ham.png","함민이","서울시 송파구 롯데월드"));
    	list.add(new StudentVO("hong.png","김홍기","경기도 오산시 까산이"));
    	list.add(new StudentVO("jin.png","김진석","경기도 안양시 예비훈련장"));
    	list.add(new StudentVO("jun.png","김준우","경기도 광주시 곤지암"));
    	list.add(new StudentVO("park.png","박줄기","서울시 사당동 현충원"));
		
		return list;
	}

}
