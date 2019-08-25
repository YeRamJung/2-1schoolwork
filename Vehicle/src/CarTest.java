public class CarTest {
	public static void main(String args[]){
		/*
		 Vehicle ve = new Vehicle();
		  에러 발생: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		  Cannot instantiate the type Vehicle
		 */
		
		Car c1 = new Car();  //Car 클래스의 객체 생성
		System.out.println("연비는 " + c1.getkilosPerLiter() + "입니다.");  //연비 출력문
		c1.printSpeed();  //현재 속도 구하는 메소드를 객체로 호출		
	}
}

