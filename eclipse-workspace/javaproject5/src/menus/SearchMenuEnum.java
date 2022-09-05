package menus;

public enum SearchMenuEnum {
	SEARCHALL(21, "�ϰ� �˻�"), 
	FULLSEARCH(22, "������ �ϰ� �˻�"),
	TIMESEARCH(23, "�ӽ��� �ϰ� �˻�"),
	NAMESEARCH(24, "�̸� �˻�"),
	EXIT(29, "���ư���");
	
	int code;
	String message;
	
	SearchMenuEnum(int code, String message) {
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
