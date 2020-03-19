package collect;

import java.util.*;

public class VectorBig {

	public static <E> void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int big;
		while(true){
			System.out.print("정수(-1이 입력될 때까지)>> ");
			int n=sc.nextInt();
			if(n == -1) break;
			v.add(n);
		}
		big = v.get(0);
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)>big) big=v.get(i);
		}
		System.out.println("가장 큰 정수는 "+big);
	}
}
//	public printBig() {
//		
//	}
//		while(true) {
//			int n = sc.nextInt();
//			if(n==-1) break;
//			v.add(n);
//		}
//		if(v.size() == 0) {
//			System.out.println("수가 하나도 없음");
//			sc.close();
//			return;
//		}
//		
//		printBig(v); //백터 v의 정수 중 가장 큰 수 출력
//		sc.close();
