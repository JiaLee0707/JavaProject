package JAVA;

import java.util.*;

public class ArrayStatic {
	static int[] add(int a[], int b[]) {
		int lenght = a.length + b.length;
		int x[] = new int[lenght];
		for(int i = 0; i< lenght; i++) { 
			if(i<a.length) {
				x[i] = a[i];
			} else {
				x[i] = b[i-a.length];
			}
		}
		return x;
	}
	static void print(int x[]) {
		System.out.print("[");
		for(int i=0; i<x.length; i++) {
			System.out.print(" " +x[i]+" ");
		}
		System.out.println("]");
	}
	

}
