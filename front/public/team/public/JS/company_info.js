




const dot_bar = document.querySelector('.dot_bar')	// dot_bor 가져오기

window.addEventListener('scroll', () => {
	// 스크롤 발생 시 이벤트를 실행하는 함수
	
	let height = window.scrollY
	// 함수 밖에서 선언할 경우 콘솔창에 계속 0으로 떠서 안에서 선언
		
			if(Number( dot_bar.style.height.split('p')[0] ) > 2050){
				//dot_bar가 y축 2050px 지점 이상일 경우 p의 앞자리에 split으로 문자열을 짤라줘서 작동하지않게 하겠다..
				dot_bar.style.height = 2050 
				return
			}
	
	console.log( height )
	// 선언한 변수가 제대로 나오는지 확인
	
		function scroll_move(){
			// 변수 height에 따라 움직일 새로운 함수 선언
			// 함수 밖에 선언 시 height가 정의되지 않은 상태기 때문에 실행이 안됨

			dot_bar.style.height = height + 100 + 'px'
			// 초기 px 값인 210에서 height를 더한 후 px로 입력
			// Math.ceil((scroll / scrollable) * 100)
		}
		
		scroll_move()
		//함수 호출
		
		console.log(dot_bar.style.height)
		// dot_bar height 값이 바뀌는지 출력
})





// y축 400px에 도달할 경우 원 나오는거,,,






/*
window.addEventListener('scroll', ( ) => { 
  //스크롤 이벤트 시작
  
  //스크롤 가능 정도는 html 컨텐츠의 전체 높이까지
  const scrollable = document.body.scrollHeight
  
  //스크롤 한 정도를 px단위로 표시
  const scroll = window.scrollY;

  let percentageScrolled = 100;
  
  // 스크롤 가능 시
if (scrollable > 0) {
	percentageScrolled = Math.ceil((scroll / scrollable) * 100);	
}scrolledIndicatorFill.style.width = `${percentageScrolled}%`

console.log(window.scrollY); // y축 272 부터..!!
});

	document.getElementsByClassName('dot_bar').innerHTML	// html에 있는 클래스명이 dot_bar 에다 출력해줘
	
	
	
	
	
	
	
	
	

window.addEventListener('scroll', ( ) => { 
  //스크롤을 할 때마다 로그로 현재 스크롤의 위치가 찍혀나온다.
  
  //스크롤 가능 정도
  const scrollable = document.documentElement.scrollHeight - window.innerHeight; // 문서전체높이 - window 높이;

  //스크롤 한 정도를 px단위로 표시
  const scroll = window.scrollY;

  let percentageScrolled = 100;
  
  // 스크롤 가능 시
if (scrollable > 0) {
	percentageScrolled = Math.ceil((scroll / scrollable) * 100);	
}scrolledIndicatorFill.style.width = `${percentageScrolled}%`

console.log(window.scrollY); // y축 272 부터..!!
});

	document.getElementsByClassName('dot_bar').innerHTML	// html에 있는 클래스명이 dot_bar 에다 출력해줘	
	
	
	
*/	
	