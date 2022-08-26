/**
 * 
 */
 
 
let studentlist = [ ]

점수출력()

function 점수등록(){

	 const student={
		name : document.getElementById('name').value ,
		kor : Number(document.getElementById('kor').value) ,
		mat : Number(document.getElementById('mat').value) ,
		eng : Number(document.getElementById('eng').value) ,
		sum : Number(document.getElementById('kor').value) + Number(document.getElementById('mat').value) + Number(document.getElementById('eng').value) ,
		avg : (Number(document.getElementById('kor').value) + Number(document.getElementById('mat').value) + Number(document.getElementById('eng').value))/3
	}
		if( 중복검사(student.name) ){
			return
		}
		studentlist.push( student )
 		
 		alert('학생 등록이 완료되었습니다.')
 		
 		점수출력()
 		
 		document.getElementById('name').value = ''
 		document.getElementById('kor').value = ''
 		document.getElementById('mat').value = ''
 		document.getElementById('eng').value = '' 		
 	}
 	
 	
function 중복검사( name ){
	for(let i ; i<= studentlist.length ; i++){
		if(studentlist[i].name === name){
			alert('이미 등록된 이름입니다.')
			return true
		}else{
			return false
		}
	}	
}


function 점수출력(){
	let html = '<tr><th>등수</th>	<th>이름</th>	<th>국어</th>	<th>수학</th>	<th>영어</th>	<th>총점</th>	<th>평균</th>	<th>비고</th>	</tr>'
	
	등수나열()
	for(let i = 0 ; i<studentlist.length ; i ++){
		html += '<tr>'+
				'<td>'+(i+1)+'</td>'+
				'<td>'+studentlist[i].name+'</td>'+
				'<td>'+'<button onclick="점수수정kor('+i+')">'+studentlist[i].kor+'</button>'+'</td>'+
				'<td>'+'<button onclick="점수수정mat('+i+')">'+studentlist[i].mat+'</button>'+'</td>'+
				'<td>'+'<button onclick="점수수정eng('+i+')">'+studentlist[i].eng+'</button>'+'</td>'+
				'<td>'+studentlist[i].sum+'</td>'+
				'<td>'+studentlist[i].avg+'</td>'+
				'<td>'+'<button onclick="점수삭제('+i+')">삭제</button>'+'</td>'+	
				'</tr>'
	}
	document.getElementById('listtable').innerHTML = html	
}



function 점수삭제(i){
	alert(studentlist[i].name+'의 점수를 삭제합니다.')
	studentlist.splice(i, 1)
	점수출력()
}


function 등수나열(){
	for(let i = 0 ; i < studentlist.length ; i++){
		for(let j = i+1 ; j < studentlist.length ; j++){
			let temp = 0
			if(studentlist[i].sum < studentlist[j].sum){
				temp = studentlist[i]
				studentlist[i] = studentlist[j]
				studentlist[j] = temp
			}
		}
	}	
}


function 점수수정kor(i){
		const correctscore = Number(prompt('새로운 점수를 입력해 주세요.'))
		studentlist[i].sum = (studentlist[i].sum - (studentlist[i].kor-correctscore))
		studentlist[i].avg = studentlist[i].sum/3 
		studentlist[i].kor = correctscore
		
		alert('점수 수정이 완료 되었습니다.')
		
		점수출력()
}

function 점수수정mat(i){
		const correctscore = Number(prompt('새로운 점수를 입력해 주세요.'))
		studentlist[i].sum = (studentlist[i].sum - (studentlist[i].mat-correctscore))
		studentlist[i].avg = studentlist[i].sum/3 
		studentlist[i].mat = correctscore
		
		alert('점수 수정이 완료 되었습니다.')
		
		점수출력()
}
function 점수수정eng(i){
		const correctscore = Number(prompt('새로운 점수를 입력해 주세요.'))
		studentlist[i].sum = (studentlist[i].sum - (studentlist[i].eng-correctscore))
		studentlist[i].avg = studentlist[i].sum/3 
		studentlist[i].eng = correctscore
		
		alert('점수 수정이 완료 되었습니다.')
		
		점수출력()
}