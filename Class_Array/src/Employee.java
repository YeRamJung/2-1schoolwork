public class Employee {
	private String name; //���� �̸�
	private String address; //�ּ�
	private int anual_salary;  //����
	private int phone; //��ȭ��ȣ
	
	// ���� �ʵ忡 ���� getter�� setter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setSalary(int anual_salary) {
		this.anual_salary=anual_salary;
	}
	
	public int getSalary() {
		return anual_salary;
	}
	
	public void setNumber(int phone) {
		this.phone=phone;
	}
	
	public int getNumber() {
		return phone;
	}
	
	// toString()�޼ҵ�
	public String toString() {
		return "Name: " + getName() + " Address: "+ getAddress() + " Anual_salary: "+ getSalary() + " Phone: "+ getNumber();
	} 
}