// 함수 호이스팅

// 함수 선언문을 런타임 이전 자바스크립트 엔진에 의해 먼저 실행 된다.
// 따라서 함수 선언문 이전에 함수를 참조할 수 있고 호출 할 수 있다.
// 함수 선언문이 코드의 선두를 끌어올랴진 것처럼 동작하는 것을 "함수 호이스팅"이라고 한다

// 변수 할당문의 값은 할당문이 실행 되는 시점, 즉 런타임에 평가 되므로 함수 표현식의 리터럴도
// 할당문이 실행되는 시점에 평가 되어 함수 객체가 된다.

// 함수 참조
console.log(hello('홍'));
console.log(hi('유'));
// 함수 호출
console.log(hello('홍길동'));
// TypeError: hi is not a function
// console.log(hi('홍길동'));
// 함수 선언문
function hello(name) {
    return `${name}님 안녕하세요!`;
}
// 함수 표현식
var hi = function(name) {
    return `${name} 안녕~`;
}
