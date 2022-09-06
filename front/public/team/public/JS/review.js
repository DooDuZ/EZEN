


/*

const name = document.querySelector('post_name')
const post_pw = document.querySelector('post_pw')
const star = document.querySelectorAll('star')
const post_title = document.querySelector('post_title')
const post_text = document.querySelector('post_text')
const post_img = document.querySelector('post_img')



const namebox = []

function 리뷰입력(){
	
	namebox.push( name.value )
	
	console.log(namebox)
	
	document.getElementById('review_get').innerHTML += 
	
	'<div>'+
		'<div>'+
			'<div>'+
				'<div>'+
					'<div> new </div>' +
				'</div>'+
				'<div> ★ </div>' +
				'<div>'+ name.value +'</div>' +
				'<div> 견주님 </div>' +
			'</div>' +
				'<div>'+ post_text.value +'</div>' +
		'</div>' +
			
		'<div>' +
			'<div>'+ post_img.value + '</div>' +
		'</div>' +
	'</div>'
			
	
}

*/







/*
let reviewlist = []
	// 2. post의 내용을 담아줄 변수를 배열로 만들어줌
	
const post = {
		name : document.querySelector('.post_name').value ,
		pw : document.querySelector('.post_pw').value ,
		star : document.querySelectorAll('.star').vlaue ,
		text : document.querySelector('.post_text').value,
		img : document.querySelector('.post_img').value
	}
	
function 리뷰입력(){

	// 1. html에 있는 input 내용 가져오기
	
	
	// 3. 인풋으로 받은 내용을 배열에 담기
	reviewlist.push( post )
		
	// 입력되면 알림
	alert('후기 등록 완료')
	console.log( reviewlist )
	
	
	리뷰등록()
	// input에 입력이 완료되었다면 리뷰등록 함수가 출력될 수 있게 호출
}

 
function 리뷰등록(){
	
		// 등록 버튼을 눌렀을때 출력될 틀	
	let get = ''


		// 리뷰 리스트의 랭스 길이까지 1개씩증가
	for(let i = 0; i < reviewlist.length; i++){
		
			get += 
				'<div class="review_get_box">'+
					'<div class="review_text">'+
						'<div class="text_01">'+
							'<div class="new_box">'+
								'<div class="new_text">NEW</div>'+
							'</div>'+
							'<div class="get_star">★★★★★</div>'+
							'<div class="get_name">'+ name.value +'</div>'+
							'<div class="get_name2">견주님</div>'+
						'</div>'+
						'<div class="get_text">'+
						'가족들이 바빠지기 시작하면서 혼자 있을때 분리 불안도 심해지고 입질도 보여서 고민하던중'+
						'유치원 서비스랑 훈련도 함께 받을 수 있는 댕댕이 유치원을 알게되었어요!!'+
						'선생님들 다 친절하고 경력도 많으신 분들이라 믿음직하고 커리큘럼에 따라 체계적으로 교육해주시는거 같아서 맘 놓고 맡길 수 있어서 넘 조아요ㅠㅠㅠㅠ'+
						'</div>'+
					'</div>'+
					
					'<div class="review_img">'+
						'<div class="get_img">'+ '</div>'+
					'</div>'+
				'</div>'
	}			
	
		// alert('등록..됐니..?')
	
		document.getElementById('review_get').innerHTML += get
}

*/
	

	
	

const name = document.querySelector('.post_name')
const pw = document.querySelector('.post_pw')
const point = document.querySelectorAll('.star')
const post_text = document.querySelector('.post_text')
const post_img = document.querySelector('.post_img')


let point_star = ''

	// const name_box = [ ]
	/*
	function 리뷰입력(){
	   name_box.push(name.value)
	   console.log(name_box)
	}
	*/

let count = 0
function 리뷰입력(){
   count++
   console.log(post_img.value)
   
   //name_box.push(name.value)

   document.getElementById('review_get').innerHTML += 
     
         '<div class="review_get_box">'+
            '<div class="review_text">'+
               '<div class="text_01"><div class="new_box">'+
                  '<div class="new_text"> NEW'+ count +'</div></div>'+
                  '<div class="get_star">'+ point_star +'</div>'+
                  '<div class="get_name">'+ name.value +'</div>'+
                  '<div class="get_name2">견주님</div>'+
               '</div>'+
               '<div class="get_text">'+ post_text.value +'</div>'+
            '</div>'+
            '<div class="review_img">'+
               '<div class="get_img"><img src="../images/'+ post_img.value.split('\\')[2] +'"></div>'+
            '</div>'+
         '</div>'
}
	


point.forEach( (e) => {
   e.addEventListener('change' , (event)=>{
      const current = event.currentTarget
      if( current.checked ){
         point_star = current.value
         console.log(current.value)
      }      
   })   
})








