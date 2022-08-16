/*

	틱텍토 ( 삼목 )
		1. 게임판 [ 9칸 ] 구현
		    1. 3개마다 줄바꿈 처리
		2. 버튼 눌림 기능
		3. 사용자(선택) vs 컴퓨터(랜덤)
		4. 승리자 판단 [근접한 버튼의 모양이 3개 모두 동일하면 승리]
 */

 // 1. 게임판 출력 함수

let 게임상황 = [] //현재 알을 둔 상황을 저장하는 배열
let 승리 = '' // 이긴 알을 저장하는 변수

 function 게임판그리기(){
	
	승리 = '' // 승리 변수를 공배그올 초기화
    게임상황 = [null, null, null, null, null, null, null, null, null] // 초기화
 	//function 함수 만들기 키워드
 		// 게임판그리기 이름으로 함수 선언 [매개변수 x 리턴값 x ]
 	let 게임판 = '' //여러개 버튼(태그)을 저장하는 변수
 	for( let i = 0 ; i<9 ; i++ ){//i는 0부터 8까지 1씩 증가
		게임판 += `<button id=${i} onclick="버튼선택(${i})">${i}</button>`
		if( i%3 == 2 ){ 게임판 += '<br>'}
		}// for end
	document.getElementById('gameboard').innerHTML = 게임판
 } // f end


// 2. 버튼을 눌렀을 때 이벤트 함수  [ 매개변수 : i = 선택한 버튼 번호 ]
function 버튼선택( i ){
        // 1. 선택한 번호의 모양 변경
        if( 중복검사(i) ){ alert('안내) 이미 둔 자리입니다.')
        return 
        } // 3. 함수호출해서 해당 위치에 알이 있는지 체크 / 알이 있으면 함수 종료 (아래 코드 실행 x)
        document.getElementById( i ).innerHTML = 'O'
        게임상황[i] = 'O' //2. 해당 알을 배열에 저장
        
        if( 게임결과( )){// 게임결과 함수에서 true가 리턴되면 
        	alert('게임종료 승리 : ' + 승리 )
        	return // 함수 강제 종료
        }
        // 2. 난수 발생 [ Math.floor(실수) : 소수점 버림 ]
        while( true ){ // while(true) : 무한루프 [ 종료조건 : 랜덤 위치에 알을 두었을 때 반복 종료 ]
            let rand = Math.floor( Math.random()*9 ) // 0~8 사이의 난수 발생
            if( !중복검사(rand) ){
            document.getElementById( rand ).innerHTML = 'X'
            게임상황[rand] = 'X'
            break
            }// if end
        }// while end
            if( 게임결과( )){// 게임결과 함수에서 true가 리턴되면 
        	alert('게임종료 승리 : ' + 승리 )
        	return // 함수 강제 종료
      		} //if end
      }// f end

// 3. 현재 위치에 앓이 있는지 검사하는 함수 [중복검사]
function 중복검사( i ){
    if( 게임상황[ i ] != null ){ //배열은 모두 null로 초기화했기 때문에 null 아니면 O 또는 X가 존재하는 의미 [알이 있다.]
        return true // 알이 있다.
    }else{
        return false // 알이 없다.
    }
}


// 4. 게임 결과 판단 함수

function 게임결과(){
	//1. 가로로 이기는 수 [ 0 1 2 , 3 4 5 , 6 7 8 ] 
	for( let i = 0 ; i <= 6 ; i+=3){
		// i는 0부터 6까지 3씩 증가반복 [ 3회 : 0 3 6]
		if( 게임상황[i] != null && 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] == 게임상황[i+2]){
			// && 이면서 면서 이고 모두 그리고
				// 0==1==2 // 3==4==5 // 6==7==8
		승리 = 게임상황[i]	// 승리 변수에 i 저장 
		return true // 가로로 승리가 나왔을 경우 함수 종료	
		}	
	}
	//2. 세로로 이기는 수 [ 0 3 6, 1 4 7, 2 5 8 ]
	for( let i = 0 ; i <=2 ; i++ ){
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+3] && 게임상황[i+3] == 게임상황[i+6]){
		승리 = 게임상황[i]
		return true
		}
		
	}
	//3. 대각선으로 이기는 수 [ 0 4 8, 2 4 6 ]
	let i = 0
	if(i==0){
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+4] && 게임상황[i+4] == 게임상황[i+8]){
		승리 = 게임상황[i]	
		return true	
		}
	}
	
	i = 2
	if(i==2){
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+2] && 게임상황[i+2] == 게임상황[i+4]){
		승리 = 게임상황[i]	
		return true	
		}
	}

	//4. 무승부 [ 위 상황이 아니면서 알이 9개이면 ]
	let 무승부 = 0
	
	for(let i = 0 ; i<9 ; i++){
		if(게임상황[i]!=null){
			무승부+=1
		}
	}if(무승부 == 9){
		alert('무승부 입니다.')
		return
	}
}


