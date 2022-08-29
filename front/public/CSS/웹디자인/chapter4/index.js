/**
 변수 = 값
 배열 = [ 값1, 값2 ]
 객체 = {키1 : 값1, 키2 : 값2} 
 */
 
 let pieData = { 
	labels : ['웹디자이너','웹개발자','서버 엔지니어','영업직'] ,
	series : [14, 9, 8, 6]
}

 let pieOptions = {
	width : '100%' , 
	height : '440px'
}

new Chartist.Pie('.pie-chart', pieData, pieOptions)

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



const name_input = document.querySelector('#name_input')
const wage_input = document.querySelector('#wage_input')


 let barData2 ={
	labels : [] ,
	series : [ [] ]
	
}

let barOptions2 = {
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


function 차트그리기(){
	
	barData2.labels.push(name_input.value)
	barData2.series[0].push(wage_input.value)
	
	new Chartist.Bar('.bar_chart2', barData2, barOptions2)
}