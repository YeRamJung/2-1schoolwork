import java.io.*;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
		FileReader reader = null;  //FileReader ��ü (���� �� ���� �б�)
		FileWriter writer = null;  //FileWriter ��ü
		FileReader reader2 = null;  //FileReader ��ü(���� �� ���� �б�)
		String answerIn="";
		String answerOut="";
		//���� �����ų ������ ã�� �� ������ ���
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���� �̸�: ");
			answerIn= sc.nextLine();  //������ ���� �̸� �Է¹ޱ� (in.txt)
			
			reader = new FileReader(answerIn); //���� ����				
			while(true) {  //������ �о ó��
				int data = reader.read();
				if(data == -1) 
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			System.out.println();
		}
		//FileReader�� �����ڰ� �߻��ϴ� �ͼ����� ó��
		catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		//FileReader�� read, close �޼ҵ尡 ����ϴ� �ͼ����� ó��
		catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�");
		}
		finally {
			try {
				reader.close();  //���� �ݱ�
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//���� �� ����� ���� �ް� �ű⿡ ���� �����ϱ�
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ��  ���� �̸�: ");
			answerOut= sc.nextLine();  //���� ��  ���� �̸� �Է¹ޱ� (out.txt)
			writer = new FileWriter(answerOut);  //���� ����
			
			char arr[] = {'��', ' ', '��', '��', '��', ' ', '��', '��', '��', '��', '��', '��'};
			for(int cnt =0; cnt<arr.length; cnt++)  //���Ͽ� �ݺ��ؼ� ���ڵ��� ����
				writer.write(arr[cnt]);
			System.out.println("������ ����Ǿ����ϴ�");
		}
		
		catch(IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�");
		}
		
		finally {
			try {
				writer.close();  //���� �ݱ�
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try{
			System.out.print("���� �� ���� ���� ����: ");
			reader2 = new FileReader(answerOut); //���� ����				
			while(true) {  //������ �о ó��
				int data = reader2.read();
				if(data == -1) 
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		}
		//FileReader�� �����ڰ� �߻��ϴ� �ͼ����� ó��
		catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		//FileReader�� read, close �޼ҵ尡 ����ϴ� �ͼ����� ó��
		catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�");
		}
		finally {
			try {
				reader2.close();  //���� �ݱ�
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
