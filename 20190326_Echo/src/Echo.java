import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ڽŰ� ����");
		while(true) {
			System.out.print("�޾Ƹ� : ");
			String inputString = sc.nextLine();
			if(inputString.equals("exit")) {
				break;
			}
			System.out.println(inputString);
		}
	}

}
