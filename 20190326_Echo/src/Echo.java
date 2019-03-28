import java.util.*;

public class Echo {

	public static void main(String[] args) {
		System.out.println("자신감 갖기");
		//반복
		while(true) {
			Scanner sc=new Scanner(System.in);
			//input
			System.out.print("메아리 : ");
			String inputString = sc.nextLine();
			//변수에 대입
			if(inputString.equals("exit")) {
				//변수 출력
				System.out.println("안녕, 잘가");
				break;
			}
			System.out.println(inputString);
		}
	}

}
