import java.util.*;

public class UpDownBot {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		//makeGuess start~end ���� ����
		while(true) {
			//int guess=random.nextInt(end+1-start)+start; //��û ���
			int guess=(end-start)/2; //����ȭ ���	
			System.out.println(guess+"�Դϱ�? (1.����, 2.up, 3.down)");
			//input(up/down/����) 1: ����, 2:Up, 3:Down
			int answer = sc.nextInt();
			if(answer == 1) {
				//�����̸� �����Դϴ� ��� ��
				System.out.println("�����Դϴ�.");
				break;
			} else if(answer == 2) {
				//up�̸� guess+1 ~ end
				start = guess+1;
			} else if(answer == 3) {
				//down�̸� start ~ guess-1
				end = guess-1;
			}
		}
	}
}
