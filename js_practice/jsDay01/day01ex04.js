/* day01ex04.js */
// 자바스크립트 연산자와 자바의 연산자는 거의 동일
// =,==,=== 가 차이가있음
// =   :  대입연산자 
// ==  :  부등호 ( != )  비슷한 것 true
// === :  부등호 ( !== ) 타입까지 같은 것 true 

console.log(100 == '100') // true
console.log(100 === '100') // false

var name = '홍길동';
var name = '김길동'; 
// var로 변수를 선언할 때는 같은 식별자로 선언 가능. 
// 변수의 scope가 함수 단위이다. 

console.log('name',name); // 마지막으로 선언한 것으로 출력됨

let name2 = '박길동'; 
//  let name2 = '최길동';
//  let으로 변수를 선언하면 같은 식별자를 사용 할 수 없다.
//  변수의 scope가 블럭단위 
console.log('name',name) // 오류발생 

