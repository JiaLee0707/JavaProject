import java.util.*;

public class StudnetNumber2Major {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�й� �Է� : ");
		String stuNum = sc.nextLine();
		//�й� �Է¹���
		String grade = stuNum.substring(0, 1);
		char gradeCh =stuNum.charAt(0);
		String classroom = stuNum.substring(1, 2);
		char classroomCh = stuNum.charAt(1);
		//�а� �������
		if(grade.equals("1") || grade.equals("2")) {
			//	�г��� 1, 2�̸�
			if(classroom.equals("1") || classroom.equals("2")) {
				//		���� 1, 2�̸� "���̵�����Ʈ�����"
				System.out.println("���̵�����Ʈ�����");
			} else if(classroom.equals("3") || classroom.equals("4")) {
				//		���� 3, 4�̸� "���̵�����ַ�ǰ�"
				System.out.println("���̵�����ַ�ǰ�");
			} else if(classroom.equals("3") || classroom.equals("4")) {
				//		���� 5, 6�̸� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
		} else if(gradeCh == '3') {
			//	�г��� 3�̸�
			switch(classroomCh) {
			case '1':
			case '2':
				//		���� 1, 2�̸� "���ͷ�Ƽ��̵���"
				System.out.println("���ͷ�Ƽ��̵���");
				break;
			case '3':
			case '4':
				//		���� 3, 4�̸� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
				break;
			case '5':
			case '6':
				//		���� 5, 6�̸� "���̵��ַ�ǰ�"
				System.out.println("���ͷ�Ƽ��̵���");
				break;
			}
		}
		
	}
}