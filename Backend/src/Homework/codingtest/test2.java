package Homework.codingtest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){

    	Scanner input = new Scanner(System.in);
    	
    	int T = input.nextInt();
    	float[] arr = new float[T];
    	
    	float max = 0;
    	float sum = 0;
    	
    	for(int i = 0 ; i<T ; i++) {
    		arr[i] = input.nextFloat();
    		if(arr[i]>max) {
    			max=arr[i];
    		}
    	}
    	for(int i = 0 ; i<T ; i++) {
    		sum += (arr[i]/max)*100;
    	}
    	System.out.println(sum/T);    	
    }
}