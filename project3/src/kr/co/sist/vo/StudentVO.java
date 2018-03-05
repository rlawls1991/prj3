package kr.co.sist.vo;

public class StudentVO {
	private String img,name,thesis;

	public StudentVO() {
		super();
	}

	public StudentVO(String img, String name, String thesis) {
		super();
		this.img = img;
		this.name = name;
		this.thesis = thesis;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	
	
}
