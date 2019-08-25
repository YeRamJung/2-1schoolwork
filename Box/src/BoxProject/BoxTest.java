package BoxProject;

public class BoxTest {
	public static void main(String[] args) {
		Box box1; //참조변수 box1 정의
		box1 = new Box();  //box1이 상자 객체 가리키게끔
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());  //가로,세로,높이 전부 100일 때의 부피 호출
		
		System.out.println(box1);  //box1 출력해보기
		
		Box box2 = new Box(); //두번째 상자 객체 box2 생성
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		System.out.println(box2.getVolume());  //가로,세로,높이 전부 200일 때의 부피 호출 
		
		box1= box2; //box2를 box1에 대입
		System.out.println(box1.getWidth());  //접근자를 통하여 box1의 속성값 출력
		System.out.println(box1.getLength()); //접근자를 통하여 box1의 속성값 출력
		System.out.println(box1.getHeight()); //접근자를 통하여 box1의 속성값 출력
	}
}
