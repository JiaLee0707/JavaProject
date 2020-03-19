import java.util.*;

public class UpDown {

	public static void main(String[] args) {
		//makeAnswer
		Random random = new Random();
		int answer = random.nextInt(100+1); //1~100
		while(true) {
			System.out.println("(1~100)숫자를 입력하시오 : ");
			//input
			Scanner sc = new Scanner(System.in);
			int youser = sc.nextInt();
			//비교
			if(answer > youser) {
				System.out.println("Up");
			}
			else if(answer < youser) {
				System.out.println("Down");
			}
			else {
				// 결과
				// ==탈출
				System.out.println("정답");
				break;
			}
		}
	}

}
