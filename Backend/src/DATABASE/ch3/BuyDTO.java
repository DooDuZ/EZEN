package DATABASE.ch3;

public class BuyDTO {
	int num ;
	String mem_id;
	String prod_name;
	String group_name;
	int price;
	int amount;
	
	public BuyDTO() {}

	
	
	
	public BuyDTO(String mem_id, int amount) {
		this.mem_id = mem_id;
		this.amount = amount;
	}


	public BuyDTO(int num, String mem_id, String prod_name, String group_name, int price, int amount) {
		this.num = num;
		this.mem_id = mem_id;
		this.prod_name = prod_name;
		this.group_name = group_name;
		this.price = price;
		this.amount = amount;
	}	
}
