

const 게임판 = document.querySelector('#gameboard')

console.log(게임판)

 let gameboard = ''				// 게임판을 그릴 변수 선언
 
 function 게임시작(){				// 게임판 그리기 함수
 	진행상황 = []
 	빈자리 = 9
	for(let i = 0 ; i<9 ; i++){						//반복문을 통해서 
		gameboard += `<button id=${i} onclick="버튼클릭(${i})">${i}</button>`		//한줄 입력을 여러번 반복. 게임보드 변수에 더하지 않고 바로 div로 입력 할 수 있으나
		if(i%3==2){									//버튼을 누를 때마다 게임 내용을 초기화 할 수 있도록 변수에 하여 출력은 누적 더하기가 아닌 대입연산자를 이용하여 할 예정
			gameboard += '<br>'					//3칸 입력마다 줄바꿈
		}	
	}
	
	게임판.innerHTML = gameboard						//게임판 HTML에 출력 !!
	let 버튼들 = 게임판.querySelectorAll('button')
	
	console.log(버튼들[0])
	
	gameboard = ''
}