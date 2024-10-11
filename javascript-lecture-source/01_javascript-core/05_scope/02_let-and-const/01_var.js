// ES5까지 변수를 선언할 수 있는 유일한 방법은 var 키워드를 사용하는 것이었는데
// 이는 몇가지 문제점이 있었다.

// 1. 동일 스코프 내 중복 변수 선언 가능
var msg = "안녕하세요";
console.log(msg);
var msg = "안녕히가세요";
console.log(msg);

// 2. 함수 레벨 스코프를 가진다

// 3. 변수 호이스팅
console.log(test);
test = '반갑습니다';
console.log(test);
var test;
