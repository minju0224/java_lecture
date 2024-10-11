// 반환문

function hello(name) {
    // 반환문
    return `${name}님 안녕`;
    // 반환문 이우의 코드는 실행되지 않고 무시 된다.
    console.log(name);
}

console.log(hello('유'));

function func() {
    console.log('함수가 호출 됨');
    // 반환 값이 없는 경우 return문 생략 하면 암묵적으로 undefined가 반환 된다.
    return; // 반환 값이 명시적으로 작성 되지 않은 경우도 undefined가 반환 된다.
}

console.log(func());