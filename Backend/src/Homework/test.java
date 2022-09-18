package Homework;

import java.util.Scanner;

public class test {
	
	/*
	 	제출 시에는 tool 제공되므로 for문 한줄로 작성
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("범위 입력");
		int 범위 = input.nextInt();
		NSum(범위);		
	}
	
	static int NSum (int length) {
		if(length<1 || length >3000000) {
			System.out.println("범위 초과");
			return 0 ;
		}
		int array[] = new int[length];
		int sum = 0;
		
		for(int i = 0 ; i < array.length ; i++ ) {			
			int rand = (int) Math.floor((Math.random()*1000000)+1);
			int index = 0;
			boolean indexOf = true;			
			
			if(array[i]==0) {
				index = i;
			}
			
			if(array[i]==rand) {
				indexOf = false;
			}
			
			if(indexOf) {
				array[index] = rand;
				sum+=rand;
			}else {
				i--;
			}
		}
		System.out.println("배열 내 값의 합:"+sum);
		return sum;		
	}
}
