import java.util.*;

public class NumberToWeetday {

	public static void main(String[] args) {
		String[] weekdays = {"��", "ȭ", "��", "��", "��", "��", "��"};
		//�����Է�����
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(weekdays[num-1]+"����");
		//���� ������� (1 => ������, 2 => ȭ����, ..., 7 => �Ͽ���)

		/*System.out.print("���ڸ� �Է��Ͻÿ�(1~7) : ");
		switch(num) {
		case 1: System.out.println("������"); break;
		case 2: System.out.println("ȭ����");	break;
		case 3: System.out.println("������"); break;
		case 4: System.out.println("�����"); break;
		case 5: System.out.println("�ݿ���"); break;
		case 6: System.out.println("�����"); break;
		case 7: System.out.println("�Ͽ���"); break;
		}*/
		
	}

}
