package JAVA_0723;

import java.util.*;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s= new Student("ȫ�浿");
		p = s; //��ĳ���� �߻�
		
		System.out.println(p.name); //���� ����
		
		p.grade = "A"; //������ ����
		p.department = "Com" // ������ ����
	}

}
