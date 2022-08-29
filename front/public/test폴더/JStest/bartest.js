/**
 * 
 */
 
 
 
 let barData ={
	labels : ['2018년', '2019년', '2020년'] ,
	series : [[10,16,29]]
	
}

let barOptions = {
	axisY : {
		offset : 60,
		scaleMinSpace : 50,
		labelInterpolationFnc : function(value){
			return value + '명'
		}
	},
	width : '100%',
	height : '400px'
}

new Chartist.Bar('.bar_chart', barData, barOptions)