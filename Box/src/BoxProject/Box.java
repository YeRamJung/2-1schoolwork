package BoxProject;

public class Box {
	int width; //가로
	int length; //세로
	int height; //높이
	
	//width 설정자
	public void setWidth(int whatWidth) {
		width = whatWidth;
	}
	//width 접근자
	public int getWidth() {
		return width;
	}
	//length 설정자
	public void setLength(int whatLength) {
		length = whatLength;
	}
	//length 접근자
	public int getLength() {
		return length;
	}
	//height 설정자
	public void setHeight(int whatHeight) {
		height = whatHeight;
	}
	//height 접근자
	public int getHeight() {
		return height;
	}
	//부피 구하는 메소드
	public int getVolume() {
		int volume = width*length*height; 
		return volume;
	}
}