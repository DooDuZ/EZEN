package java1.e클래스.가계부;

import java.util.ArrayList;

public class RecordController {

	ArrayList<RecordDTO> getList() {
		return RecordDAO.getRDAO().getList();
	}	
	
	boolean addList(String dRecord, int price, String content) {
		RecordDTO dto = new RecordDTO(dRecord, price, content);
		
		boolean result = RecordDAO.getRDAO().addList(dto);
		if(result) {
			return true;
		}else {
			return false;
		}
	}
	boolean deleteList(int rNo) {
		return RecordDAO.getRDAO().deleteList(rNo);
	}
	boolean updateList(int rNo, String dRecord, int price, String content) {
		RecordDTO dto = new RecordDTO(rNo, dRecord, price, content);
		return RecordDAO.getRDAO().updateList(dto);		
	}
	ArrayList<RecordDTO> findDate(int dRecord) {
		return RecordDAO.getRDAO().findDate(dRecord);
	} 
	ArrayList<RecordDTO> getStats() {
		return RecordDAO.getRDAO().getStats();
	}
	
}
