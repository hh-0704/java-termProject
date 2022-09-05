package menus;

public enum SearchMenuEnum {
	SEARCHALL(21, "일괄 검색"), 
	FULLSEARCH(22, "정규직 일괄 검색"),
	TIMESEARCH(23, "임시직 일괄 검색"),
	NAMESEARCH(24, "이름 검색"),
	EXIT(29, "돌아가기");
	
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
