package employee;

public enum PositionEnum {
	// �ڵ� �ۼ�
	�̻�(21, "�̻�"),
	����(22, "����"),
	����(23, "����"),
	�븮(24, "�븮"),
	���(25, "���");

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
