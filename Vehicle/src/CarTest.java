public class CarTest {
	public static void main(String args[]){
		/*
		 Vehicle ve = new Vehicle();
		  ���� �߻�: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		  Cannot instantiate the type Vehicle
		 */
		
		Car c1 = new Car();  //Car Ŭ������ ��ü ����
		System.out.println("����� " + c1.getkilosPerLiter() + "�Դϴ�.");  //���� ��¹�
		c1.printSpeed();  //���� �ӵ� ���ϴ� �޼ҵ带 ��ü�� ȣ��		
	}
}

