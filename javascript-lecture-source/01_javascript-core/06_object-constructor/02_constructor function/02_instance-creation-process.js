function Student(name, age) {
    // 1. 암묵적으로 인스턴스가 생성 되고 this에 바인딩 되는 과정이 런타임 이전에 실행
    console.log(this);
    // 2. this에 바인딩 되어 있는 인스턴스에 프로퍼티를 초기화 한다.
    this.name = name;
    this.age = age;
    this.getInfo = function () {
        return  `${this.name}은 ${this.age}세`;
    }
    // 3. 완성 된 인스턴스가 바인딩 된 this가 암묵적으로 반환된다.
    // return {}; -> 명시적으로 객체를 반환하면 암묵적인 this 반환이 무시 된다
    // return{}; -> 명시적으로 워시값을 반환하면 return 구문이 무시 되고 thiss가 반환된다.
}
const student1 = new Student('wkd',24);
console.log(student1);
console.log(student1.getInfo());