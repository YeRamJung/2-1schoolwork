public class BonusPointAccount extends BankAccount {  //서브클래스 - 포인트 적립
	int bonusPoint; //보너스포인트
	
	//생성자
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}
	
	//슈퍼클래스의 메소드 재정의 - 상속받은 메소드의 로직을 단순히 확장하는 것일 때
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint+=(int) (amount * 0.001);
	}
}
