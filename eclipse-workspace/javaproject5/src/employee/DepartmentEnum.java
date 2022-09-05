package employee;

public enum DepartmentEnum {
	총무(11, "총무"),
	인사(12, "인사"),
	기획(13, "기획"),
	생산(14, "생산"),
	영업(15, "영업");

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
