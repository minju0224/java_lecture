// 즉시 실행 함수
// 함수의 정의와 동시에 즉시 호출이 되는 함수로 단 한번만 허출이 되며 다시 호출 할 수 없다.
// 함수의이름이없는 익명한수를 사용하는 것ㅇ 일반적이며 반드시 ()  - 그룹 연산자로 감싼다.
(function () {
    console.log('익명 함수');
})();

(function hello(name) {
    console.log('익명 함수(기명)');
    console.log(`${name}`);
})('홍길동');

//  referenceError : hello is no defined
// hello('유');

// => 즉시 실행 함수 내에 코드를 모아두면 혹시 있을 수 있는 변수나 함수의 충돌을 방지할 수 있다.
// => 라이브러리 사용시 우용