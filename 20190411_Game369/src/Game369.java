
public class Game369 {

	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			//숫자 -> 문자
			String numberString=String.valueOf(i);
			//하나씩 떼서 '3' or '6' or '9'의 개수를 센다
			int count = count369(numberString);
			if(count == 0) {
				//개수가 0이면, 그냥 숫자출력
				System.out.println(i);
			} else {
				//아니면,
				//	개수대로 "짝"출력
				for(int j=0; j<count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}			
		}
	}

	private static int count369(String numberString) {
		//0 ~ lenght-1까지
		//	문자를 하났기 구하고
		//	그문자가 '3' or '6' or '9'이면 짝
		int sum=0;
		for(int i=0; i<numberString.length(); i++) {
			char ch =numberString.charAt(i);
			if(ch == '3' || ch == '6' || ch == '9') {
				sum++;
			}
		}
		
		return sum;
	}

}
