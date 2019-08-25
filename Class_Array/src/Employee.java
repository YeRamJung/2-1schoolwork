public class Employee {
	private String name; //직원 이름
	private String address; //주소
	private int anual_salary;  //연봉
	private int phone; //전화번호
	
	// 각각 필드에 대한 getter와 setter 메소드
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
	
	// toString()메소드
	public String toString() {
		return "Name: " + getName() + " Address: "+ getAddress() + " Anual_salary: "+ getSalary() + " Phone: "+ getNumber();
	} 
}