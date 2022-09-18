package Homework;

import java.util.Scanner;

public class test2 {
	// 한수
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		test2 tst = new test2();
		System.out.println(tst.checker(input.nextInt()));
	}	
	int checker(int n) {
		int count = 0;
		for(int i = 1 ; i<= n ; i++) {
			if(i<100) {
				count++;
			}else if(i>=100 || i<1000) {
				int a = i/100;
				int b = (i-(a*100))/10;
				int c = i-(a*100)-(b*10);
				if(a-b == b-c) {
					count++;
				}
			}else if(i==1000) {
				continue;
			}
		}
		return count;	
	}
}
