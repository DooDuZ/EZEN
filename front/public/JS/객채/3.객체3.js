/**
 * 
 */
 
 
 // p. 257 : 배열도 객체이다 
 
 const a= [] // 1. 배열 선언
 
console.log(a)

a.sample = 10  // 2. 속성 추가
console.log(a.sample)

//함수도 객체이다. 
function b(){}  // 1. 함수 선언

b.sample = 10 //2. 함수에 속성 추가

console.log(b.sample)

//기본 자료형

let c = 273
c.sample = 10
console.log(c.sample)

const d = '안녕하세요'
d.sample = 10
console.log(d.sample)

//p.277 

const num = Math.random()


console.log('0-1 사이의 랜덤한 숫자 : ', num)
console.log('0~10 사이의 랜덤한 숫자 ' , num*10 )
console.log('0~50 사이의 랜덤한 숫자 ' , num*50 )
console.log('-5 ~ 5 사이의 랜덤한 숫자', num*10-5)
console.log('-25 ~ 5 사이의 랜덤한 숫자', num*25-25)