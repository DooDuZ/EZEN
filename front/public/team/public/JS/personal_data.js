

const check_all = document.querySelector('#check_all')
const check_sub = document.querySelectorAll('.check_one')
const btn_signup = document.querySelector('#keepgoing')
const alertp = document.querySelector('#alertp')


const check_must = []
// 필수동의 저장 배열 및 식
for(let i = 0 ; i<4 ; i++){
	check_must.push(check_sub[i])
}



check_all.addEventListener('change', ()=>{
	select_all()	
})


function select_all(){
	if(check_all.checked){
		for(let i = 0 ; i<check_sub.length ; i++){
			if(!check_sub[i].checked){
				check_sub[i].checked = true
			}
		}
	}else{
		for(let i = 0 ; i<check_sub.length ; i++){
			if(check_sub[i].checked){
				check_sub[i].checked = false
			}
		}
	}
}

function select_one(){
	let count = 0
	for(let i = 0 ; i<check_sub.length ; i++){
		if(check_sub[i].checked==true){
			count++
		}
	}
	if(count==6){
		check_all.checked = true
	}else{
		check_all.checked = false
	}
}


function checking_must(){
	
	let count = 0
	for(let i = 0 ; i<check_must.length ; i++){
		if(check_must[i].checked==true){
			count++
		}
	}	
	if(count==check_must.length){
		window.location.href="../HTML/sign_up.html"
	}else{
		alertp.style.color = 'red'
		alertp.textContent = '필수 약관에 동의해 주세요.'
	}

}
