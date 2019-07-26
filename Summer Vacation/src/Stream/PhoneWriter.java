package Stream;

import java.io.*;
import java.util.*;


public class PhoneWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		File f = new File("C:\\java\\2학년\\방과후B_JavaProject\\Summer Vacation\\src\\phone.txt");
		try {
			fw = new FileWriter(f);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine(); //한줄을 읽는다.
				if(line.equals("stop")) {
					break; //입력 종료
				}
				fw.write(line+"\r\n"); //한 줄 띄어 저장하기 위해 
			}
			System.out.println(f.getPath() + "에 저장하였습니다.");
			
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
