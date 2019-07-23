package JAVA_0723;

import java.util.*;

public class StringStack implements Stack{
	private String[] element; //스택의 저장 메모리
	private int top; //index, top of stack
	public StringStack(int capacity) {
		element = new String[capacity];
		top = -1;
	}
	public int length() { //현재 스택 저장 개수 리턴		
		return top+1;
	}
	public int capacity() { //전체 스택크기 리턴
		return element.length;
	}
	public String pop() {
		if(top > -1) {
			top--;
		}
		if(top == -1) //스택이 비었음
			System.out.println("stack underflow");
		return "s";
	}
	public boolean push(String val) {
		if(top == element.length-1) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			element[++top] = val;
			
			return true;
		}
	}
}
