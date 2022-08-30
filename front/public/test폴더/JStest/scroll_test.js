/**
 * 
 */


/*
 let i = 210
 
 function scroll_down(){
	i += 10
	dot_bar.style.height = i+'px'
}

 function scroll_up(){
	i -= 10
	dot_bar.style.height = i+'px'
}
		window.scrollY 써야함!!
*/

const dot_bar = document.querySelector('.dot_bar') // dot_bar 가져오기

window.addEventListener('scroll', () => { 	// window.addEventListener(이벤트타입, 이벤트가 발생하면 실행할 함수) 라고 친구가 말함
											// 이벤트 리스너 밖에서 let height = window.scrollY 하고 console.log 해보면 계속 0만나옴. 그래서 안에서 선언해야함
		let height = window.scrollY
		
		console.log(height)  // 선언한 변수 제대로 나오는지 출력
		
		function scroll_move(){  //변수 height따라 움직일 새로운 함수 선언. 밖에다 선언하면 height가 정의되지 않은 상태여서 실행 안됌. 
			if(dot_bar.style.height>2000){		// 특정지점에서 스크롤 늘어나는거 멈추기 위해 if문 입력
				height = 2000					// 멈출 위치 입력
				return							// 입력 후 리턴...으로 함수 종료 하려했으나 어떤 이유에서인지 계속 아래까지 실행
			}
			dot_bar.style.height = height/1.4 + 210 + 'px'	//초기 px값인 210에 height를 더해서 px입력 			
		}
		scroll_move() //함수 호출
		console.log(dot_bar.style.height) //dot_bar의 height값 바뀌지 출력
})




/*

window.addEventListener('scroll', ( ) => { 
	s_p.push(window.scrollY)
	let j = 1
	j++
	for(let k=1 ; k<=j ; k++){
		if(scroll && s_p[k]>s_p[k-1]){
			scroll_down()
			console.log(dot_bar.style.height)
		}else if(!scroll){
			scroll_up()
			console.log(dot_bar.style.height)
		}
	}
	
});

*/
