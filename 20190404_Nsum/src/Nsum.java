import java.util.*;

public class Nsum {

	public static void main(String[] args) {
		//���� String���� �Է¹��� <= �ڸ����� �˱� ���ؼ� <= 0~�ڸ���-1���� �ϳ��� �߶� ���ؾ���
		Scanner sc=new Scanner(System.in);
		String number = sc.nextLine();
		//�� �ڸ����� ���� ������
		int length = number.length();
		int sum=0;
		for(int i=0; i<length; i++) {
			//0~�ڸ���-1���� �ݺ�����
			//	�ѱ��ھ� �����ͼ� ���ڷ� �ٲ���
			char n = number.charAt(i);
			//	sum�� ������	
			sum += n - '0';
		}
		//���� ���� �������
		System.out.println(sum);
		
		
		/*System.out.println("���� �Է� : ");
		String numString = sc.nextLine();
		int sum=0;
		for(int i=0; i<numString.length(); i++) {
			sum += numString.charAt(i) - '0';
		}
		System.out.println("�ڸ��� �� : "+sum);*/
	}

}
