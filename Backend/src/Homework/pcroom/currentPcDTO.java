package Homework.pcroom;

public class currentPcDTO {
	int pcNo ;
	boolean cPlay ;
	int memNo;
	String sTime ;
	
	public currentPcDTO() {}

	public currentPcDTO(int pcNo, boolean cPlay, int memNo, String sTime) {
		this.pcNo = pcNo;
		this.cPlay = cPlay;
		this.memNo = memNo;
		this.sTime = sTime;
	}

	public int getPcNo() {
		return pcNo;
	}

	public void setPcNo(int pcNo) {
		this.pcNo = pcNo;
	}

	public boolean iscPlay() {
		return cPlay;
	}

	public void setcPlay(boolean cPlay) {
		this.cPlay = cPlay;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
}
