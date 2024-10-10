// 문자열 타입으로 암묵적 변환

// 1. 문자열 연결 연산자 : 문자열 타입이 아닌 피연산자를 문자열 타입으로 암묵적 변환
console.log(10 + '20');

// 2. 템플릿 리터럴 표현식 삽입 : 표현식의 결과를 문자열 타입으로 암묵적으로 변환
console.log(`10 + 20 : ${10 + 20}`);