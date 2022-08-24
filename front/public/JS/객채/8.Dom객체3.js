/**
 * 
 */
 document.addEventListener('DOMContentLoaded', ()=> {
 
	 const a = document.querySelector('#a') // 해당 id의 요소 가져오기
	 const b = document.querySelector('#b') // 해당 id의 요소 가져오기
	 
	 a.textContent = '<h1>아ㅏㅏ무말 바퀴벌레 어카지 </h1>'
	 b.innerHTML = '<h1> html형식으로 넣기 </h1>'
	 
	 // 2. p.315 속성 조작
	 const rects = document.querySelectorAll('.rect')
	 
	 // 3.
	 for( let i = 0 ; i <rects.length ; i++){
		//[i : 인덱스로 사용할 변수] i는 0부터 마지막인덱스
		const width = ( i + 1 )*100
		const src = `http://placekitten.com/${width}/250`
		rects[i].setAttribute('src', src)
		//배열 내 해당 i번째 인덱스의 태그에 속성을 추가[이미지 경로 속성 ]
	}
	
	//3. p. 318 스타일 조작
	const divs = document.querySelectorAll('#divbox div')
										//상위태그 > 하위태그
										//상위태그 하위태그
	divs.forEach( (div, index) => {
		//				[콜백함수]
		//배열명.forEach( (요소명,인덱스,배열명) => {} )
			// - 배열에 있는 요소들을 하나씩 반복변수에 저장
			// - 배열에 인덱스들을 하나씩 인덱스 변수에 저장 대입
			// - 함수내에서 사용할 배열명 대입
		//배열명.forEach( (요소명) => {} )
			
		//배열명.forEach( (요소명, 인덱스) => {} )
		console.log(div , index)
		const val = index*10
		div.style.height = `10px`
		div.style.backgroundColor = `rgba(${val}, ${val}, ${val})`
		
	}) 
 
 })
 
 
 
 
 
 
 
 
 
 
 
 /*
 	1.html 읽어온 후 이벤트 처리 함수
 		document.addEventListener('DOMContentLoaded', () => {} )
 	2.요소[태그] 호출
 		객체명 = document.querySelector( 식별자명 )
 		객체명 = document.querySelectorAll( 식별자명 )
 	3. 텍스트 조작
 		객체명.textContent = '문자 그대로'
 		객체명.innerHTML = 'html 형식대로'
 	4. 속성조작
 		객체명.setAttribute('속성명, 값')
 		객체명.setAttribute('속성명')
		*객체명.속성명 = 값
	5. 스타일 조작
		객체명.style.속성명=값  
		
	6. 태그(요소) 추가
		document.creatElement(태그명)
		
	7. 태그(요소)	삭제
		부모객체.removeChild(자식객체)
		자식객체.parentNode.removeChild(자식객체)
	
 */