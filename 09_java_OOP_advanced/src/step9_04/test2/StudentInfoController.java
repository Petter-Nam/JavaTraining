package step9_04.test2;

public class StudentInfoController {
	
	private StudentInfoDAO stDAO;
	private StudentInfoInsert insert;
	private StudentInfoSelect select;
	private StudentInfoSelectAll selectAll;
	
	public StudentInfoController() {
		stDAO = new StudentInfoDAO();
		insert = new StudentInfoInsert(stDAO);
		select = new StudentInfoSelect(stDAO);
		selectAll = new StudentInfoSelectAll(stDAO);
	}

	public StudentInfoDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentInfoDAO stDAO) {
		this.stDAO = stDAO;
	}

	public StudentInfoInsert getInsert() {
		return insert;
	}

	public void setInsert(StudentInfoInsert insert) {
		this.insert = insert;
	}

	public StudentInfoSelect getSelect() {
		return select;
	}

	public void setSelect(StudentInfoSelect select) {
		this.select = select;
	}

	public StudentInfoSelectAll getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentInfoSelectAll selectAll) {
		this.selectAll = selectAll;
	}
}
