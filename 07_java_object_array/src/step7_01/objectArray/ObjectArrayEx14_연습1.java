package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

class MyArrayList1 {
	int[] arr;
	int elementCnt;
	
	void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	void add (int value) {
		
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[elementCnt] = value;
		elementCnt++;
	}
	
	void add (int index, int value) {
		
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			int j = 0;
			for (int i = 0; i < elementCnt + 1; i++) {
				if (i != index) {
					arr[i] = temp[j++];
				}
			}
			temp = null;
		}
		
		arr[index] = value;
		elementCnt++;
	}
	
	void remove(int index) {
		
		if (elementCnt == 1) {
			arr = null;
		}
		else if (elementCnt > 1) {
			int[] temp = arr;
			arr = new int[elementCnt - 1];
			
			int j = 0;
			for (int i = 0; i < elementCnt; i++) {
				if (i != index) {
					arr[j++] = temp[i];
				}
			}
			temp = null;
		}
		elementCnt--;
	}
	int size() {
		return elementCnt;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void clear() {
		arr = null;
		elementCnt = 0;
	}
}

public class ObjectArrayEx14_연습1 {

	public static void main(String[] args) {
		MyArrayList myList = new MyArrayList();
		
		myList.add(10);
		myList.print();
	
	}

}
