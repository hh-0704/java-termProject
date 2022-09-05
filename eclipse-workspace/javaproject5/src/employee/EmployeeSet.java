package employee;

import java.util.Scanner;
import java.util.Vector;

import utils.Utils;

public class EmployeeSet {
	Vector<Employee> Emp = new Vector<Employee>(5);	// 직원벡터
	int indexFullTime = 0;			// 등록된 정규직 직원에 대한 인원 수 
	int indexPartTime = 0;			// 등록된 임시직 직원에 대한 인원 수
	int index = 0;                  // 등록된 총 직원 수
	
	public void RegisterFullTimeEmp(String name_, Object depart, Object pos, int grade_) {
		System.out.println("");
		System.out.println(">>> 정규직 등록 <<<");
		
		int id = 10101 + indexFullTime;
		String name = name_;
		DepartmentEnum department = (DepartmentEnum) depart;
		PositionEnum position = (PositionEnum) pos;
		int grade = grade_;

		Emp.add(new FullTimeEmp(id, name, department, position, grade));
		indexFullTime++;
		index++;
	}

	public void RegisterPartTimeEmp(String name_, Object depart, int time) {
		System.out.println("");
		System.out.println(">>> 임시직 등록 <<<");
		
		int id = 50101 + indexPartTime;
		String name = name_;
		DepartmentEnum department = (DepartmentEnum) depart;
		int hours = time;

		Emp.add(new PartTimeEmp(id, name, department, hours));
		indexPartTime++;
		index++;
	}
	
	public void SearchAll() {
		for(int n=0; n<index; n++) {
			Emp.elementAt(n).print();
		}
	}
	
	public void SearchFull() {
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n) instanceof FullTimeEmp) {
				Emp.elementAt(n).print();
			}
			else
				continue;
		}
	}
	
	public void SearchPart() {
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n) instanceof PartTimeEmp)
				Emp.elementAt(n).print();
			else
				continue;
		}
	}
	
	public void SearchName(String name_) {
		String name = name_;
		int find = 0;
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n).Name.equals(name)) {
				Emp.elementAt(n).print();
				find += 1;
				break;
			}
			else
				continue;
		}
		if(find == 0)
			System.out.println("!!! 해당 이름의 직원이 없습니다.");
	}
	
	public int EmpSearch(String name_) {
		System.out.println();
		System.out.println("검색할 이름을 입력하세요");
		String name = name_;
		int find = -1;
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n).Name.equals(name)) {
				Emp.elementAt(n).print();
				find = n;
				return find;
			}
			else
				continue;
		}
		if(find == -1)
			System.out.println("!!! 해당 이름의 직원이 없습니다.");
		return find;
	}
	
	public Object returningEMP(int id) {
		Object emp = Emp.elementAt(id);
		return emp;
	}
	
	public FullTimeEmp UpdateFull(int id_,String name_, Object depart, Object pos, int grade_) {
		System.out.println("갱신할 정보를 입력하세요.");
		int id = id_;
		String name = name_;
		DepartmentEnum department = (DepartmentEnum)depart;
		PositionEnum position = (PositionEnum)pos;
		int grade = grade_;
		FullTimeEmp temp = new FullTimeEmp(id, name, department, position, grade);
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n).Id == id) {
				if(Emp.elementAt(n) instanceof FullTimeEmp) {
					Emp.set(n, temp);
				}
			}
		}
		return temp;
	}
	
	public PartTimeEmp UpdatePart(int id_, String name_, Object depart, int hours_) {
		System.out.println("갱신할 정보를 입력하세요.");
		int id = id_;
		String name = name_;
		DepartmentEnum department = (DepartmentEnum)depart;
		int hour = hours_;
		PartTimeEmp temp = new PartTimeEmp(id, name, department, hour);
		for(int n=0; n<index; n++) {
			if(Emp.elementAt(n).Id == id) {
				if(Emp.elementAt(n) instanceof PartTimeEmp) {
					Emp.set(n, temp);
				}
			}
		}
		return temp;
	}
	
	public void DeleteEmp(int id_) {
		System.out.println("삭제할 id를 입력하세요");
		int id = id_;
		int find = 0;
		for (int n=0; n<index; n++) {
			if (Emp.elementAt(n).Id == id) {
				find += 1;
				Emp.removeElementAt(n);
				index--;
				return;
			}
		}
		if(find == 0)
			System.out.println("!!! 해당 id의 직원이 없습니다.");
	}
}
