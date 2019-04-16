package src;

import java.util.Random;
import java.util.Scanner;

public class ����� {

		public static void main(String[] args) {
			boolean winPlayer = false;
			boolean winner = false;
			String[] pae = {"��", "��", "��"};
			Scanner sc=new Scanner(System.in);
			while(true) {
				//������� �Է��� �޴´�.(1:����, 2:����, 3:��, 0:��)
				System.out.println("������� �Է��� �޴´�.(1:��, 2:��, 3:��, 0:��)");
				int p = sc.nextInt();
				if(p==0) {
					break;
				}
				//��ǻ���� �и� ������
				int c=makeComputer();
				//����ڿ� ��ǻ���� �и� ������
				int result = compare(p, c);
				
				//����� �������
				System.out.println("����� : " + pae[p-1] + "\t\t��ǻ�� : " + pae[c-1]);
				if(result == -1) {
					//���� ��� ���� �ֱ�
					winPlayer = false;
					winner = true;
				}else if(result == 0) {
					if(winner == true) {
						//���а� ���������� ����, ���ӳ�. ���� ���ڰ� ��. ����� �˷�����
						if(winner == true) {
							System.out.println("�̰��!");
						}else {
							System.out.println("����;;");
						}
					}else {
						//ó�� ���� �ٽ�	
					}	
				}else {
					//���� ��� ���� �ֱ�
					winPlayer = true;
					winner = true;
				}			
			}
		
		}

		private static int compare(int p, int c) {
			if((p + 1)%3==c % 3) {
				//-1: ����� ��
				return -1;
			}else if(p==c) {
				//0: ���
				return 0;
			}else {
				//1: ����� �̱�
				return 1;
			}
		}

		private static int makeComputer() {
			Random random = new Random();
			int c=random.nextInt(3-1+1)+1; // 1~3 ������ ��
			return c;
		}
}