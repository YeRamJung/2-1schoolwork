abstract class Vehicle {  //추상 클래스이자 슈퍼클래스
	int speed;  //추상 클래스에 필드를 추가할 수 있는지를 알아보기 위하여
	
	//메소드 본체가 없는 메소드(=추상 메소드) 선언
	public abstract double getkilosPerLiter(); 
	
	//현재의 속도 출력
	public void printSpeed() {
		System.out.println("현재 속도는 " + speed + "입니다.");
	}
}
