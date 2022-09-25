package Homework.codingtest;

import java.math.BigInteger;
import java.util.Scanner;

public class test7_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String number = input.next();
		String number2 = input.next();
		
		BigInteger bignum = new BigInteger(number);
		BigInteger bignum2 = new BigInteger(number2);
		
		System.out.println(bignum.add(bignum2));
		
		/*
		 	문자열로 입력 받고 배열에 담아 각자 계산하기
		 	시간 초과인듯 // 빅인티저 ㄱㄱ
		 	
		 	
		int length;
		int length1 = number.length();
		int length2 = number2.length();
		
		if(length1 > length2) {
			length = length1;
		}else {
			length = length2;
		}
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];
		
		int plus = length1-length2;
		if(plus<0) {
			plus *= (-1);
		}
		
		for(int i = 0 ; i < length ; i++) {
			if(length1 > length2) {
				arr1[i] = Integer.parseInt(number.substring(i, i+1));
			}else {
				if(i<plus) {
					arr1[i]=0;
				}else {
					if(i+1<length) {
						arr1[i] = Integer.parseInt(number.substring(i-plus, i+1-plus));
					}else {
						arr1[i] = Integer.parseInt(number.substring(i-plus));
					}
				}
			}
		}
		
		for(int i = 0 ; i < length ; i++) {
			if(length1 < length2) {
				arr2[i] = Integer.parseInt(number2.substring(i, i+1));
			}else {
				if(i<plus) {
					arr2[i]=0;
				}else {
					if(i+1<length) {
						arr2[i] = Integer.parseInt(number2.substring(i-plus, i+1-plus));
					}else {
						arr2[i] = Integer.parseInt(number2.substring(i-plus));
					}
				}
			}
		}
		
		int[] arr3 = new int[length+1];
		
		
		for(int i = 0 ; i<length ; i++) {
			arr3[i+1] = arr1[i]+arr2[i];
			if(arr3[i+1]>=10) {
				arr3[i+1] = arr3[i+1]%10;
				arr3[i]++;
			}
		}
		for(int i = 0 ; i<length+1 ; i++) {
			if(i==0 && arr3[0]==0) {
				continue;
			}
			System.out.print(arr3[i]);
		}
		*/
	}
}
