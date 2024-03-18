package step9_04.test3;


public class Controller1 {
	
	private StudentDAO1 stDAO;
	private StudentInsert1 insert;
	public StudentDAO1 getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentDAO1 stDAO) {
		this.stDAO = stDAO;
	}

	public StudentInsert1 getInsert() {
		return insert;
	}

	public void setInsert(StudentInsert1 insert) {
		this.insert = insert;
	}

	public StudentSelect1 getSelect() {
		return select;
	}

	public void setSelect(StudentSelect1 select) {
		this.select = select;
	}

	public StudentSelectAll1 getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentSelectAll1 selectAll) {
		this.selectAll = selectAll;
	}

	private StudentSelect1 select;
	private StudentSelectAll1 selectAll;
	
	public Controller1() {
		stDAO = new StudentDAO1();
		insert = new StudentInsert1(stDAO);
		select = new StudentSelect1(stDAO);
		selectAll = new StudentSelectAll1(stDAO);
	}
}