package Homework.pcroom;

public class SeatController {
	
	boolean login(String ID, String PW) {
		
		membersDTO dto = new membersDTO(ID, PW);
		boolean result = SeatDAO.getInstance().login(dto);		
		
		if(result) {
			return true;
		}else {
			return false;
		}
	}
	
}
