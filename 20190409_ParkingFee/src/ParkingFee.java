import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fee;
		
		while(true) {
			//���� �Է¹���
			System.out.print("���� �Է��ϼ��� : ");
			int parkingMinutes=sc.nextInt();
			if(parkingMinutes == 0)
				break;
			
			//�����ð� != 24
			if(parkingMinutes > 24*60) {
				System.out.println("�����ð� 24�ð��� �Ѿ����ϴ�. ����� ���� ���� �����Դϴ�^^");
			}
			//��<=30�̸�, 1500
			if(parkingMinutes <= 30) {
				fee = 1500;
			} else {
				//�ƴϰ�,
				//��-30, ���+=1500
				fee = 1500;
				int Minutes = parkingMinutes-30;
				//��� += (��/10)*1000
				fee += (Minutes / 10) * 1000;
				//��%10
				if(Minutes % 10 != 0) {
					fee+=1000;
				}
			}
			System.out.println("������� : "+ fee + "��");
			if(fee > 25000) {
				System.out.println("�Ϸ� �ִ��� 25000���� �Ѿ����ϴ�.");
			}
		}
		/*if(0 <= parkingMinutes && parkingMinutes < 30) {
			fee = 2000;
		} else {
			//(���� �ڸ�-1)*1000 + (�����ڸ��� 1�̻��̸�)1000
			int �����ڸ� = parkingMinutes/10;
			int �����ڸ� = parkingMinutes%10;
			fee = (�����ڸ� - 1)*1000;
			if(�����ڸ� >= 1)
				fee += 1000;
		}
		System.out.println(fee + "��");*/
		
		
	}

}
