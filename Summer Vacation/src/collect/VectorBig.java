package collect;

import java.util.*;

public class VectorBig {

	public static <E> void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int big;
		while(true){
			System.out.print("����(-1�� �Էµ� ������)>> ");
			int n=sc.nextInt();
			if(n == -1) break;
			v.add(n);
		}
		big = v.get(0);
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)>big) big=v.get(i);
		}
		System.out.println("���� ū ������ "+big);
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
//			System.out.println("���� �ϳ��� ����");
//			sc.close();
//			return;
//		}
//		
//		printBig(v); //���� v�� ���� �� ���� ū �� ���
//		sc.close();
