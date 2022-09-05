package employee;

public enum PositionEnum {
	// 코드 작성
	이사(21, "이사"),
	부장(22, "부장"),
	과장(23, "과장"),
	대리(24, "대리"),
	사원(25, "사원");

	int code;
	String message;
	
	PositionEnum(int code, String message) {
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
