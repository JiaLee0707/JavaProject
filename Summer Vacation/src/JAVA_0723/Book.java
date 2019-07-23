package JAVA_0723;

import java.util.*;

public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("생성자 1");
	}
	public Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
		System.out.println("생성자 2");
	}
	public Book() {
		this(null, null, 0);
		System.out.println("생성자가 호출되었음");
		System.out.println("생성자 3");
	}
	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "황기태", 3333);
		Book holyBible = new Book("Holy Bible", 1);
		Book emptyBook = new Book();

	}

}
