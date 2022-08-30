/*
	순서도
	
	1. 인풋에 입력한 값을 가져와
	name pw star text img
	- 가져오는 함수 코드 만들기
	- 저장해줄 변수 만들기
 
	2. 등록 버튼을 눌렀을때 alert는 뜨니까 일단 제대로 써진거 같음
	- 인풋에 입력한 값을 배열에 저장
	
	3. 리뷰등록() 함수명으로 출력
	
	4. 마지막에 등록한 후기가 맨위로 올라오게 순위정렬
*/


const name = document.querySelector('.post_name')
const pw = document.querySelector('.post_pw')
const point = document.querySelectorAll('.star')
const post_text = document.querySelector('.post_text')
const post_img = document.querySelector('.post_img')

const name_box = [ ]

/*
function 리뷰입력(){
	name_box.push(name.value)
	console.log(name_box)
	
}
*/

let count = 0
function 리뷰입력(){
	count++
	
	name_box.push(name.value)
	
	console.log(count)
	console.log(name_box[count-1])
	console.log(post_text.value)


	document.getElementById('review_get').innerHTML += 
		'<div id="review_get">'+
			'<div class="review_get_box">'+
				'<div class="review_text">'+
					'<div class="text_01"><div class="new_box">'+
						'<div class="new_text">NEW</div></div>'+
						'<div class="get_star">★★★★★</div>'+
						'<div class="get_name">'+name.value+'</div>'+
						'<div class="get_name2">견주님</div>'+
					'</div>'+
					'<div class="get_text">'+post_text.value+'</div>'+
				'</div>'+
				'<div class="review_img">'+
					'<div class="get_img"> </div>'+
				'</div>'+
			'</div>'		 
		'</div>'

}







