abstract class Vehicle {  //�߻� Ŭ�������� ����Ŭ����
	int speed;  //�߻� Ŭ������ �ʵ带 �߰��� �� �ִ����� �˾ƺ��� ���Ͽ�
	
	//�޼ҵ� ��ü�� ���� �޼ҵ�(=�߻� �޼ҵ�) ����
	public abstract double getkilosPerLiter(); 
	
	//������ �ӵ� ���
	public void printSpeed() {
		System.out.println("���� �ӵ��� " + speed + "�Դϴ�.");
	}
}
