/**
 * 
 */
		let tree = []
 		let output = '';
 		
 		let height = Number(prompt('단위 높이'))
 		let unit = height*6
 		
 		 
 		
		for(let i=1 ; i<=5 ; i++) {
			if(i%2!=0) {
				for(let b = 1 ; b<=(unit-i)/2 ; b++) {
					output += '-';
				}for(let s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						output+='-';
					}else {
						output+='*';
					}
				}for(let b = 1 ; b<=(5-i)/2+1 ; b++) {
					output+='-';
				}
				output+='\n';
			}else {
				output+='\n';
			}
		}
		
		tree.push(output)
		
		console.log(output)
		
		output = ''
		
		for(let i=1 ; i<=5 ; i++) {
			if(i%2!=0) {
				for(let b = 1 ; b<=(5-i)/2 ; b++) {
					output += '-';
				}for(let s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						output+='-';
					}else {
						output+='*';
					}
				}for(let b = 1 ; b<=(5-i)/2+1 ; b++) {
					output+='-';
				}for(let b = 1 ; b<=(5-i)/2 ; b++) {
					output += '-';
				}for(let s= 1 ; s<=i ; s++) {
					if(i==3 && s==2){
						output+='-';
					}else {
						output+='*';
					}
				}for(let b = 1 ; b<=(5-i)/2+1 ; b++) {
					output+='-';
				}
				output+='\n';
			}else {
				output+='\n';
			}
		}
		console.log(output)


		
		/*
		System.out.println("==========트리쌓기=========");
		System.out.println("==========1단위=========");
		*/
		
		/*
		 	
		  
			2단
		*/
		/*
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
		*/