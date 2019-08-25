public class CheckingAccount extends BankAccount {  //서브클래스
	String cardNo;  //카드번호
	//서브클래스의 생성자 - 이미 슈퍼클래스에 생성자가 있으므로, 가장 처음 명령문에 super선언하기
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
	}
	
	//새로운 메소드 추가  - 카드번호 일치 여부 판단, 일치하면 출금시켜주기
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다");
		return withdraw(amount);
	}	
}
