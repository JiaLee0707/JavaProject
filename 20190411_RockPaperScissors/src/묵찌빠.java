package src;

import java.util.Random;
import java.util.Scanner;

public class 묵찌빠 {

		public static void main(String[] args) {
			boolean winPlayer = false;
			boolean winner = false;
			String[] pae = {"찌", "묵", "빠"};
			Scanner sc=new Scanner(System.in);
			while(true) {
				//사용자의 입력을 받는다.(1:가위, 2:바위, 3:보, 0:끝)
				System.out.println("사용자의 입력을 받는다.(1:찌, 2:묵, 3:빠, 0:끝)");
				int p = sc.nextInt();
				if(p==0) {
					break;
				}
				//컴퓨터의 패를 구하자
				int c=makeComputer();
				//사용자와 컴퓨터의 패를 비교하자
				int result = compare(p, c);
				
				//결과를 출력하자
				System.out.println("사용자 : " + pae[p-1] + "\t\t컴퓨터 : " + pae[c-1]);
				if(result == -1) {
					//이전 결과 갖고 있기
					winPlayer = false;
					winner = true;
				}else if(result == 0) {
					if(winner == true) {
						//승패가 갈린다음에 비기면, 게임끝. 이전 승자가 승. 결과를 알려주자
						if(winner == true) {
							System.out.println("이겼다!");
						}else {
							System.out.println("졌다;;");
						}
					}else {
						//처음 비기면 다시	
					}	
				}else {
					//이전 결과 갖고 있기
					winPlayer = true;
					winner = true;
				}			
			}
		
		}

		private static int compare(int p, int c) {
			if((p + 1)%3==c % 3) {
				//-1: 사용자 짐
				return -1;
			}else if(p==c) {
				//0: 비금
				return 0;
			}else {
				//1: 사용자 이김
				return 1;
			}
		}

		private static int makeComputer() {
			Random random = new Random();
			int c=random.nextInt(3-1+1)+1; // 1~3 임의의 수
			return c;
		}
}