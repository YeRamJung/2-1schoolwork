public class Car extends Vehicle{  //Vehicle클래스를 상속받는 서브 클래스
	
	//반드시 구현해야 할 메소드: 슈퍼클래스에서 상속받은 추상 메소드 -> 재정의(오버라이딩)
	public double getkilosPerLiter() {
		return 124.0/10.0;
	}
}