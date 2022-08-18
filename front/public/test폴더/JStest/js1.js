
let count = 0
let stop = setInterval( ()=> {					
					console.log(count)
					count++
					if(count == 5){
						clearInterval(stop)
					}
					
					}, 1*1000)
