package java1.키오스크.관리자;

public class MenuDTO {
	// 필드
	private int mno;
	private String menuname;
	
	//생성자
	public MenuDTO() {}
	public MenuDTO(int mno, String menuname) {
		this.mno = mno;
		this.menuname = menuname;
	}
	//메서드
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
}
