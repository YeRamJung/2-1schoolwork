public class BonusPointAccount extends BankAccount {  //����Ŭ���� - ����Ʈ ����
	int bonusPoint; //���ʽ�����Ʈ
	
	//������
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}
	
	//����Ŭ������ �޼ҵ� ������ - ��ӹ��� �޼ҵ��� ������ �ܼ��� Ȯ���ϴ� ���� ��
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint+=(int) (amount * 0.001);
	}
}
