import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer=""; //수정할지말지에 대한 답
		int employeeNum=0; //수정하고 싶은 직원번호
		// 배열 참조 변수 선언
		Employee em[];		                               
		// 배열 생성
		em = new Employee[4];
		
		// 사용자로부터 데이터를 받아 배열에 추가, 즉 배열로 선언된 수 만큼 객체의 인스턴스를 생성하는 것이다.
		for(int i=0; i<em.length; i++){
			em[i]=new Employee();  //객체 배열 한칸한칸마다 Employee 클래스의 객체가 들어갈 것이다.
			System.out.print("이름을 입력하세요 [직원번호" + (i+1) + "]: "); 
			em[i].setName(sc.next());
			System.out.print("주소를 입력하세요 [직원번호" + (i+1) + "]: ");
			em[i].setAddress(sc.next());
			System.out.print("연봉을 입력하세요 [직원번호" + (i+1) + "]: ");
			em[i].setSalary(sc.nextInt());
			System.out.print("전화번호를 입력하세요 [직원번호" + (i+1) + "]: ");
			em[i].setNumber(sc.nextInt());
		}

		
		//직원정보 수정하는 경우
		System.out.println("수정하시겠습니까?");
		answer=sc.next();
		
		if(answer.equals("Y")) {  //대답이 Y일 때만 수정이 되도록
			System.out.println("수정하고 싶은 직원번호를 입력하세요: ");
			employeeNum=sc.nextInt();
			
			if(employeeNum==1 || employeeNum==2 || employeeNum==3 || employeeNum==4) {
				System.out.print("이름을 입력하세요: ");  
				em[employeeNum-1].setName(sc.next());
				System.out.print("주소를 입력하세요: ");
				em[employeeNum-1].setAddress(sc.next());
				System.out.print("연봉을 입력하세요: ");
				em[employeeNum-1].setSalary(sc.nextInt());
				System.out.print("전화번호를 입력하세요 : ");
				em[employeeNum-1].setNumber(sc.nextInt());

				// 배열에 저장된 모든 데이터를 출력
				for(int i=0; i<4; i++) {
					System.out.println("[직원번호" + (i+1) + "]   " + em[i].toString());
				}
			}
			//없는 직원번호를 입력했을 경우
			else
				System.out.println("없는 직원번호입니다.");				
		}
		//수정을 안할 겅우
		else {
			// 배열에 저장된 모든 데이터를 출력
			for(int i=0; i<4; i++) {
				System.out.println("[직원번호" + (i+1) + "]   " + em[i].toString());
			}
		}
	}
}