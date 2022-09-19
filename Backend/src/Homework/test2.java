package Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test2 {
	// 한수
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int x = Integer.parseInt(s);
			System.out.println(checker(x));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static int checker(int n) {
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
				count = count;
			}
		}
		return count;	
	}
}
