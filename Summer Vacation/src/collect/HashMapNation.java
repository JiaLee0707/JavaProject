package collect;

import java.util.*;

public class HashMapNation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap <String,String> nation= new HashMap<String,String>();
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���.(�� : Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("���� �̸�, �α� >> ");
			nation.put(sc.next(), sc.next());
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String n = sc.next();
			if(n.equals("end)")) {
				break;
			}
			if(nation.get(n) == null) {
				System.out.println(n+" ����� �����ϴ�.");
			}
			else {
				System.out.println(n+"�� �α��� " + nation.get(n));
			}
		}
	}

}
