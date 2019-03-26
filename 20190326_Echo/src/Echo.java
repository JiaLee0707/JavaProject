import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("자신감 갖기");
		while(true) {
			System.out.print("메아리 : ");
			String inputString = sc.nextLine();
			if(inputString.equals("exit")) {
				break;
			}
			System.out.println(inputString);
		}
	}

}
