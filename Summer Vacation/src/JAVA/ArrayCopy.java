package JAVA;

import java.util.*;

public class ArrayCopy {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하시오 : ");
		//char str[] = sc.next().charAt();
		char str[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ' , 'p', 'e', 'n', 'c', 'i', 'l'};
		printCharArray(str);
		replaceSpace(str);
		printCharArray(str);
	}

}
