package Homework.codingtest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		String s = input.next();
		
		Map<String, String> map = new HashMap<>();
		map.put("c=", "č");
		map.put("c-", "ć");
		map.put("dz=", "dž");
		map.put("lj", "lj");
		map.put("nj", "nj");
		map.put("s=", "š");
		map.put("z=", "ž");
		
		int length = s.length();
		
		
	}
}
