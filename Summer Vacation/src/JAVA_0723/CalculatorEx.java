package JAVA_0723;

import java.util.*;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class CalculatorEx extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		int avg=0;
		for(int i=0; i<a.length; i++) {
			avg+=a[i];
		}
		avg/=a.length;
		
		return avg;
	}
	public static void main(String[] args) {
		
		Calculator c = new CalculatorEx();
		int a[] = { 2, 2, 2 };
		System.out.println(c.add(2, 2));
		System.out.println(c.subtract(2, 2));
		System.out.println(c.average(a));
	}

}
