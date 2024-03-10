package step9_04.test;

public class StudentListController {
	
	private StudentListDAO stDAO;
	private StudentListInsert insert;
	private StudentListSelect select;
	private StudentListSelectAll selectAll;
	
	public StudentListController() {
		stDAO = new StudentListDAO();
		insert = new StudentListInsert(stDAO);
		select = new StudentListSelect(stDAO);
		selectAll = new StudentListSelectAll(stDAO);
	}

	public StudentListDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(StudentListDAO stDAO) {
		this.stDAO = stDAO;
	}

	public StudentListInsert getInsert() {
		return insert;
	}

	public void setInsert(StudentListInsert insert) {
		this.insert = insert;
	}

	public StudentListSelect getSelect() {
		return select;
	}

	public void setSelect(StudentListSelect select) {
		this.select = select;
	}

	public StudentListSelectAll getSelectAll() {
		return selectAll;
	}

	public void setSelectAll(StudentListSelectAll selectAll) {
		this.selectAll = selectAll;
	}
	
	
}


