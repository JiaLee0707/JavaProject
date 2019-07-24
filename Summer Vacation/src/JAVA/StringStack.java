package JAVA;

import java.util.*;

public class StringStack implements Stack{
	public String[] element = { null }; //스택의 저장 메모리
	private int top; //index, top of stack
	
	//public StringStack(int capacity) {
	public void StringStack11(int capacity) {
		element = new String[capacity];
		top = -1;
	}
	public int length() { //현재 스택 저장 개수 리턴		
		return top++;
	}
	public int capacity() { //전체 스택크기 리턴
		return element.length;
	}
	public String pop() {
		String s = null;
		if(top > -1) {
			s = element[top];
			top--;
		}
		if(top == -1) {//스택이 비었음
			System.out.println("stack underflow");
			return null;
		}
		return s;
		
		
	}
	public boolean push(String val) {
		if(top == element.length-1) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			length();
			element[top] = val;
			
			return true;
		}
	}
}
