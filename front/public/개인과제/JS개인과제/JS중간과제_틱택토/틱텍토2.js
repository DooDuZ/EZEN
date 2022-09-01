/**
 * 
 */
 
 
 const 게임판 = document.querySelector('#게임판')			// -> 게임판 DIV 불러오기
 let 진행상황 = []
 //비욘세 개쩌러!!! PURE/HONEY 들으면서 하세요~ HATED 도요~~
 
 
 
 let gameboard = ''				// 게임판을 그릴 변수 선언
 
 function 게임시작(){				// 게임판 그리기 함수
 	진행상황 = [null, null, null, null, null, null, null, null, null]
	for(let i = 0 ; i<9 ; i++){						//반복문을 통해서 
		gameboard += `<button id=${i} onclick="버튼클릭(${i})">${i}</button>`		//한줄 입력을 여러번 반복. 게임보드 변수에 더하지 않고 바로 div로 입력 할 수 있으나
		if(i%3==2){									//버튼을 누를 때마다 게임 내용을 초기화 할 수 있도록 변수에 하여 출력은 누적 더하기가 아닌 대입연산자를 이용하여 할 예정
			gameboard += '<br>'					//3칸 입력마다 줄바꿈
		}	
	}
	게임판.innerHTML = gameboard						//게임판 HTML에 출력 !!
}
 //주석포기... 완성하고 잘랍니다.
// 게임판 클릭 시 발생할 이벤트 구현

function 버튼클릭(i){									//1. 함수 선언 // 현재 단계에선 아직 매개변수 필요 없음	

	if(진행상황.length>9){
		alert('빈 칸이 없습니다.')
		return		
	}
	if(중복체크(i)){
		alert('이미 둔 자리입니다.')
		return		
	}
	
	진행상황[i] = "O"
	console.log(진행상황)			
	document.getElementById(i).innerHTML = 'O'		//2. ID를 식별자로 하여 호출되는 값에 O를 대입. ->게임시작()의 <button>에 id식별자를 추가. 식별해야 값을 바꿔줄 수 있음!!
	
													//5. 4에서 생성한 난수를 변수 rand로 선언했으므로 하단 3에서 입력한 getElementById()에 rand 입력 후 1.항목 아랫줄의 6으로 
	let rand = Math.floor(Math.random()*9)			//4. 0이상 1미만의 난수를 만들어주는 Math.random()에 9를 곱하여 0~8.9999... 의 난수를 만든 후 Math.floor를 이용해 소수점 버림.
	if(중복체크(rand)){
		alert('이미 둔 자리입니다.')
		return
	}
	진행상황[rand] = "X"
	console.log(진행상황)
	document.getElementById(rand).innerHTML = 'X'	//3. 내가 누른 버튼이 O로 바뀐 후 임의의 버튼(상대 플레이어)이 입력되도록 변경. 구분위해 X대입
}



function 중복체크(i){
	if(진행상황[i]!=null){
		return true
	}else{
		return false
	}
}














