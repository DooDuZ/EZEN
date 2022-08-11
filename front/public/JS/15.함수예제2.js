function sumAll(a, b){
	let output = 0
	for( let i = a ; i <= b ; i++){
		output+=i
	}
	return output
}



console.log(sumAll(1,100))
console.log(`1부터 500까지의 합 : ${sumAll( 1, 500 )}`)  // ${}

function 계산버튼함수 (){
	let snumber = Number( document.getElementById('sinput').value )
	let enumber = Number( document.getElementById('einput').value )
	let result = sumAll( snumber, enumber)
	document.getElementById('resultbox').innerHTML='계산결과 : '+ result
}