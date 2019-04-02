import java.util.*;

public class UpDownBot {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		//makeGuess start~end 까지 랜덤
		while(true) {
			//int guess=random.nextInt(end+1-start)+start; //멍청 기법
			int guess=(end-start)/2; //최적화 기법	
			System.out.println(guess+"입니까? (1.정답, 2.up, 3.down)");
			//input(up/down/정답) 1: 정답, 2:Up, 3:Down
			int answer = sc.nextInt();
			if(answer == 1) {
				//정답이면 정답입니다 출력 끝
				System.out.println("정답입니다.");
				break;
			} else if(answer == 2) {
				//up이면 guess+1 ~ end
				start = guess+1;
			} else if(answer == 3) {
				//down이면 start ~ guess-1
				end = guess-1;
			}
		}
	}
}
