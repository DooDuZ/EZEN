package java1.키오스크.관리자;

public class ProductDTO {
	private int mno;
	private String pname;
	private int pprice;
	private String pcomment;
	private int pamount;
	
	
	public ProductDTO() {}
	public ProductDTO(int mno, String pname, int pprice, String pcomment, int pamount) {
		this.mno = mno;
		this.pname = pname;
		this.pprice = pprice;
		this.pcomment = pcomment;
		this.pamount = pamount;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPcomment() {
		return pcomment;
	}
	public void setPcomment(String pcomment) {
		this.pcomment = pcomment;
	}
	public int getPamount() {
		return pamount;
	}
	public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	
	//메서드
	
	
}
