package kr.co.sist.service;

import java.util.HashMap;
import java.util.Map;


public class LoginService {
	public static Map<String, String> map=new HashMap<>();
	static {
		map.put("kim", "����");
		map.put("go", "����");
		map.put("oh", "���¿�");
		map.put("heo", "�����");
	}
	
	public String loginProcess(String id, String pass) {
		String name="";
		if(map.containsKey(id)&& "1234".equals(pass)) {
			name=map.get(id);
		}//end if
		
		return name;
	}//loginProcess //�̸��� �ִٸ� �α��� ����

}
