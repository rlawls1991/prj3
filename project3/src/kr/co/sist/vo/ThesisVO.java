package kr.co.sist.vo;

public class ThesisVO {
private int num;
private String img, name, thesis;
public ThesisVO() {
	super();
}
public ThesisVO(int num, String img, String name, String thesis) {
	super();
	this.num = num;
	this.img = img;
	this.name = name;
	this.thesis = thesis;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
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
