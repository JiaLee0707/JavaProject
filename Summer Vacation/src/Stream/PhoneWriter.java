package Stream;

import java.io.*;
import java.util.*;


public class PhoneWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		File f = new File("C:\\java\\2�г�\\�����B_JavaProject\\Summer Vacation\\src\\phone.txt");
		try {
			fw = new FileWriter(f);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = sc.nextLine(); //������ �д´�.
				if(line.equals("stop")) {
					break; //�Է� ����
				}
				fw.write(line+"\r\n"); //�� �� ��� �����ϱ� ���� 
			}
			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");
			
			sc.close();
			fw.close();
			
			fr = new FileReader(f);
			int c;
			while ((c = fr.read()) != -1) {
				System.out.println("");
			}
		}

	}

}
