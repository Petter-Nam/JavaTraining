package step9_04.test4;

public class StudentController2 {
	
	private StudentDAO2 stDAO;
	private StudentInsert2 insert;
	private StudentSelect2 select;
	private StudentSelectAll2 selectAll;
	
	public StudentDAO2 getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentDAO2 stDAO) {
		this.stDAO = stDAO;
	}

	public StudentInsert2 getInsert() {
		return insert;
	}

	public void setInsert(StudentInsert2 insert) {
		this.insert = insert;
	}

	public StudentSelect2 getSelect() {
		return select;
	}

	public void setSelect(StudentSelect2 select) {
		this.select = select;
	}

	public StudentSelectAll2 getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentSelectAll2 selectAll) {
		this.selectAll = selectAll;
	}

	public StudentController2() {
		stDAO = new StudentDAO2();
		insert = new StudentInsert2(stDAO);
		select = new StudentSelect2(stDAO);
		selectAll = new StudentSelectAll2(stDAO);
	}
}