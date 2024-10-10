// 자바스크립트의 하수는 객체이다
// 함수는 값응로 취급할 수 있고, 프로퍼티 값으로 사용할 수 있다.
var dog = {
    name : '뽀비' ,
    eat : function (food){
        console.log(`${this.name}은 ${food}를 맛있게 먹어요`)
    }
};

dog.eat('고구마');