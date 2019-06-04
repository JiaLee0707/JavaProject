package src;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String[] pae = { "����", "����", "��" };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// ������� �Է��� ������(1: ����, 2: ����, 3: ��, 0:��)
			System.out.println("������� �Է��� ������(1: ����, 2: ����, 3: ��, 0:��)");
			int p = scanner.nextInt();
			if(p == 0) {
				break;
			}
			// ��ǻ���� �и� ������
			int c = makeComputer();
			// ����ڿ� ��ǻ���� �и� ������
			int result = compare(p, c);
			// ����� �������
			System.out.println("�����: " + pae[p - 1] + "\t��ǻ��: " + pae[c - 1]);
			if (result == -1) {
				System.out.println("���٤Ф�");
			} else if (result == 0) {
				System.out.println("����.");
			} else {
				System.out.println("�̰��.");
			}
		}
	}

	private static int compare(int p, int c) {
//		if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if ((p + 1) % 3 == c % 3) {
			// -1: ����ڰ� ��
			return -1;
//		} else if((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		} else if (p == c) {
			// 0: ���
			return 0;
		} else {
			// 1: ����ڰ� �̱�
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		int c = random.nextInt(3 - 1 + 1) + 1; // 1~3 ������ ��
		return c;
	}

}