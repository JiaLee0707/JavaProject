package JAVA_0723;

import java.util.*;

public class ArrayStaticMain {

	public static void main(String[] args) {
		int a[] = { 1, 5, 7, 9 };
		ArrayStatic.print(a);
		int b[] = { 3, 6, -1, 100, 77 };
		ArrayStatic.print(b);
		int add[] = ArrayStatic.add(a, b);
		ArrayStatic.print(add);
	}

}
