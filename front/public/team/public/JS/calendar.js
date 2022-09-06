let current_year = (new Date()).getFullYear() // 현재 년도 가져오기
let current_month = (new Date()).getMonth() + 1 // getMonth()하면 1월을 넣으면 0이 들어와서 +1해줌

document.getElementById('year').innerHTML = current_year
document.getElementById('month').innerHTML = current_month

changeYearMonth(current_year, current_month)

function checkLeapYear(year) {
	if(year%400 == 0) {
		return true
	} else if(year%100 == 0) {
		return false
	} else if(year%4 == 0) {
		return true
	} else {
		return false;
	}
}

function getFirstDayOfWeek(year, month) {
	if(month < 10) month = "0" + month
	
	return (new Date(year+"-"+month+"-01")).getDay() // 그 월의 1일이 일요일이면 0, 월요일 1, 화요일 2 각각 리턴
	// 각 월의 1일 가져오는 함수, (2022-08-01)에서 각 요일값 리턴
}

function changeYearMonth(year, month) {
	let month_day = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
	if(month == 2) { // month로 2월을 받았을때
		if(checkLeapYear(year)) month_day[1] = 29
	}
	
	let first_day_of_week = getFirstDayOfWeek(year, month)
	let arr_calendar = []
	for(let i = 0 ; i<first_day_of_week ; i++) {
		arr_calendar.push("")
	}
	
	for(let i = 1 ; i<=month_day[month-1] ; i++) { // month_day까지 반복
		arr_calendar.push(String(i))
	}
	
	let remain_day = 7 - (arr_calendar.length%7)
	if(remain_day < 7) { // 남은 날 만큼 공백 넣기
		for(let i=0 ; i<remain_day ; i++) {
			arr_calendar.push("")
		}
	}
	
	renderCalendar(arr_calendar)
}

function renderCalendar(data) {
	let calender_day = []
	for(let i = 0 ; i<data.length ; i++) {
		if(i==0) {	// 데이터의 시작점에 <tr>태그를 연다.
			calender_day.push('<tr>')
		} else if(i%7 == 0) { // 7번째 되면 다음 줄로 넘김
			calender_day.push('</tr>')
			calender_day.push('<tr>')
		}
		
		calender_day.push(`<td>${data[i]}</td>`) // 이외의 조건에 모든 날을 출력한다.
		
		document.getElementById('tb_body').innerHTML = calender_day.join("") // 배열 반복할때 join("")을 써서 쉼표 제거
	}
}

// 화살표버튼 변경 함수
function changeMonth(diff) {
	current_month = current_month + diff;
	
	if(current_month == 0) { // 줄어서 0이 됐으면
		current_year = current_year - 1
		current_month = 12
	} else if (current_month == 13) {
		current_year = current_year + 1
		current_month = 1
	}
	
	loadCalendar()
}

function loadCalendar() {
	changeYearMonth(current_year, current_month) // 달력을 그려줄 함수에 달라진 값을 넘겨준다.
	document.getElementById('year').innerHTML = current_year
	document.getElementById('month').innerHTML = current_month
}
























