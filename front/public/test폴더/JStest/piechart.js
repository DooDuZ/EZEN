/**
 * 
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