// [[Prototype]]
const user = {
    active :true,
    login : function () {
        console.log('로그인 완료');
    }
};

const student = {
    passion : true
};

student.__proto__ = user;  // __proto__는 [[ProtoType]]의 getter, setter
// student는 user를 상속받는다.
console.log(student.passion);
console.log(student.active);
student.login();

// => student의 프로토타입은 user이다. 또는 student는 user를 상속 받는다. 라고 표현
// => 프로토타입에서 상속 받은 프로퍼티를 상속 프로퍼티라고 한다.

// 프로토타입 체인
const greedyStudent = {
    class :2 ,
    __proto__ : student
};

console.log(greedyStudent.class);
console.log(greedyStudent.passion);
greedyStudent.login();