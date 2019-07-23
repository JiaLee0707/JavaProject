package JAVA_0723;

import java.util.*;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 : ");
		int count = sc.nextInt();
		
		StringStack ss = new StringStack(count);
		
		while(true) {
			System.out.print("문자열 입력(다 차면 end 입력) >> ");
			String str = sc.next();
			if(str.equals("end")) {
				break;
			}
			ss.push(str);
		}
		while(true) {
			System.out.print("pop 하시겠습니까?(y or n) >> ");
			String c = sc.next();
			if(c.equals("y")) {
				ss.pop();
			}
			else if(c.equals("n")) {
				break;
			}
		}
	}

}
