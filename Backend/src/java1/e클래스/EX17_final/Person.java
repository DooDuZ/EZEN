package java1.e클래스.EX17_final;

public class Person {
	
	// 1. 필드
	final String nation = "대한민국" ;
	String ssn ; 
	String name ; 
	
	static final double EARTH_RADIUS = 6400;
	
	// 2. 생성자
	
	
	public Person() {}
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
