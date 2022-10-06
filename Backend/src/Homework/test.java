package Homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("등록할 친구 수 : ");
    	int T = input.nextInt();
    	String[] list = new String[T];
    	for(int i = 0 ; i<T ; i++) {
			String name = input.next();
			boolean check = true;
			for(int j = 0; j<T ; j++) {
				if(list[j].equals(name) && list[j]!=null) {
					i--;
					check = false;
					System.out.println("중복");
				}
			}			
			if(check) {
				list[i] = name;
			}
    	}
    	for(int i = 0 ; i<T ; i++) {
			System.out.println( "[" + (i+1) + "]" + list[i]);
		}
    }
}

/*
if(i==0) {
	list[0] = name;
	count++;
	continue;
}else {
	for(int j = 0; j<count ; j++) {
		if(list[j].equals(name)) {
			i--;
			check = false;
			System.out.println("중복");
		}
	}
}
*/