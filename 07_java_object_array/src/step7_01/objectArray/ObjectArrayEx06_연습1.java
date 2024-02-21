package step7_01.objectArray;

class member_1 {
	String name;
	int num;
}

class memberManager_1 {
	member_1[] memberList = new member_1[3];
}

public class ObjectArrayEx06_연습1 {

	public static void main(String[] args) {
		memberManager_1 mg = new memberManager_1();
		member_1 m1 = new member_1();
		
		mg.memberList[0] = m1;
		m1.name = "김아무개";
		m1.num = 1001;
		
		m1 = new member_1();
		mg.memberList[1] = m1;
		m1.name = "김수달";
		m1.num = 1002;
		
		m1 = new member_1();
		mg.memberList[2] = m1;
		m1.name = "김달새";
		m1.num = 1003;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println();
		}
	}

}
