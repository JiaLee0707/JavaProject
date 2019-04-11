import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fee;
		
		while(true) {
			//분을 입력받자
			System.out.print("분을 입력하세요 : ");
			int parkingMinutes=sc.nextInt();
			if(parkingMinutes == 0)
				break;
			
			//주차시간 != 24
			if(parkingMinutes > 24*60) {
				System.out.println("주차시간 24시간을 넘었습니다. 당신의 차는 이제 제꺼입니다^^");
			}
			//분<=30이면, 1500
			if(parkingMinutes <= 30) {
				fee = 1500;
			} else {
				//아니고,
				//분-30, 요금+=1500
				fee = 1500;
				int Minutes = parkingMinutes-30;
				//요금 += (분/10)*1000
				fee += (Minutes / 10) * 1000;
				//분%10
				if(Minutes % 10 != 0) {
					fee+=1000;
				}
			}
			System.out.println("주차요금 : "+ fee + "원");
			if(fee > 25000) {
				System.out.println("하루 최대의 25000원을 넘었습니다.");
			}
		}
		/*if(0 <= parkingMinutes && parkingMinutes < 30) {
			fee = 2000;
		} else {
			//(십의 자리-1)*1000 + (일의자리가 1이상이면)1000
			int 십의자리 = parkingMinutes/10;
			int 일의자리 = parkingMinutes%10;
			fee = (십의자리 - 1)*1000;
			if(일의자리 >= 1)
				fee += 1000;
		}
		System.out.println(fee + "원");*/
		
		
	}

}
