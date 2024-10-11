// 생성자 함수 프로토타입
const user ={
    active : true,
    login : function () {
        console.log('로그인 되었습니ㅏㄷ');
    }
};

function Student(name){
    this.name = name;
}

// 여기서의 프로토타입은 앞에서 배운 프로토타입(__proto__)과 이름만 같을 뿐 실제로 일반 프로퍼티이다.
Student.prototype = user;


// Function.prototype은 new Function()을 호출할 때만 사용 되며
// 이 때 만들어지는 객체의 [[Prototype]]을 할당한다.
let student = new Student('홍');  // student.__proto__ = user;가 내부적으로 동작
let student2 = new Student('유');
let student3 = new Student('신');

console.log(student.name);
console.log(student.active);
console.log(student2.name);
console.log(student2.active);
console.log(student3.name);
console.log(student3.active);