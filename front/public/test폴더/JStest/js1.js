let mynum = []
let comnums = []
let number=0;
function creat(){
	let board = ''
	for (let i = 1; i <= 45; i++) {
		board += `<button id=${i} onclick=Btn_click(${i})>${i}</button>`
		if (i % 5 == 0) { board += `<br>` }
	}
	document.getElementById('gameboard').innerHTML = board

}


function Btn_click(i) {
	let list = mynum.indexOf(i)
	if (list >= 0) {
		alert('이미 선택한 번호')
		mynum.splice(list, 1)
	}//if E
	 else {
		if (mynum.length == 6) {
			alert('6개숫자를 전부 선택했습니다.')
			return
		}//if E
		mynum.push(i)
	}//else E
	document.getElementById('shownum').innerHTML = mynum
	//왜안담기냐 죽일까
}//fun E

function comnum() {
	if (mynum.length != 6) {
		alert('6개의 숫자를 선택해주세요')
		return
	}
	while (true) {
		let number = Math.floor((Math.random()*45) + 1)
		let list=comnums.indexOf(number)
		if (list == -1) {
			if (comnums.length== 6) {
				break
			}else {
				comnums.push(number)
			}
		}
	}
	document.getElementById('comnum').innerHTML = comnums
}//fun E
