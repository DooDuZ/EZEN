package Homework.codingtest;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		int[] arr = new int[26];
		
		for(int i = 0 ; i<s.length() ; i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				arr[s.charAt(i)-65]++;
			}else if(s.charAt(i)>=97 && s.charAt(i)<=122){
				arr[s.charAt(i)-97]++;
			}
		}
		int max = arr[0];
		int answer = 65;
		int count = 0;
		
		for(int i = 0; i<26 ; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer = 65+i;
			}
		}
		for(int i = 0 ; i<26 ; i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		if(count!=1) {
			answer = 63;
		}
		System.out.println((char)answer);
	}    
}