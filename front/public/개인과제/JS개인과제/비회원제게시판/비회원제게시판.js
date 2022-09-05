/**
 * 
 */
 
 
 const name = document.querySelector('#name')
 const password = document.querySelector('#password')
 const title = document.querySelector('#title')
 const content = document.querySelector('#content')
 const boardlist = document.querySelector('#boardlist')
 
 const board_title = document.querySelector('#board_title')
 const board_name = document.querySelector('#board_name')
 const board_content = document.querySelector('#board_content')
 const delete_content = document.querySelector('#delete')


 let storage = [];
 


 
 let count = 0 ;
 
 function 글등록(){
	 let board_storage = {
		글번호 : count,
		작성자 : name.value,
		비밀번호 : password.value,
		제목 : title.value,
		본문 : content.value
	}
	storage.push(board_storage)
	
	
	let html = `<tr><td>${count}</td><td onclick="글보기(${count})">${storage[count].제목}</td><td>${storage[count].작성자}</td>`
	document.getElementById('boardlist').innerHTML += html	
	count++
 }
 
 let view_index = -1;
function 글보기(index){
		if(storage[index]==null){
			board_content.style.color = 'red';
			board_content.textContent = '삭제된 글입니다.';
		}else{
			board_content.style.color = 'black';
			board_title.textContent = storage[index].제목;
			board_name.textContent = storage[index].작성자;
			board_content.textContent = storage[index].본문;
			view_index = index;	
		}	
}

function del_content(view_index){
	
	storage[view_index] = null ;
	board_title.textContent = null;
	board_name.textContent = null;
	board_content.textContent =  '삭제된 글입니다.';	
}
	
	
	
	
	
	
	
	
	
	
	
	
	