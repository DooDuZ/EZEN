package Homework.codingtest;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		int count = 0;
		
		for(int i = 0 ; i<T ; i++) {
			String s = input.next();
			if(s.length()==1) {
				count++;
				continue;
			}
			
			boolean check = true;
			
			if(check) {
				count++;
			}
		}		
	}
}
