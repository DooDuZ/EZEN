/**
 * 
 */
 
const star = document.querySelector('h1')
star.style.position = 'absolute'

let [ x , y ] = [ 0 , 0 ]
const block = 20
const print = () => {
	star.style.left = `${x*block}px`
	star.style.top = `${y*block}px`	
}

print()


/*


*/


const [left, up , right , down] = [37 , 38 , 39 , 40]

document.body.addEventListener( 'keydown' , (event) => {
	
	// if : 논리제어[ 경우의 수가 정해져 있지 않은 경우 ]
	// switch : 값 제어[ 정해진 경우의 수 ]
	
	
	if(event.keyCode === left){
		x-=1
	}else if( event.keyCode === right ){
		x+=1
	}else if( event.keyCode === up ){
		y -= 1
	}else if( event.keyCode === down ){
		y+=1
	}
	
	/*
	switch(event.keyCode){
		case left :
			x -= 1
			break
		case up : 
			y -= 1
			break
		case right :
			x += 1
			break
		case down :
			y += 1
			break
			
		
	}
	
		*/	
	print()	
})

