// function,String,Number 를 비롯한 내장 객체를 역시 프로토타입 메섣들를 저장한다.
// 모든 내장 프로토타입 상속 트리 꼭대기에는 Object.prototype이있어야 한다고 규정한다.
const num = new Number(100);

// num은 Number.prototype을 상속받았는가?
console.log( num.__proto__ === Number.prototype ); // true
// num은 Object.prototype을 상속받았는가?
console.log( num.__proto__.__proto__ === Object.prototype ); // true
// 체인 맨 위엔 null이 있다.
console.log( num.__proto__.__proto__.__proto__ ); // null
// Number.prototype의 toString 사용
// Object.prototype에도 toString이 있지만 Number.prototype에도 toString이 있기 때문에
// 체인에서 가까운 메소드가 사용이 된다.
console.log(num);
console.log(num.toString());

// 내장 프로토타입을 수정할 수 있다. 하지만 가급적 변경하지 않도록 한다.
// 명세서에 새로 등록 된 기능을 쓰고 싶지만 자바스크립트 엔진에 구현 되어 있지 않은 경우 정도에만  변경하는 것이 좋다.
String.prototype.hello = function (){
    console.log(`hello, ${this}`);
}

"JavaScript".hello();