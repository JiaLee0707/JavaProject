package JAVA;

import java.util.*;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� : ");
		int count = sc.nextInt();
		
		//StringStack ss = new StringStack(count);
		StringStack ss = new StringStack();
		ss.StringStack11(count);
		
		while(true) {
			System.out.print("���ڿ� �Է�(�� ���� end �Է�) >> ");
			String str = sc.next();
			if(str.equals("end")) {
				break;
			}
			ss.push(str);
		}
		
		while(true) {
			System.out.print("pop �Ͻðڽ��ϱ�?(y or n) >> ");
			String c = sc.next();
			if(c.equals("y")) {
				System.out.println(ss.pop() + " pop!!");
			}
			else if(c.equals("n")) {
				break;
			}
			else continue;
		}
		
		sc.close();
	}

}
