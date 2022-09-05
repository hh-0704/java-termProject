package employee;

public class PartTimeEmp extends Employee {
	private int Hours;
	
	/*public PartTimeEmp() {
		//코드 작성
	}*/

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		// 코드 작성
		super(id,name,department);
		setHours(hours);
	}
	
	public void print() {
		// 코드 작성
		System.out.println("======================");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("department: "+getDepart().getMessage());
		System.out.println("hours: "+getHours());
		System.out.println();
	}
	
	// setters 및 getters 정의

	public int getHours() {
		return Hours;
	}

	protected void setHours(int hours) {
		Hours = hours;
	}
	
}
