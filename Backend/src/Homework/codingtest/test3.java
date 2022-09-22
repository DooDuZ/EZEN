package Homework.codingtest;



public class test3 {
    public static void main(String[] args){
    
    	try {
        	int s = System.in.read();
        	System.out.println(s);
        	int x = System.in.read();
        	int[] array = new int[x];
        	
        	for(int i = 0 ; i<x ; i++) {
        		int a = System.in.read();
        		array[i] = a;
        	}
        	int max = array[0];
        	int min = array[0];
        	for(int i = 0; i<x ; i++) {
        		for(int j = 0 ; j<x ; j++) {
        			if(array[i]>array[j]) {
        				max = array[i];
        				min = array[j];
        			}
        		}
        	}
        	System.out.print(max+" "+min);			
		} catch (Exception e) {
			System.out.println("오류났엉"+e);
		}

    }
}

