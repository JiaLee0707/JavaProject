package collect;

import java.util.*;

public class HashMapNation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap <String,String> nation= new HashMap<String,String>();
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예 : Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nation.put(sc.next(), sc.next());
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String n = sc.next();
			if(n.equals("end)")) {
				break;
			}
			if(nation.get(n) == null) {
				System.out.println(n+" 나라는 없습니다.");
			}
			else {
				System.out.println(n+"의 인구는 " + nation.get(n));
			}
		}
	}

}
