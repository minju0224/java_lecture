// for in 반복문 : 객체의 모든 키를 순회
var student = {
    name : '유관순',
    age : 16,
    getInfo() {
        return `${this.name},${this.age}`;
    }
};

for(var key in student){
    console.log(`key : ${key}`);
    console.log(`student[key] : ${student[key]}`);
}