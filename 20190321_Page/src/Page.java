import java.util.*;
public class Page {

	public static void main(String[] args) {
		//String
		//String inputString = scanner.nextLine(); //���� �� �д�
		//int
		//int inputInt = scanner.nextInt(); //���� �� �д�
		
		/*Scanner sc=new Scanner(System.in);
		
		while(true) { 
			//int post=331;
			System.out.print("�Խù� ������ �Է��Ͻÿ�(����) : ");
			int post=sc.nextInt();
			if(post==exit(0)) {
				System.out.println("��");
				break;
			}
			int page=post/7;
			if(!(post%7==0)) {
				page++;
			}
			System.out.println((int)post+"���� �Խù��� "+(int)page+"�� ��������ũ�� ǥ�õȴ�.");
		}*/
		
		/*Scanner sc=new Scanner(System.in);
		
		while(true) { 
			//int post=331;
			System.out.print("�Խù� ������ �Է��Ͻÿ�(����) : ");
			int post=sc.nextInt();
			
			int page=post/7;
			if(!(post%7==0)) {
				page++;
			}
			System.out.println((int)post+"���� �Խù��� "+(int)page+"�� ��������ũ�� ǥ�õȴ�.");
		}*/

		//if(result == 0)
		//System.out.println("��");
		//break;
		
		while(true) {
			//input
			Scanner scanner=new Scanner(System.in);
			int nPerPage = 7;
			System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������) : ");
			String inputString = scanner.nextLine();
			//if exit? -> exit
			if(inputString.equals("exit")) {
				System.out.println("��");
				break;
			}
			//String -> int
			int result = Integer.parseInt(inputString);//���ڷ� ��ȯ
			//calculate page
			int ��� =result / nPerPage;
			if(result%nPerPage != 0) {
				��� = result / nPerPage +1;
			}
			System.out.println(��� +"�������� �ʿ��մϴ�.");
		}
	}
}
