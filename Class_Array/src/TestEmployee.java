import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer=""; //�������������� ���� ��
		int employeeNum=0; //�����ϰ� ���� ������ȣ
		// �迭 ���� ���� ����
		Employee em[];		                               
		// �迭 ����
		em = new Employee[4];
		
		// ����ڷκ��� �����͸� �޾� �迭�� �߰�, �� �迭�� ����� �� ��ŭ ��ü�� �ν��Ͻ��� �����ϴ� ���̴�.
		for(int i=0; i<em.length; i++){
			em[i]=new Employee();  //��ü �迭 ��ĭ��ĭ���� Employee Ŭ������ ��ü�� �� ���̴�.
			System.out.print("�̸��� �Է��ϼ��� [������ȣ" + (i+1) + "]: "); 
			em[i].setName(sc.next());
			System.out.print("�ּҸ� �Է��ϼ��� [������ȣ" + (i+1) + "]: ");
			em[i].setAddress(sc.next());
			System.out.print("������ �Է��ϼ��� [������ȣ" + (i+1) + "]: ");
			em[i].setSalary(sc.nextInt());
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� [������ȣ" + (i+1) + "]: ");
			em[i].setNumber(sc.nextInt());
		}

		
		//�������� �����ϴ� ���
		System.out.println("�����Ͻðڽ��ϱ�?");
		answer=sc.next();
		
		if(answer.equals("Y")) {  //����� Y�� ���� ������ �ǵ���
			System.out.println("�����ϰ� ���� ������ȣ�� �Է��ϼ���: ");
			employeeNum=sc.nextInt();
			
			if(employeeNum==1 || employeeNum==2 || employeeNum==3 || employeeNum==4) {
				System.out.print("�̸��� �Է��ϼ���: ");  
				em[employeeNum-1].setName(sc.next());
				System.out.print("�ּҸ� �Է��ϼ���: ");
				em[employeeNum-1].setAddress(sc.next());
				System.out.print("������ �Է��ϼ���: ");
				em[employeeNum-1].setSalary(sc.nextInt());
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				em[employeeNum-1].setNumber(sc.nextInt());

				// �迭�� ����� ��� �����͸� ���
				for(int i=0; i<4; i++) {
					System.out.println("[������ȣ" + (i+1) + "]   " + em[i].toString());
				}
			}
			//���� ������ȣ�� �Է����� ���
			else
				System.out.println("���� ������ȣ�Դϴ�.");				
		}
		//������ ���� �Ͽ�
		else {
			// �迭�� ����� ��� �����͸� ���
			for(int i=0; i<4; i++) {
				System.out.println("[������ȣ" + (i+1) + "]   " + em[i].toString());
			}
		}
	}
}