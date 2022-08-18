/**
 	css	: class명
 	js : id명
 	//1.HTML input 태그에 입력된 데이터 호출
 	//2. 객체에 담기
 	//3. 글 등록 버튼을 눌렀을 때마다 ~~
 	//4. 게시물 객체 여러개 저장할 공간 = 배열 사용
 	//5. 글 등록이 완료될 때마다 
 	
 */
 //4. 여러개 board 객체를 저장할 배열 선언 
 let boardlist = []
 
 
 
 게시물출력()
 //3. 함수 선언
 function 글등록(){
 
 //1. html에서 데이터 가져와서 변수에 담기
 let bwriter = document.getElementById('bwriter').value
 let bpassword = document.getElementById('bpassword').value
 let btitle = document.getElementById('btitle').value
 let bcontent = document.getElementById('bcontent').value
 
 //2. 객체에 담기
	 let board = {
		작성자 : bwriter ,
		비밀번호 : bpassword ,
		제목 : btitle ,
		내용 : bcontent	
	}

//5.객체를 배열에 저장한다
boardlist.push( board ) // 배열명.push(데이터)
alert('[안내]글 등록이 되었습니다.')


//6. input 초기화 
  document.getElementById('bwriter').value = ''
  document.getElementById('bpassword').value = ''
  document.getElementById('btitle').value = ''
  document.getElementById('bcontent').value = ''
  
  게시물출력()
 }
	

 
function 게시물출력(){
	let html = '<tr> <th>번호</th> <th>제목</th> <th>작성자</th> </tr>'
	
	for(let i = 0 ; i < boardlist.length ; i++){
	html += '<tr>'+	
				'<td>'+ i + '</td>'+
				'<td><a href="#" onclick="게시물열람('+i+')">' +boardlist[i].제목 + '</a> </td>'+
				'<td>'+boardlist[i].작성자 +'</td>'+
			'</tr>'
	
	}
	
	document.getElementById('boardlist').innerHTML = html
	
}


function 게시물열람(){

	document.getElementById('view1').innerHTML = boardlist[i].제목
	document.getElementById('view2').innerHTML = boardlist[i].작성자
	document.getElementById('view3').innerHTML = boardlist[i].내용
}



