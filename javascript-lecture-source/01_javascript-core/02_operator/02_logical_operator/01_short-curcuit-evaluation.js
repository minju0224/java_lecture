// 단축 평가
// 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략하는 것
// &&,|| 연산자 표현식의 결과가 때로는 boolean 값이 아닐 수 도 있다.

//논리 값으로 true 라고 함 trutly
console.log('apple' || 'banana');
console.log(false || 'banana');

console.log('apple' && 'banana');
console.log(false && 'banana');

// 단축 평가를 활용하면 if문을 대체할 수 있다.
var num = 1;
num%2 == 0 && console.log('짝');
num%2 == 0 || console.log('홀');

// 객체를 가르키기를 기대하는 변수가 null 또는 undefined가 아닌지 확인하고
// 프로퍼티를 참조 할 때 단축 평가를 사용할 수 있다.
var obj = null;
// var val = obj.value;
var val2 = obj && obj.value;