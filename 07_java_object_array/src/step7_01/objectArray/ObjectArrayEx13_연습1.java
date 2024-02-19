package step7_01.objectArray;
/*
 * 2월 19일
 * objectArray8, 9번을 연습하고 삭제하고 지우고 다시만들고 하면서 다음으로 넘어왔다.
 * 
 */
import java.util.ArrayList;

class Tv1 {
	String name;
	String brand;
	int price;
	
	void setData (String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}


public class ObjectArrayEx13_연습1 {

	public static void main(String[] args) {
		
		ArrayList<Tv1> list = new ArrayList<Tv1>();
		Tv1 temp = new Tv1();
		temp.setData("스마트TV", "Samsung", 1280000);
		list.add(temp);
		
		temp = new Tv1();
		temp.setData("Iphone14", "Apple", 1520000);
		list.add(temp);
		
		temp = new Tv1();
		temp.setData("LGWashMachine", "LG", 2520000);
		list.add(temp);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name + "\n" + list.get(i).brand + "\n" + list.get(i).price);
		}
		
		System.out.println("==================");
		
		for (Tv1 tv : list) {
			System.out.println(tv.name + "\n" + tv.brand + "\n" + tv.price);
		}
	}

}
