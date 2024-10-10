var dog = {
    name : '뽀비' ,
    eat : function (food){
        console.log(`${this.name}은 ${food}를 맛있게 먹어요`)
    }
};

// 메소드 단축
var dog2 = {
    name : '뽀비' ,
    eat(food){
        console.log(`${this.name}은 ${food}를 맛있게 먹어요`)
    }
};

dog2.eat('닭가슴살');