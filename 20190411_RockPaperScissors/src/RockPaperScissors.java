package src;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String[] pae = { "가위", "바위", "보" };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// 사용자의 입력을 받하자(1: 가위, 2: 바위, 3: 보, 0:끝)
			System.out.println("사용자의 입력을 받하자(1: 가위, 2: 바위, 3: 보, 0:끝)");
			int p = scanner.nextInt();
			if(p == 0) {
				break;
			}
			// 컴퓨터의 패를 구하자
			int c = makeComputer();
			// 사용자와 컴퓨터의 패를 비교하자
			int result = compare(p, c);
			// 결과를 출력하자
			System.out.println("사용자: " + pae[p - 1] + "\t컴퓨터: " + pae[c - 1]);
			if (result == -1) {
				System.out.println("졌다ㅠㅠ");
			} else if (result == 0) {
				System.out.println("비겼다.");
			} else {
				System.out.println("이겼다.");
			}
		}
	}

	private static int compare(int p, int c) {
//		if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if ((p + 1) % 3 == c % 3) {
			// -1: 사용자가 짐
			return -1;
//		} else if((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		} else if (p == c) {
			// 0: 비김
			return 0;
		} else {
			// 1: 사용자가 이김
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		int c = random.nextInt(3 - 1 + 1) + 1; // 1~3 임의의 수
		return c;
	}

}