/**
 
 	로또 구매
 		1. 사용자 6개 버튼 선택.
 			조건 : 중복 배제, 취소 기능, 최대 6개
 		2. 컴퓨터 추첨번호[1~45 난수] 생성
 		3.사용자 추첨번호 비교 결과
 */
 
 
 //변수 선언
 // 전역변수 vs 지역변수
 // 지역변수 : {} 안으로는 들어갈 수 있다. {} 밖으로는 못나감. 
 
 let select_number = [ ] // 여러곳에서 사용될 예정이기 때문에 함수 외부에서 선언
 let getrich = [ ]
 // 1. 버튼 만들기 함수
 function btn_print(){
	let btnlist = ''
	for(let i = 1 ; i<= 45 ; i++ ){
		btnlist += `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		if(i%5==0){ btnlist += '<br>'}
	}
	document.getElementById('btnbox').innerHTML = btnlist;
}

// 2. 버튼 눌렀을때 함수

function btn_click(i){
		
	// 배열내 존재하는 숫자 확인
	let index = select_number.indexOf(i)
	if( index >= 0 ){
	// 배열명.indexOf(데이터) : 배열내 해당 데이터의 인덱스 검색
	//해당 데이터가 존재하면 찾은 인덱스 출력
	//해당 데이터가 존재하지 않으면 -1부터 출력	
		alert('이미 선택한 번호입니다. [취소합니다.]')
		select_number.splice( index, 1 )
	}else{
		if(select_number.length==6){
		alert('번호 선택 완료')
		return // 함수 진행 종료 
	}
		select_number.push(i)
	}
	
	
	// 선택 번호 배열 저장 
	 // 배열명.push : 배열에 데이터 추가
	document.getElementById('s_numb').innerHTML = select_number;

}


// 3. 추첨번호 생성[난수] 함수

/*	
	
	*/
	
function lotto_number(){
	if(select_number.length != 6){
		alert('번호를 모두 고른 뒤 추첨 해주세요')
		return	
	} 

	while( true ){
		let rand = Math.floor( (Math.random()*45)+1 )
		let index = getrich.indexOf(rand)
		if(index==-1){
			if(getrich.length==6){
				break
			}else{
				getrich.push(rand)
			}			
		}
	}
	
	document.getElementById('rich_Number').innerHTML = getrich;
	lotto_result()
}

// 4. 추첨번호 비교 결과 함수 
function lotto_result(){
	let count = []
	for(let i of select_number){
		for(let j of getrich){
			if(i==j){
				count.push(i) 
			}
		}
	}
	alert( count )
	if(count.length==6){alert(' 1 등 당 첨 ')}
	else if(count.length==5){alert(' 3 등 당 첨 ')}
	else if(count.length==4){alert(' 당 첨 : 오 만 원 ')}
	else if(count.length==3){alert(' 당 첨 : 오 천 원 ')}
	else if(count.length<=2){alert(' 낙 첨 ')}	

	if(count.length!=0){
	document.getElementById('sameN').innerHTML = count;}
	else{document.getElementById('sameN').innerHTML = '다틀림ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 또속냨ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ';}
}

//5. 초기화 함수

function 초기화(){
	
	 select_number = [ ] 
	 getrich = [ ]
	 document.getElementById('rich_Number').innerHTML = '';
	 document.getElementById('s_numb').innerHTML = '';
	 document.getElementById('btnbox').innerHTML = '';
	 return
}