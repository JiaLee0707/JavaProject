package Stream;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		//FileReader in = null;
		FileInputStream fin = null;
		InputStreamReader in = null;
		try {
			//���Ϸκ��� ���� �Է� ��Ʈ�� ����
			//in = new FileReader("C:\\java\\2�г�\\�����B_JavaProject\\Summer Vacation\\src\\test.txt\\hangul.txt");
			fin = new FileInputStream("C:\\java\\2�г�\\�����B_JavaProject\\Summer Vacation\\src\\hangul.txt");
			in = new InputStreamReader(fin, "MS949");
			
			int c;
			while ((c = in.read()) != -1) { //�� ���ھ� �д´�.
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
