package kr.co.sist.service;

import java.util.HashMap;
import java.util.Map;


public class LoginService {
	public static Map<String, String> map=new HashMap<>();
	static {
		map.put("kim", "김대순");
		map.put("go", "고광현");
		map.put("oh", "오승원");
		map.put("heo", "허재령");
	}
	
	public String loginProcess(String id, String pass) {
		String name="";
		if(map.containsKey(id)&& "1234".equals(pass)) {
			name=map.get(id);
		}//end if
		
		return name;
	}//loginProcess //이름이 있다면 로그인 성공

}
