import java.util.*;

public class NumberToWeetday {

	public static void main(String[] args) {
		String[] weekdays = {"월", "화", "수", "목", "금", "토", "일"};
		//숫자입력하자
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(weekdays[num-1]+"요일");
		//요일 출력하자 (1 => 월요일, 2 => 화요일, ..., 7 => 일요일)

		/*System.out.print("숫자를 입력하시오(1~7) : ");
		switch(num) {
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일");	break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		case 7: System.out.println("일요일"); break;
		}*/
		
	}

}
