package employee;

public class FullTimeEmp extends Employee {
	// 필드 선언
	private int Grade;
	PositionEnum p;
	
	/*public FullTimeEmp() {
		// 코드 작성
	}*/

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		// 코드 작성
		super(id,name,department);
		setP(position);
		setGrade(grade);
	}
	

	public void print() {
		// 코드 작성
		System.out.println("======================");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("department: "+getDepart().getMessage());
		System.out.println("position: "+getP().getMessage());
		System.out.println("grade: "+getGrade());
		System.out.println();
	}
	
	
	// setters 및 getters 정의

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
