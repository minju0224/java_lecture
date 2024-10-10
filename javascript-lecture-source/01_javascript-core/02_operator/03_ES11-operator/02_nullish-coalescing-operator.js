// null 병함 연산자
// 좌항의 피연산작 null 또는 undefined 인 경우 우항의 피연샂나를 반환하고
// 그렇지 않으면 좌항의 피연산자를 반환한다. 변수에 기본 값을 설정할 때 유용하다.
var obj = null;
var test = obj ?? '기본';
console.log(test)

// 단축 평가 활용 시 빈 문자열과 같이 falsy 값을 false로 취급해서 생기는 문제가 있다.
var val = '' || '기본 값';
console.log(val);
var val2 = '' ?? '기본 값';
console.log(val2)