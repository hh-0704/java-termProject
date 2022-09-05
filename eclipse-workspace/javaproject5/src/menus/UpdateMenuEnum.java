package menus;

public enum UpdateMenuEnum {
	UPDATE(31, "���� ���� ����"),
	EXIT(39, "���ư���");
	
	int code;
	String message;
	
	UpdateMenuEnum(int code, String message) {
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
