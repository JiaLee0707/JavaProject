import java.util.*;

public class UpDown {

	public static void main(String[] args) {
		//makeAnswer
		Random random = new Random();
		int answer = random.nextInt(100+1); //1~100
		while(true) {
			System.out.println("(1~100)���ڸ� �Է��Ͻÿ� : ");
			//input
			Scanner sc = new Scanner(System.in);
			int youser = sc.nextInt();
			//��
			if(answer > youser) {
				System.out.println("Up");
			}
			else if(answer < youser) {
				System.out.println("Down");
			}
			else {
				// ���
				// ==Ż��
				System.out.println("����");
				break;
			}
		}
	}

}
