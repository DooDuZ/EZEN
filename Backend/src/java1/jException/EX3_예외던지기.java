package java1.jException;

public class EX3_예외던지기 {
	
	public static void main(String[] args){
		try {
			findClass();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	
	
	/*
	  	[예외 던지기]
	  	해당 메소드를 호출한 곳으로 throws	 
	*/
	
	public static void findClass() throws ClassNotFoundException{
			Class claszz = Class.forName("java.lang.String2");//
	}
}
