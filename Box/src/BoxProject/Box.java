package BoxProject;

public class Box {
	int width; //����
	int length; //����
	int height; //����
	
	//width ������
	public void setWidth(int whatWidth) {
		width = whatWidth;
	}
	//width ������
	public int getWidth() {
		return width;
	}
	//length ������
	public void setLength(int whatLength) {
		length = whatLength;
	}
	//length ������
	public int getLength() {
		return length;
	}
	//height ������
	public void setHeight(int whatHeight) {
		height = whatHeight;
	}
	//height ������
	public int getHeight() {
		return height;
	}
	//���� ���ϴ� �޼ҵ�
	public int getVolume() {
		int volume = width*length*height; 
		return volume;
	}
}