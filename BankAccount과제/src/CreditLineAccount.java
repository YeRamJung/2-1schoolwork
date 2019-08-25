public class CreditLineAccount extends BankAccount{  //마이너스 통장을 나타내는 서브클래스
	int creditLine; //마이너스 한도
	//생성자
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	//재정의 - 메소드 오버라이딩: 슈퍼클래스에 있는 메소드와 같은 이름이지만 안에 로직이 다른 메소드 만들기
	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다");
		balance-=amount;
		return amount;
	}
}
