package employee;

public enum DepartmentEnum {
	�ѹ�(11, "�ѹ�"),
	�λ�(12, "�λ�"),
	��ȹ(13, "��ȹ"),
	����(14, "����"),
	����(15, "����");

	int code;
	String message;
	
	DepartmentEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
