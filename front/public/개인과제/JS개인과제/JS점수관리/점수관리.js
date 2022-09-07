
const name = document.querySelector('#name');
const kor = document.querySelector('#kor');
const eng = document.querySelector('#eng');
const mat = document.querySelector('#mat');

const listtable = document.querySelector('#listtable');


//등수 이름 언어 영어 수학 총점 평균 비고
listtable.innerHTML = `<tr><th>등수</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th></tr>`;

studentlist = [];


function 점수등록(){
		
	const student={
		name : name.value ,
		kor : kor.value ,
		eng : eng.value ,
		mat : mat.value ,
		sum : Number(kor.value)+Number(eng.value)+Number(mat.value),
		avg : (Number(kor.value)+Number(eng.value)+Number(mat.value))/3
	}
	studentlist.push(student);
	순위정렬()
	let storage = '<tr><th>등수</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th></tr>';
	
	for(let i = 0 ; i<studentlist.length ; i++){
		storage += '<tr><td>'+(i+1)+'</td>'+
				'<td>'+studentlist[i].name+'</td>' +
				'<td>'+studentlist[i].kor+'</td>' +
				'<td>'+studentlist[i].eng+'</td>' +
				'<td>'+studentlist[i].mat+'</td>' +
				'<td>'+studentlist[i].sum+'</td>' +
				'<td>'+studentlist[i].avg+'</td>' +
				'<td><button onclick=삭제하기('+ i +')>삭제하기</button></td></tr>'
	}
	listtable.innerHTML = storage;	
}


function 순위정렬(){
	for(let i = 0 ; i<studentlist.length ; i++){
		for(let j = i ; j<studentlist.length ; j++){
			if(studentlist[i].sum<studentlist[j].sum){
				let tmp = studentlist[i];
				studentlist[i] = studentlist[j];
				studentlist[j] = tmp ;
			}
		}
	}
}



function 삭제하기(index){
	console.log(index)
	studentlist.splice(index, 1)
	순위정렬()
	let storage = '<tr><th>등수</th><th>이름</th><th>언어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th></tr>';	
	for(let i = 0 ; i<studentlist.length ; i++){
		storage += '<tr><td>'+i+'</td>'+
				'<td>'+studentlist[i].name+'</td>' +
				'<td>'+studentlist[i].kor+'</td>' +
				'<td>'+studentlist[i].eng+'</td>' +
				'<td>'+studentlist[i].mat+'</td>' +
				'<td>'+studentlist[i].sum+'</td>' +
				'<td>'+studentlist[i].avg+'</td>' +
				'<td><button onclick=삭제하기('+ i +')>삭제하기</button></td></tr>'	;			
	}
	listtable.innerHTML = storage;	
}











