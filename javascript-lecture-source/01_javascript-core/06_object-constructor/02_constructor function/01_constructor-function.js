function Student(name, age) {
    this.name = name;
    this.age = age;
    this.getInfo = function () {
        return  `${this.name}은 ${this.age}세`;
    }
}

const student1 = new Student('wkd',24);
const student2 = new Student('sgd',35);

console.log(student1);
console.log(student1.getInfo());
console.log(student2);
console.log(student2.getInfo());
