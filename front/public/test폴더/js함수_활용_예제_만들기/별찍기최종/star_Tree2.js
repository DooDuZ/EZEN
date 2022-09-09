


let array = [];

let output = '';

for(let i=1 ; i<=5 ; i++) {
	if(i%2!=0) {
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


//반복 필요한 부분 함수 선언

function unit(i){
	for(let b = 1 ; b<=(5-i)/2 ; b++) {
		output += ' ';
	}
	for(let s= 1 ; s<=i ; s++) { 
		if(i==3 && s==2){
			output+=' ';
		}else {
			output+='*';
		}
	}for(let b = 1 ; b<=(5-i)/2+1 ; b++) {
		output+=' ';
	}	
}


function unit2(i){
	for(let b = 1 ; b<=(5-i)/2 ; b++) {
		output += ' ';
	}
	for(let s= 1 ; s<=i ; s++) { 
		if(i==3 && s==2){
			output+=' ';
		}else {
			output+=' ';
		}
	}for(let b = 1 ; b<=(5-i)/2+1 ; b++) {
		output+=' ';
	}	
}

// unit(i) = 별 그리는 부분 unit(0) = 공백 부분


function pushOutput(){
	array.push(output)
}
pushOutput()


// 단위 높이 1 완

output = '';

for(let i=1 ; i<=5 ; i++) {
	output += '   '; 
	if(i%2!=0) {
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	if(i%2!=0) {
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';

pushOutput()

output = '';


// 단위 높이 2 완

for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 9 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 6 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 3 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit2(i);
		unit(i);
		output +='\n';	
	} else {
		output +='\n';
	}
}output +='\n';

for(let i=1 ; i<=5 ; i++) {
	if(i%2!=0) {
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';

pushOutput();

output = '';

console.log(array)
console.log(array[0])
console.log(array[1])
console.log(array[2])


// 최종 4단

for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 21 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 18 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 15 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit2(i);
		unit(i);
		output +='\n';	
	} else {
		output +='\n';
	}
}output +='\n';

for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 12 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';

//마지막 단 반복

for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 9 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit2(i);
		unit2(i);
		unit2(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 6 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit(i);
		unit2(i);
		unit2(i);
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';


for(let i=1 ; i<=5 ; i++) {
	for(let j = 1 ; j<= 3 ; j++){
		output += ' '; 
	}
	if(i%2!=0) {
		unit(i);
		unit2(i);
		unit(i);
		unit2(i);
		unit(i);
		unit2(i);
		unit(i);
		output +='\n';	
	} else {
		output +='\n';
	}
}output +='\n';

for(let i=1 ; i<=5 ; i++) {
	if(i%2!=0) {
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		unit(i);
		output +='\n';				
	} else {
		output +='\n';
	}
}output +='\n';

pushOutput()
output = '';
console.log(array)
console.log(array[3])



/*실험 후 폐기
function make_tree(){
	for(let i=1 ; i<=5 ; i++) {
		if(i%2!=0) {
			for(let j = 1 ; j<=4 ; j++){
				unit(i);
			}
			output +='\n';				
		} else {
			output +='\n';
		}
	}
}
*/
