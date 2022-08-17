/**
 * 
 */


 
 
 function anbSum( a, b ){
	
	let result = 0
	for(let i = 1 ; i<=b ; i++){
		if(i%a==0){
			result += i
		}
	}
	console.log(result)
}

anbSum(3,100)
anbSum(4,1000)
anbSum(5,500)
