package Stream;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\java\\2학년\\방과후B_JavaProject\\Summer Vacation\\src\\test.txt");
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
