// 옵셔널 체이닝 연산자 (ES11 - 2020 에서 도입)
// 좌향의 피연산자가 null 또는 undefined인 경우 undefined를 반환하고
// 그렇지 않으면 우향의 프로퍼티 참조를 이어간다.

var obj = { value : 'hihi' };
console.log(obj?.value);
// 단축평가를 이용하면 빈 문자열과 같은 falsy 값을 false로 취급하는 문제가 있었다.

var str = '';
var len = str && str.length;
console.log(len);
var len2 = str?.length;
console.log(len2);