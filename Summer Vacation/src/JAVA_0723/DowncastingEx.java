package JAVA_0723;

import java.util.*;

public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("ȫ�浿"); //��ĳ���� �߻�
		Student s;
		
		s = (Student)p; //�ٿ�ĳ����
		
		System.out.println(s.name); //�����߻�
		s.grade = "A"; //���� ����
	}

}
