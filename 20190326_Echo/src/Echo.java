import java.util.*;

public class Echo {

	public static void main(String[] args) {
		System.out.println("�ڽŰ� ����");
		//�ݺ�
		while(true) {
			Scanner sc=new Scanner(System.in);
			//input
			System.out.print("�޾Ƹ� : ");
			String inputString = sc.nextLine();
			//������ ����
			if(inputString.equals("exit")) {
				//���� ���
				System.out.println("�ȳ�, �߰�");
				break;
			}
			System.out.println(inputString);
		}
	}

}
