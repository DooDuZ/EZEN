
 const input = document.querySelector('#inchbox')
 const button = document.querySelector('#inchbtn')
 const p = document.querySelector('#inchp')
 
 button.addEventListener('click', () =>{
	
	const inch = Number(input.value)
	
	
	//isNaN( 데이터 ) : 숫자가 아니면 true / 숫자이면 false
	
	if( isNaN(inch) ){
		p.textContent = '숫자를 입력해주세요'
		return
	}	
	const cm = inch*2.54
	p.textContent = `${cm} cm`
})