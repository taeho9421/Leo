/* day01ex05.js - typeof 연산자 */
// typeof 연산자는 데이터 자료형(타입)을 알고 싶을 때 사용
// typeof 연산자를 사용 할 때는 함수처럼 사용 가능.

console.log(typeof 500); // 괄호를 써도되고 안써도된다 
console.log(typeof "Hello");
console.log(typeof null);
console.log(typeof undefined);

var name; // 값이없는 선언은 변수로 인정하지않는다
console.log('name의 타입은',typeof name); // null 과 undefined 는 다르다 
name = '김길동';
console.log('name: ',name);

console.log(typeof NaN); // not a number 숫자가 아닌데 숫자처럼 사용할때 

// javascript 에서는 모든 요소가 객체로 취급된다. 
// java의 계보 : B --> C --> C++(small talk에 객체지향의 개념) --> java 
// javascript 는 Lisp 언어로 부터 계승된 언어이다.  
// R언어도 Lisp에서 물려 받은 언어이다.
