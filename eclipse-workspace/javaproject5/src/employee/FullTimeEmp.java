package employee;

public class FullTimeEmp extends Employee {
	// �ʵ� ����
	private int Grade;
	PositionEnum p;
	
	/*public FullTimeEmp() {
		// �ڵ� �ۼ�
	}*/

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		// �ڵ� �ۼ�
		super(id,name,department);
		setP(position);
		setGrade(grade);
	}
	

	public void print() {
		// �ڵ� �ۼ�
		System.out.println("======================");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("department: "+getDepart().getMessage());
		System.out.println("position: "+getP().getMessage());
		System.out.println("grade: "+getGrade());
		System.out.println();
	}
	
	
	// setters �� getters ����

	public int getGrade() {
		return Grade;
	}

	protected void setGrade(int grade) {
		Grade = grade;
	}

	public PositionEnum getP() {
		return p;
	}

	protected void setP(PositionEnum p) {
		this.p = p;
	}
	
}
