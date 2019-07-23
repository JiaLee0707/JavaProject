package JAVA_0723;

import java.util.*;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s= new Student("홍길동");
		p = s; //업캐스팅 발생
		
		System.out.println(p.name); //오류 없음
		
		p.grade = "A"; //컴파일 오류
		p.department = "Com" // 컴파일 오류
	}

}
