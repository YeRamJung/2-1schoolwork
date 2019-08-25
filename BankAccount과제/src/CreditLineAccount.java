public class CreditLineAccount extends BankAccount{  //���̳ʽ� ������ ��Ÿ���� ����Ŭ����
	int creditLine; //���̳ʽ� �ѵ�
	//������
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	//������ - �޼ҵ� �������̵�: ����Ŭ������ �ִ� �޼ҵ�� ���� �̸������� �ȿ� ������ �ٸ� �޼ҵ� �����
	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount)
			throw new Exception("������ �Ұ����մϴ�");
		balance-=amount;
		return amount;
	}
}
