/**
 * 
 */
 let 상태 = false // checked이면 true !=checked이면 false
 
 const checkbox = document.querySelector('input')
 
 checkbox.addEventListener('change' , ( e ) =>{
	상태 = e.currentTarget.checked	
})


const 링크 = document.querySelector('a')

링크.addEventListener('click' , ( e )=>{
	if( !상태 ){
		// (!상태) = ( 상태==false ) = ( 상태 == true)		
		e.preventDefault()
	}	
})