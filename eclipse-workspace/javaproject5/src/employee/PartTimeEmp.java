package employee;

public class PartTimeEmp extends Employee {
	private int Hours;
	
	/*public PartTimeEmp() {
		//�ڵ� �ۼ�
	}*/

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		// �ڵ� �ۼ�
		super(id,name,department);
		setHours(hours);
	}
	
	public void print() {
		// �ڵ� �ۼ�
		System.out.println("======================");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("department: "+getDepart().getMessage());
		System.out.println("hours: "+getHours());
		System.out.println();
	}
	
	// setters �� getters ����

	public int getHours() {
		return Hours;
	}

	protected void setHours(int hours) {
		Hours = hours;
	}
	
}
