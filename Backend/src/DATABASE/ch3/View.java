package DATABASE.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DAO dao = new DAO();
		
		while(true) {
				System.out.println("1~19번 예제");

			System.out.println("예제 번호 선택 : ");
			int ch = input.nextInt();
			
			if(ch==1) {
				ArrayList<DTO> list = dao.예제1결과();
				System.out.println("========결과물==========");
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.mem_number);
					System.out.println(dto.mem_addr);
					System.out.println(dto.mem_phone);
					System.out.println(dto.mem_phone2);
					System.out.println(dto.height);
					System.out.println(dto.debut_date);
					System.out.println("======");
				}
			}
			if(ch==2) {
				ArrayList<DTO> list = dao.예제1결과();
				System.out.println("======결과물=======");
				for(DTO dto : list) {
					System.out.println(dto.mem_name);
					System.out.println("======");
				}	
			}
			if(ch==3) {
				DTO dto = dao.예제3결과();
				System.out.println("======결과물=======");
				System.out.println(dto.mem_id);
				System.out.println(dto.mem_name);
				System.out.println(dto.mem_number);
				System.out.println(dto.mem_addr);
				System.out.println(dto.mem_phone);
				System.out.println(dto.mem_phone2);
				System.out.println(dto.height);
				System.out.println(dto.debut_date);
				System.out.println("======");
			}
			if(ch==4) {
				ArrayList<DTO> list = dao.예제4결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println("======");
				}
			}
			if(ch==5) {
				ArrayList<DTO> list = dao.예제5결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_name);
					System.out.println(dto.height);
					System.out.println(dto.mem_number);
					System.out.println("======");
				}
			}
			if(ch==6) {
				ArrayList<DTO> list = dao.예제6결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_name);
					System.out.println(dto.height);
					System.out.println(dto.mem_number);
					System.out.println("======");
				}				
			}
			if(ch==7) {
				ArrayList<DTO> list = dao.예제7결과();
				System.out.println("========결과물==========");
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.mem_number);
					System.out.println(dto.mem_addr);
					System.out.println(dto.mem_phone);
					System.out.println(dto.mem_phone2);
					System.out.println(dto.height);
					System.out.println(dto.debut_date);
					System.out.println("======");
				}
			}
			if(ch==8) {
				ArrayList<DTO> list = dao.예제8결과();
				System.out.println("========결과물==========");
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.mem_number);
					System.out.println(dto.mem_addr);
					System.out.println(dto.mem_phone);
					System.out.println(dto.mem_phone2);
					System.out.println(dto.height);
					System.out.println(dto.debut_date);
					System.out.println("======");
				}
			}
			if(ch==9) {
				ArrayList<DTO> list = dao.예제9결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.debut_date);
					System.out.println("======");
				}				
			}
			if(ch==10) {
				ArrayList<DTO> list = dao.예제10결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.debut_date);
					System.out.println(dto.height);
					System.out.println("======");
				}				
			}
			if(ch==11) {
				ArrayList<DTO> list = dao.예제11결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_name);
					System.out.println(dto.debut_date);
					System.out.println(dto.height);
					System.out.println("======");
				}				
			}
			if(ch==12) {
				ArrayList<DTO> list = dao.예제12결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_name);
					System.out.println(dto.height);
					System.out.println("======");
				}				
			}
			if(ch==13) {
				ArrayList<String> list = dao.예제13결과();
				for(String dto : list) {
					System.out.println(dto);
					System.out.println("======");
				}				
			}
			if(ch==14) {
				ArrayList<BuyDTO> list = dao.예제14결과();
				for(BuyDTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.amount);
					System.out.println("======");
				}				
			}
			if(ch==15) {
				ArrayList<BuyDTO> list = dao.예제15결과();
				for(BuyDTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.amount);
					System.out.println("======");
				}				
			}
			if(ch==16) {
				ArrayList<BuyDTO> list = dao.예제16결과();
				for(BuyDTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.amount);
					System.out.println("======");
				}				
			}
			if(ch==17) {
				ArrayList<DTO> list = dao.예제17결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_phone);
					System.out.println("======");
				}				
			}
			if(ch==18) {
				ArrayList<DTO> list = dao.예제18결과();
				for(DTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.mem_phone);
					System.out.println("======");
				}				
			}
			if(ch==19) {
				ArrayList<BuyDTO> list = dao.예제19결과();
				for(BuyDTO dto : list) {
					System.out.println(dto.mem_id);
					System.out.println(dto.amount);
					System.out.println("======");
				}				
			}
		}	
	}
	
}
