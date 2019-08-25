public class BankAccountTest {
	public static void main(String args[]) {
		/*//한도
		CreditLineAccount obj1 = new CreditLineAccount("000-11-1111", "정예람", 10000, 20000000);
		
		try {
			int amount = obj1.withdraw(50000);
			System.out.println("인출액: "+ amount);
			System.out.println("잔액: "+ obj1.balance);
			System.out.println("마이너스 한도: "+ obj1.creditLine);	
		}
		
		catch(Exception e){
			System.out.print(e.getMessage());
		}
		*/
		
		/*//카드번호
		CheckingAccount obj2 = new CheckingAccount("111-22-3333", "정예람", 0, "555-666-777-888");
		obj.deposit(100000);
		
		try {
			int paidAccount = obj2.pay("555-666-777-888", 47000);
			System.out.println("지불액: " + paidAccount);
			System.out.println("잔액: " + obj2.balance);
		}
		
		catch(Exception e) {	
			System.out.print(e.getMessage());
			
		}
		*/
		
		//포인트
		BonusPointAccount obj3 = new BonusPointAccount("333-33-3333", "정예람", 0,0);
		obj3.deposit(1000000);
		
		System.out.println("잔얙: " + obj3.balance);
		System.out.println("누적포인트: " + obj3.bonusPoint);
	}
}