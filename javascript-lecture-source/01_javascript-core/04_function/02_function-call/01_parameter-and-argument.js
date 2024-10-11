// 매개변수와 인수
function hello(name) {

    console.log(`argument :`,arguments);
    return `${name}님`;
}
// 매개변수는 함수 내부에서만 참조 가능
// console.log(name);

// 함수는 매개변수의 개수와 인수의 개수가 일치하는지 체크하지 않는다.
// 단, 인수가 부족해서 할당 되지 않은 매개변수의 값은 undefined가 된다.
var result = hello();
console.log(result);
// 매개변수보다 인수가 많은 경우 초과 된 인수는 무시
result = hello('유','홍');
console.log(result);

// 인수를 전달하지 않거나 undefined를 전달하면 기본 값이 동작하도록 설정할 수 있다.
function hi(name = '아'){
    return `${name} 안녕`;
}
result = hi('강');
console.log(result);
result = hi();
console.log(result);