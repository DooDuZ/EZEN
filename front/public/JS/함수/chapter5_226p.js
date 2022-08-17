/**
 
 	p. 226
 		* 타이머함수 : 콜백함수 [내장함수]
 		setTimeout( 함수, 시간[밀리초] ) : 시간이후에 한번 함수 실행
 		setInterval( 함수, 시간[밀리초] ) : 매시간마다 함수 실행
 
 
 */
 
 setTimeout( ()=> { console.log('1초 후에 실행됩니다.')}, 1*1000)
 
 let count = 0
 let 타이머 = setInterval( ()=> { 
	console.log(`1초마다 실행됩니다.${count}`)
	count++	
	if(count ==5){ //5초 후 타이머가 종료됩니다.
		clearInterval(타이머)
	}
}, 1*1000)