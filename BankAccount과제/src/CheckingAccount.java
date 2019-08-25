public class CheckingAccount extends BankAccount {  //����Ŭ����
	String cardNo;  //ī���ȣ
	//����Ŭ������ ������ - �̹� ����Ŭ������ �����ڰ� �����Ƿ�, ���� ó�� ��ɹ��� super�����ϱ�
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
	}
	
	//���ο� �޼ҵ� �߰�  - ī���ȣ ��ġ ���� �Ǵ�, ��ġ�ϸ� ��ݽ����ֱ�
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�");
		return withdraw(amount);
	}	
}
