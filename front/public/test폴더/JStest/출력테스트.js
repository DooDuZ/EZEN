
 /*
1. 전송버튼을 툴렀을때 이벤트 함수 실행
2. html에서 입력된 데이터 js를 가져와서 변수/객체 저장->확인 
	2-1 문서객체가져오기
	document.querySelector() -> 1개요소
	document.querySelectorAll -> 여러개요소
	document.getElementById() -> 1개요소
	2-2 문서객체내 내용을 호출[value속성]
	2-3 모든내용을 객체에 저장
	2-4 생성된 객체를 배열에 저장
3. 배열내 존재하는 모든 객체들을 클릭
 */
 
 let 신청자리스트 =[]
 //상담리스트
 //함수
 function 제출하기(){

	let name = document.querySelector('.name')
	let phone1 = document.querySelector('.phone_title')
	let phone2 = document.querySelector('.front_phone')
	let phone3 = document.querySelector('.back_phone')
	let email = document.querySelectorAll('.options')
	console.log(name)
	console.log(phone1)
	console.log(phone2)
	console.log(phone3)
	console.log(email)	

	//보호자이름
	let input = document.querySelectorAll('.name')
	//보호자 전화번호
	let phonetitle = document.querySelectorAll('.phone_title').options
	console.log(phonetitle)
	
}

제출하기()