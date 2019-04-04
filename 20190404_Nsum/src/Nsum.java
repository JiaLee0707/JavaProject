import java.util.*;

public class Nsum {

	public static void main(String[] args) {
		//숫자 String으로 입력받자 <= 자릿수를 알기 위해서 <= 0~자릿수-1까지 하났기 잘라서 더해야함
		Scanner sc=new Scanner(System.in);
		String number = sc.nextLine();
		//각 자릿수의 수를 더하자
		int length = number.length();
		int sum=0;
		for(int i=0; i<length; i++) {
			//0~자릿수-1까지 반복하자
			//	한글자씩 가져와서 숫자로 바꾸자
			char n = number.charAt(i);
			//	sum에 더하자	
			sum += n - '0';
		}
		//더한 값을 출력하자
		System.out.println(sum);
		
		
		/*System.out.println("숫자 입력 : ");
		String numString = sc.nextLine();
		int sum=0;
		for(int i=0; i<numString.length(); i++) {
			sum += numString.charAt(i) - '0';
		}
		System.out.println("자리수 합 : "+sum);*/
	}

}
