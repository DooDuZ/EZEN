package java1.e클래스.가계부;

public class RecordDTO {
	
	private int rNo;
	private String dRecord;
	private int price;
	private String content;
	
	public RecordDTO() {}
	
	
	
	public RecordDTO(String dRecord, int price) {
		this.dRecord = dRecord;
		this.price = price;
	}



	public RecordDTO(String dRecord, int price, String content) {
		this.dRecord = dRecord;
		this.price = price;
		this.content = content;
	}

	public RecordDTO(int rNo, String dRecord, int price, String content) {
		this.rNo = rNo;
		this.dRecord = dRecord;
		this.price = price;
		this.content = content;
	}
	public int getrNo() {
		return rNo;
	}
	
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	
	public String getdRecord() {
		return dRecord;
	}

	public void setdRecord(String dRecord) {
		this.dRecord = dRecord;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
