package employee;


public abstract class Employee {
	protected int Id;
	String Name;
	DepartmentEnum Depart;
	
	public Employee(int id, String name, DepartmentEnum Department){
		setId(id);
		setName(name);
		setDepart(Department);
	}
	
	abstract public void print();

	protected void setId(int id) {
		Id = id;
	}

	protected void setName(String name) {
		Name = name;
	}

	protected void setDepart(DepartmentEnum depart) {
		Depart = depart;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public DepartmentEnum getDepart() {
		return Depart;
	}
	
	public String toString() {
		String result = Id+" "+Name+" "+Depart;
		return result;
	}
}
