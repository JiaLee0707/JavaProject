package JAVA_0723;

import java.util.*;

public class DowncastingEx {

	public static void main(String[] args) {
		Person p = new Student("홍길동"); //업캐스팅 발생
		Student s;
		
		s = (Student)p; //다운캐스팅
		
		System.out.println(s.name); //오류발생
		s.grade = "A"; //오륭 없음
	}

}
