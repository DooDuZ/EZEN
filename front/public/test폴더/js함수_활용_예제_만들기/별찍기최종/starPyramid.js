/**
 * 
 */

 
 
 let output = ''
 let count = 0
  
  
for(let i = 1 ; i<=5 ; i ++){
	if(i%2==1){
		count += 1
	}for(let j = 1 ; j<=6-count+1 ; j++){
		output += ' '
	}for(let s = 1 ; s<=2*count-1 ; s++){
		output += '*'
	}output += '\n'																//   2 1 0
}																				// 0 2 3 3
																				// 1 2 3 4 
											 									// 0 i i i-1
											 									
let count2 = 0
											 									
for(let i = 0 ; i<4 ; i++){	
	for(let b = 0 ; b<count2 ; b++){
		output += ' '		
	}						
	for(let s = 1 ; s<=13-2*count2 ; s++){
	output += '*'
	}output += '\n'
	if(i==0){
		count2 = 2 
	}else{
		count2 = 3
	}
}


console.log(output)


/*
let 수열 = 0

for(let i = 1 ; i <=4 ; i++){
	수열++
	for(let b )
}


*/




/*

			----*				*
			---***			->	***
			--*****				*****
			-*******			*******
			*********			*********
			

	for(let i = x ; i>=1 ; i--){
		
	}








*/