package BoxProject;

public class BoxTest {
	public static void main(String[] args) {
		Box box1; //�������� box1 ����
		box1 = new Box();  //box1�� ���� ��ü ����Ű�Բ�
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());  //����,����,���� ���� 100�� ���� ���� ȣ��
		
		System.out.println(box1);  //box1 ����غ���
		
		Box box2 = new Box(); //�ι�° ���� ��ü box2 ����
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		System.out.println(box2.getVolume());  //����,����,���� ���� 200�� ���� ���� ȣ�� 
		
		box1= box2; //box2�� box1�� ����
		System.out.println(box1.getWidth());  //�����ڸ� ���Ͽ� box1�� �Ӽ��� ���
		System.out.println(box1.getLength()); //�����ڸ� ���Ͽ� box1�� �Ӽ��� ���
		System.out.println(box1.getHeight()); //�����ڸ� ���Ͽ� box1�� �Ӽ��� ���
	}
}
