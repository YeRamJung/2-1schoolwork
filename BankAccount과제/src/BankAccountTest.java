public class BankAccountTest {
	public static void main(String args[]) {
		/*//�ѵ�
		CreditLineAccount obj1 = new CreditLineAccount("000-11-1111", "������", 10000, 20000000);
		
		try {
			int amount = obj1.withdraw(50000);
			System.out.println("�����: "+ amount);
			System.out.println("�ܾ�: "+ obj1.balance);
			System.out.println("���̳ʽ� �ѵ�: "+ obj1.creditLine);	
		}
		
		catch(Exception e){
			System.out.print(e.getMessage());
		}
		*/
		
		/*//ī���ȣ
		CheckingAccount obj2 = new CheckingAccount("111-22-3333", "������", 0, "555-666-777-888");
		obj.deposit(100000);
		
		try {
			int paidAccount = obj2.pay("555-666-777-888", 47000);
			System.out.println("���Ҿ�: " + paidAccount);
			System.out.println("�ܾ�: " + obj2.balance);
		}
		
		catch(Exception e) {	
			System.out.print(e.getMessage());
			
		}
		*/
		
		//����Ʈ
		BonusPointAccount obj3 = new BonusPointAccount("333-33-3333", "������", 0,0);
		obj3.deposit(1000000);
		
		System.out.println("�ܞB: " + obj3.balance);
		System.out.println("��������Ʈ: " + obj3.bonusPoint);
	}
}