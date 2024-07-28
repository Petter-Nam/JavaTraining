package step7_01.objectArray;

class Card_2{
	int num;
	String shape;
}
public class ObjectArrayEx02_연습2 {
	public static void main(String[] args) {
		Card_2[] cardList = new Card_2[10];
		for (int i = 0; i < cardList.length; i++) {
			cardList[i] = new Card_2();
			cardList[i].num = i + 1;
			cardList[i].shape = "클로버";
		}
		
		for (int i = 0; i < cardList.length; i++) {
			System.out.println("num : " + cardList[i].num);
			System.out.println("shape : " + cardList[i].shape);
		}
	}
}
