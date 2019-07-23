package JAVA_0723;

import java.util.*;

public class StringStack implements Stack{
	private String[] element; //������ ���� �޸�
	private int top; //index, top of stack
	public StringStack(int capacity) {
		element = new String[capacity];
		top = -1;
	}
	public int length() { //���� ���� ���� ���� ����		
		return top+1;
	}
	public int capacity() { //��ü ����ũ�� ����
		return element.length;
	}
	public String pop() {
		if(top > -1) {
			top--;
		}
		if(top == -1) //������ �����
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
