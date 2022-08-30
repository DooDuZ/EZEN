/**
 * 
 */

 
 
 let output = ''
 let count = 0
  
  
for(let i = 1 ; i<=5 ; i ++){
	if(i%2==1){
		count += 1
		console.log(count)
	}for(let j = 1 ; j<=6-count+1 ; j++){
		output += ' '
	}for(let s = 1 ; s<=2*count-1 ; s++){
		output += '*'
	}output += '\n'
}

let 수열 = 0



console.log(output)


/*

			----*				*
			---***			->	***
			--*****				*****
			-*******			*******
			*********			*********
			

	for(let i = x ; i>=1 ; i--){
		
	}








*/