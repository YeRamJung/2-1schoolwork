abstract public class BankAccount {  //추상클래스는 객체 생성이 안된다
	String accountNo; //계좌번호
	String ownerName; //예금주명
	int balance; //잔고 
	
	//생성자
	BankAccount(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	//예입 메소드(저금)
	void deposit(int amount) {
		balance+=amount;  //저금하는 금액만큼을 잔고에 추가시킨다.         
		}
	
	//예금 인출 메소드(인출)
	int withdraw(int amount) throws Exception {  //메소드가 발생하는 익셉션의 종류를 표시하는 throws절
		if(balance<amount)  //인출하려는 금액이 잔고보다 클때 인출되지 않도록
			throw new Exception("잔액이 부족합니다");  //익셉션 발생
			balance-=amount;  //인출하는 금액만큼 잔고에서 뺀다.
			return amount;
	}
}