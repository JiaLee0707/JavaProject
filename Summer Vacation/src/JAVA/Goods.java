package JAVA;
import java.util.*;

public class Goods {
	private String name;
	private int price;
	private int number;
	private int sold;
	
	public Goods(String name, int price, int number, int sold) {
		this.name = name;
		this.price = price;
		this.number = number;
		this.sold = sold;		
	}
	
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	int getNumber() {
		return number;
	}
	int getSold() {
		return sold;
	}
	
	public static void main(String[] args) {
		Goods[] GoodArray = new Goods[3];
		
		GoodArray[0] = new Goods("candy", 2000, 2000, 100);
		GoodArray[1] = new Goods("∂±∫∫¿Ã", 7500, 2000, 100);
		GoodArray[2] = new Goods("candy", 2000, 2000, 100);
		
		for(int i=0; i<3; i++) {
			System.out.println(GoodArray[i].getName());
			System.out.println(GoodArray[i].getPrice());
			System.out.println(GoodArray[i].getNumber());
			System.out.println(GoodArray[i].getSold());
		}
	}

}
