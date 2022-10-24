package Homework.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		int count = 0;
		
		for(int i = 0 ; i<T ; i++) {
			String s = input.next();
			if(s.length()==1) {
				count++;
				continue;
			}
			boolean check = true;
			for(int j = 97 ; j<=122; j++) {
				if(!new test().checkindex(s, (char) j)) {
					check = false;
					break;
				}
			}
			if(check) {
				count++;
			}
		}		
		System.out.println(count);
	}
	
	boolean checkindex( String s, char el ) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<s.length(); i++) {
			if(s.charAt(i)==el) {
				list.add(i);
			}
		}
		
		
		for(int i = 0 ; i<list.size()-1; i++) {
			if(list.get(i+1)-list.get(i) != 1) {
				return false;
			}
		}		
		return true;
	}
}
