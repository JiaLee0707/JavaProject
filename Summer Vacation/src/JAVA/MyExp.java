package JAVA;
import java.util.*;

public class MyExp {
	int a;
	int b;

	public MyExp(int x, int y) {
		this.a = x;
		this.b = y;
	}

	public int getValue() {
		int sum=1;
		for(int i=0; i<b; i++) {
			sum*=a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		MyExp number1 = new MyExp(2, 3);
		System.out.println(number1.getValue());
	}


}
