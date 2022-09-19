package DATABASE.ch3;

public class DTO {
	// 필드
	String mem_id;
	String mem_name;
	int mem_number;
	String mem_addr;
	String mem_phone;
	String mem_phone2;
	int height;
	String debut_date;
	
	// 생성자
	public DTO() {}
	
	DTO(String mem_name, int height, int mem_number){
		this.mem_name = mem_name;
		this.height = height;
		this.mem_number = mem_number;		
	}
	
	DTO(String mem_id, String mem_name, String debut_date){
		this.mem_id = mem_id;
		this.mem_name = mem_name;		
		this.debut_date = debut_date;	
	}
	DTO(String mem_id, String mem_name, String debut_date, int height){
		this.mem_id = mem_id;
		this.mem_name = mem_name;		
		this.debut_date = debut_date;
		this.height = height;
	}

	public DTO(String mem_id, String mem_name, int mem_number, String mem_addr, String mem_phone, String mem_phone2,
			int height, String debut_date) {
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_number = mem_number;
		this.mem_addr = mem_addr;
		this.mem_phone = mem_phone;
		this.mem_phone2 = mem_phone2;
		this.height = height;
		this.debut_date = debut_date;
	}
	
	// 메서드
}
