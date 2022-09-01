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
	}output += '\n'															
}
																		
											 									
count = 0
											 									
for(let i = 1 ; i<=4 ; i++){	
	for(let b = 1 ; b<=count ; b++){
		output += ' '		
	}						
	for(let s = 1 ; s<=13-2*count ; s++){
	output += '*'
	}output += '\n'
	if(i==1){
		count = 2 
	}else{
		count = 3
	}
}

for(let i = 1 ; i <=2 ; i++){
	
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