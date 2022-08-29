/**
 * 
 */


/*
 let i = 210
 
 function scroll_down(){
	i += 10
	dot_bar.style.height = i+'px'
}

 function scroll_up(){
	i -= 10
	dot_bar.style.height = i+'px'
}
		window.scrollY 써야함!!

*/

const dot_bar = document.querySelector('.dot_bar')

window.addEventListener('scroll', () => { 	
		
		let height = window.scrollY
		
		console.log(height)
		
		function scroll_move(){
			dot_bar.style.height = height + 210 + 'px'
		}
		scroll_move()
		console.log(dot_bar.style.height)
})




/*

window.addEventListener('scroll', ( ) => { 
	s_p.push(window.scrollY)
	let j = 1
	j++
	for(let k=1 ; k<=j ; k++){
		if(scroll && s_p[k]>s_p[k-1]){
			scroll_down()
			console.log(dot_bar.style.height)
		}else if(!scroll){
			scroll_up()
			console.log(dot_bar.style.height)
		}
	}
	
});

*/
