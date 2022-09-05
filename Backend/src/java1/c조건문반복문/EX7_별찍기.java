package java1.c조건문반복문;
import java.util.Scanner;

public class EX7_별찍기 {
	
	
	public static void main(String[] args) {
		
		
		Scanner height = new Scanner(System.in);
		
		System.out.println("==========피라미드=========");
		System.out.println("높이 입력 : "); int h = height.nextInt();
		String output = "";
		
		for(int i = 1; i <= h ; i++) {
			for(int b = 1; b<=h-i ; b++) {
				output += ' ';
			}
			for(int s = 1; s<=2*i-1 ; s++) {
				output +='*';
			}output += '\n';
		}
		System.out.println(output);
		
		
		
		System.out.println("==========역피라미드=========");
		
		System.out.println("높이 입력 : "); h = height.nextInt();
		
		for(int i = h ; i >=1 ; i--) {
			for(int b = 1 ; b<=h-i ; b++) {
				System.out.print(" ");
			}for(int s=1 ; s<= 2*i-1; s++) {
				System.out.print("*");
			}System.out.print('\n');
		}
		
		System.out.println("==========다이아몬드=========");
		
		System.out.println("높이/2 입력 : "); h = height.nextInt();
		for(int i = 1 ; i<=h ; i++){
			for(int b = 1 ; b <= h-i ; b++) {
				System.out.print(' ');
			}for(int s = 1; s<=2*i-1 ; s++) {
				System.out.print('*');
			}System.out.print('\n');
		}
		for(int i = 1 ; i<=h-1 ; i++) {
			for(int b = 1 ; b<=i ; b++) {
				System.out.print(' ');
			}for(int s = 1 ; s<= 2*(h-i)-1 ; s++) {
				System.out.print('*');
			}System.out.print('\n');
		}
		
		System.out.println("==========X=========");
		
		System.out.println("X의 높이 : "); h = height.nextInt();
		
		for(int y = 1 ; y <= h ; y++) {
			for(int x = 1 ; x<=h ; x++) {
				if(x==y || x+y==h+1) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}System.out.println(' ');
		}
		
		System.out.println("==========▶◀=========");
		System.out.println("넥타이의 높이 : "); h = height.nextInt();
		
		for(int i = 1 ; i<=h ; i++) {
			for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}for(int b=1 ; b<= 2*(h-i); b++ ){
				System.out.print(" ");
			}for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}System.out.println(" ");
		}for(int i = h-1 ; i>=1 ; i--) {
			for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}for(int b=1 ; b<= 2*(h-i); b++ ){
				System.out.print(" ");
			}for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		System.out.println("==========트리쌓기=========");		
		System.out.println("==========최소단위=========");
		
		for(int i=1 ; i<=5 ; i++) {
			if(i%2!=0) {
				for(int b = 1 ; b<=(5-i)/2 ; b++) {
					System.out.print('-');
				}for(int s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						System.out.print('-');
					}else {
						System.out.print('*');
					}
				}for(int b = 1 ; b<=(5-i)/2+1 ; b++) {
					System.out.print('-');
				}
				System.out.print("\n");
			}else {
				System.out.print("\n");
			}
		}
		
		
		System.out.println("==========트리쌓기=========");
		System.out.println("==========1단위=========");
		
		
		/*
		 	
		  
			2단
		*/
	
		System.out.println("트리 단 수 : "); h = height.nextInt();
		
		int unit = 6*h;
		String[] tree = { };
		
		String unit_min = "";
		
		for(int i=1 ; i<=6 ; i++) {
			if(i%2!=0) {
				for(int b = 1 ; b<=(unit-i)/2 ; b++) {
					unit_min += '-';
				}for(int s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){ 
						unit_min += '-' ;
					}else {
						unit_min += '*';
					}
				}for(int b = 1 ; b<=(5-i)/2+1 ; b++) {
					unit_min += '-' ;
				}
				unit_min += '\n' ;
			}else {
				unit_min += "\n";
			}
		}
		System.out.print(unit_min);
		
		for(int i=1 ; i<=5 ; i++) {
			if(i%2!=0) {
				for(int b = 1 ; b<=((unit)/h*(h-1)-i)/2 ; b++) {
					System.out.print('-');
				}for(int s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						System.out.print('-');
					}else {
						System.out.print('*');
					}
				}for(int b = 1 ; b<=(5-i)/2+1 ; b++) {
					System.out.print('-');
				}
				for(int b = 1 ; b<=(5-i)/2 ; b++) {
					System.out.print('-');
				}for(int s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						System.out.print('-');
					}else {
						System.out.print('*');
					}
				}for(int b = 1 ; b<=(5-i)/2+1 ; b++) {
					System.out.print('-');
				}
				System.out.print("\n");
			}else {
				System.out.print("\n");
			}
		}

		
		
		
		
	}

}
