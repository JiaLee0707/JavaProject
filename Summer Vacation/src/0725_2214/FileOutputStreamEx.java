package Stream;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\java\\2학년\\방과후B_JavaProject\\Summer Vacation\\src\\test.txt");
			FileInputStream fin = null;
			
			for(int i=0; i<10; i++) {
				int n = 10-i; //계산의 결과를 저장
				fout.write(n);
			}
			fout.close(); //스트림을 단는다.
			
			fin = new FileInputStream("C:\\java\\2학년\\방과후B_JavaProject\\Summer Vacation\\src\\test.txt");
			int c=0;
			while ((c = fin.read()) != -1) {
				System.out.println(c + " ");
			}
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("입출력 오류");
		}
	}

}
