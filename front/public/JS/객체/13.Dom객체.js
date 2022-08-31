/**
 
 	객체명.textContent
 	객체명.innerHTML
 	객체명.value
 
 
 
 */

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
	p.innerHTML = `${cm} cm`
})



//p.341
const emailbox = document.querySelector('#emailbox')
const emailp = document.querySelector('#emailp')


//이메일 검증 확인 함수[익명함수]
const isemail = (value) =>{
	return  (value.indexOf('@')>1) && (value.split('@')[1].indexOf(".")>1) 
			//입력데이터의 @가 있는지		and 입력데이터의 @뒤 문자 값이 있는지
			//							qweqwer@naver.com [@기준으로 분리 후]
			//									naver.com 이 있는지 
}

emailbox.addEventListener('keyup' , ( event ) => {
	const value = event.currentTarget.value
	if( isemail(value) ){
		emailp.style.color = 'green'
		emailp.textContent = `이메일 형식입니다 : ${value}`
	}else{
		emailp.style.color = 'red'
		emailp.textContent = `이메일 형식이 아닙니다 : ${value}`
	}
})
	 	


/*

	배열명.indexOf('데이터') : 배열 내 해당 데이터의 인덱스 값을 출력
	문자열.inchOf('@') : 문자열내 @의 인덱스 번호 찾기
		ㄴ의 값이 0보다 작으면 
	문자열.split('기준문자') : 문자열 내 기준문자 기준으로 분리[자르기]
		ex) 
			문자열 = 유재석 / 강호동/ 신동엽 / 하하
			문자열.split("/")
			문자열.split("/")[0]	: 유재석
			문자열.split("/")[0]	: 하하
	
*/



const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

selectbox.addEventListener('change' , (event) =>{
	
	// select의 모든 option 호출 [ select객체.options ] = 배열
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectedIndex
	
	selectp.textContent = `선택 : ${options[index].textContent}`
})


//---------------------------------------------------------------------------------------


const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

selectbox2.addEventListener('change' , (event)=>{
	
	const options = event.currentTarget.options
	const list = [ ]
	
	
	for(const option of options){
		if( option.selected ){
			list.push( option.textContent )
		}
	}
	
	selectp2.textContent = `선택 : ${list.join(',')}`
	//배열명.join('연결문자') : 배열내 모든 요소들을 연결문자 기준으로 하나의 문자열로 변환
		//학생명 = [유재석, 강호동, 신동엽]
		//학생명.join[<->]
		//유재석<->강호동<->신동엽
})

//------------------------------------------------------------------

let 현재값 = ''
let 변환상수 = 10


const cmiput = document.querySelector('#cmiput')
const cmspan = document.querySelector('#cmspan')
const cmselect = document.querySelector('#cmselect')

cmselect.addEventListener('change' , (event)=>{
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectedIndex
	변환상수 = Number(options[index].value)
	calculate()
})
const calculate = () => {
	cmspan.textContent =(현재값*변환상수).toFixed(2)
}
cmiput.addEventListener('keyup' , (event) => {
	현재값 = Number(event.currentTarget.value)
	calculate()
})


// p.347 입력해보기

let timer = 0 
let timerID = 0 
const timerinput = document.querySelector('#timerinput')
const timerh1 = document.querySelector('#timerh1')

timerinput.addEventListener('change', (event)=>{
	
	if(event.currentTarget.checked){
		timerID = setInterval( ()=>{
			timer+=1
			timerh1.textContent = `${timer}초`
		}, 1000)
	}else{
		clearInterval(timerID)
		timer = 0
		timerh1.textContent = `${timer}초`
	}
})


const radios = document.querySelectorAll('[name=pet]')
const output = document.querySelector('#output')

radios.forEach( (radio) => {
	radio.addEventListener('change' , (event)=>{
		const current = event.currentTarget
		if( current.checked ){
			output.textContent= `좋아하는 애완동물은 ${current.value}군요!`
		}		
	})	
})









