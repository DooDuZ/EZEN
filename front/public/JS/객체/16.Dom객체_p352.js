/**
 * 
 */
 
 const input = document.querySelector('#todo') //id=todo 값을 가진 태그들을 객체로 가져오기
 const todoList = document.querySelector('#todo_list') //id=todo_list 값을 가진 태그들을 객체로 가져오기
 const addButton = document.querySelector('#add_button') //id=add_button 값을 가진 태그들을 객체로 가져오기
 
 			//const name -> 객체 선언     =      document.querySelector('선택자') -> 선언된 객체에 선택된 선택자들을 property로 넣어줌 
 																					// ㄴelement ? property?
 																					// property = key값 : data 
 let keyCount = 0 // 작성 후순위. 당장 필요치 않음. 삭제 버튼 주석 작성 후 돌아와서 주석 추가
 
 const addTodo = () =>{			// input값을 하단에 추가해줄 함수 선언 
	if(input.value.trim()===''){		//	input박스에서 가져온 값의 좌우값을 모두 제거한 뒤, 남은 값이 빈칸이면
		alert('할 일을 입력해주세요.')		//	빈칸 추가 불가능 alert
		return		// 위 alert실행 됐으므로 return. 하단 추가 문구 저장하지 않고 탈출
	}	
	
	
	const item = document.createElement('div')			//<div></div> 태그를 생성해 저장하는 객체 -> 표현 부정확한듯 함
	const checkbox = document.createElement('input')	//<input></input> 태그를 생성해 저장하는 객체 -> 표현 부정확한듯 함
	const text = document.createElement('span')			//<span></span> 태그를 생성해 저장하는 객체 -> 표현 부정확한듯 함
	const button = document.createElement('button')		//<button></button> 태그를 생성해 저장하는 객체 -> 표현 부정확한듯 함
														// 직관적 이해로 생성해서 저장한다고 메모했으나, 정확한 개념 정리 필요
	
	const key = keyCount  // 앞에 선언된 keycount변수의 값을 상수로 바꿔서 선언 -> keycount는 함수가 실행될 때마다 값이 변하므로 선언된 상수 값을 이용 가능
	keyCount += 1	//함수가 실행될 때마다 ketcount에 1을 더함
	
	item.setAttribute('data-key', key)		// item(div)값의 속성에 'data-key'=key 속성 부여 / data-key->name,id,class같은 역할 / 속성이란 표현이 맞는지 모르겠음. 추후 확인 / 
	item.appendChild(checkbox)				// item(div)에 자식 속성 위에서 선언한 객체의 값 (input checkbox)를 추가 
	item.appendChild(text)					// item(div)에 자식 속성 span추가
	item.appendChild(button)				// item(div)에 자식 속성 button 추가
	todoList.appendChild(item)				// todoList객체(todoList id를 가진 div)에 위의 과정으로 만들어진 div를 추가
	
	checkbox.type = 'checkbox'													//input에 checkbox 타입 추가
	checkbox.addEventListener('change', (event)=> {								//위에서 생성된 체크박스에 change 이벤트 추가
		item.style.textDecoration = event.target.checked ? 'line-through' : ''	
			// change 이벤트가 일어났을 때, event.target이 checked 상태이면 스타일에 line-through(선긋기) // !checked이면 스타일 속성 추가 없음
	})
	
	text.textContent = input.value			//span 값에 input.value 값을 text로 추가
	
	button.textContent = '제거하기'			//button태그에 제거하기 입력 (버튼의 이름이 제거하기가 되도록)
	button.addEventListener('click', ()=>{	//button에 click이벤트 추가, click할 때마다 key변수값을 매개변수로 하는 removeTodo(i)함수 실행
		removeTodo(key)						//removeTodo(i)는 아직 선언되지 않음 / 하단에 선언
	})
input.value=''								//input.value값의 초기화 -> html 인풋박스 내용물 삭제
}



const removeTodo = (key) => {									//key변수를 매개변수로 하는 removeTodo함수 선언
	const item = document.querySelector(`[data-key="${key}"]`)	//해당 함수 내에서만 작동하는 item 객체 (data-key값이 key변수 값인 선택자를 가져옴)
	todoList.removeChild(item)									//todoList에 추가돼있는 item(div -> data-key값이 key변수 값과 동일한) 자식속성을 제거 parent=todoList / child=item
}


addButton.addEventListener('click', addTodo)		//addbutton에 click 이벤트 추가 , 이벤트 발생 시 addTodo함수 실행

input.addEventListener('keyup', (e)=> {				//input박스에 keyup이벤트 추가, 이벤트가 enter키 입력인 경우 addTodo()실행
	const ENTER = 13
	if(e.keyCode === ENTER){						//매개변수에 
		addTodo()
	}
})





