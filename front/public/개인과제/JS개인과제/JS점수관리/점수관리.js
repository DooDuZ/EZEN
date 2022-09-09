

const name = document.querySelector('#name')
const kor = document.querySelector('#kor')
const eng = document.querySelector('#eng')
const mat = document.querySelector('#mat')
const listtable = document.querySelector('#listtable')


let studentlist = [];

//삭제기능 존재
//1. 배열에 담아 배열내 인덱스의 값을 개별로 출력
	//객체로 저장해서 담기 or 배열로 저장해서 담기
		//실제 수업에서는 객체 사용, 객체로 key를 지정해주는 게 배열 내 인덱스보다 구분이 용이함
//appendChild와 removeChild를 통한 삽입/제거
//좀 더 익숙한 개념인 객체 사용 -> 데이터 저장의 개념에서 봤을 때도 객체나 배열을 이용하는 게 과제의 목적에 부합하는 것으로 여겨짐


//table에 들어갈 데이터. rnk name kor eng mat sum avg

listtable.innerHTML = `<tr><th>순위</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>기타</th><th>비고</th></tr>`

function 점수등록(){
	const student = {
		name : name.value,
		kor : Number(kor.value),
		eng : Number(eng.value),
		mat : Number(mat.value),
		sum : Number(kor.value)+Number(eng.value)+Number(mat.value),
		avg : (Number(kor.value)+Number(eng.value)+Number(mat.value))/3		
	}
	studentlist.push(student)	//객체를 배열에 저장
	순위정렬()
	let storage = `<tr><th>순위</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>기타</th><th>비고</th></tr>`;
	for(let i = 0 ; i<studentlist.length ; i++){
		storage +='<tr>'+
							'<td>'+ (i+1)+'</td>' +
							'<td>' + studentlist[i].name + '</td>' +
							'<td>' + studentlist[i].kor + '</td>' +
							'<td>' + studentlist[i].eng + '</td>' +
							'<td>' + studentlist[i].mat + '</td>' +
							'<td>' + studentlist[i].sum + '</td>' +
							'<td>' + studentlist[i].avg + '</td>' +
							'<td><button onclick=삭제하기('+i+')>삭제</button></td></tr>'
	}
	listtable.innerHTML = storage;
}

function 삭제하기( index ){
	studentlist.splice(index, 1)
	순위정렬()
	let storage =`<tr><th>순위</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>기타</th><th>비고</th></tr>`;
	for(let i = 0 ; i<studentlist.length ; i++){
		storage +='<tr>'+
							'<td>'+ (i+1)+'</td>' +
							'<td>' + studentlist[i].name + '</td>' +
							'<td>' + studentlist[i].kor + '</td>' +
							'<td>' + studentlist[i].eng + '</td>' +
							'<td>' + studentlist[i].mat + '</td>' +
							'<td>' + studentlist[i].sum + '</td>' +
							'<td>' + studentlist[i].avg + '</td>' +
							'<td><button onclick=삭제하기('+i+')>삭제</button></td></tr>'
	}
	listtable.innerHTML = storage;
}



function 순위정렬(){
	
	for(let i = 0 ; i<studentlist.length ; i++){
		for(let j = i ; j<studentlist.length; j++){
			if(studentlist[i].sum<studentlist[j].sum){
				let tmp = studentlist[i]
				studentlist[i] = studentlist[j]
				studentlist[j] = tmp
			}
		}
	}
}









