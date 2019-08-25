abstract public class BankAccount {  //�߻�Ŭ������ ��ü ������ �ȵȴ�
	String accountNo; //���¹�ȣ
	String ownerName; //�����ָ�
	int balance; //�ܰ� 
	
	//������
	BankAccount(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	//���� �޼ҵ�(����)
	void deposit(int amount) {
		balance+=amount;  //�����ϴ� �ݾ׸�ŭ�� �ܰ� �߰���Ų��.         
		}
	
	//���� ���� �޼ҵ�(����)
	int withdraw(int amount) throws Exception {  //�޼ҵ尡 �߻��ϴ� �ͼ����� ������ ǥ���ϴ� throws��
		if(balance<amount)  //�����Ϸ��� �ݾ��� �ܰ��� Ŭ�� ������� �ʵ���
			throw new Exception("�ܾ��� �����մϴ�");  //�ͼ��� �߻�
			balance-=amount;  //�����ϴ� �ݾ׸�ŭ �ܰ��� ����.
			return amount;
	}
}