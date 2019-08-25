import java.io.*;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
		FileReader reader = null;  //FileReader 객체 (복사 전 파일 읽기)
		FileWriter writer = null;  //FileWriter 객체
		FileReader reader2 = null;  //FileReader 객체(복사 후 파일 읽기)
		String answerIn="";
		String answerOut="";
		//먼저 복사시킬 파일을 찾고 그 내용을 출력
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("복사할 파일 이름: ");
			answerIn= sc.nextLine();  //복사할 파일 이름 입력받기 (in.txt)
			
			reader = new FileReader(answerIn); //파일 열기				
			while(true) {  //파일을 읽어서 처리
				int data = reader.read();
				if(data == -1) 
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			System.out.println();
		}
		//FileReader의 생성자가 발생하는 익셉션을 처리
		catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다");
		}
		//FileReader의 read, close 메소드가 방생하는 익셉션을 처리
		catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		}
		finally {
			try {
				reader.close();  //파일 닫기
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//복사 후 저장될 파일 받고 거기에 내용 복사하기
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("복사 후  파일 이름: ");
			answerOut= sc.nextLine();  //복사 후  파일 이름 입력받기 (out.txt)
			writer = new FileWriter(answerOut);  //파일 열기
			
			char arr[] = {'제', ' ', '이', '름', '은', ' ', '정', '예', '람', '입', '니', '다'};
			for(int cnt =0; cnt<arr.length; cnt++)  //파일에 반복해서 문자들을 쓴다
				writer.write(arr[cnt]);
			System.out.println("파일이 복사되었습니다");
		}
		
		catch(IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다");
		}
		
		finally {
			try {
				writer.close();  //파일 닫기
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try{
			System.out.print("복사 후 파일 속의 내용: ");
			reader2 = new FileReader(answerOut); //파일 열기				
			while(true) {  //파일을 읽어서 처리
				int data = reader2.read();
				if(data == -1) 
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		}
		//FileReader의 생성자가 발생하는 익셉션을 처리
		catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다");
		}
		//FileReader의 read, close 메소드가 방생하는 익셉션을 처리
		catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		}
		finally {
			try {
				reader2.close();  //파일 닫기
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
