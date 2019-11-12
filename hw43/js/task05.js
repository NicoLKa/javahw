let more = 0;
let less = 0;
let equal = 0;
let pr;

for (let i = 0; i < 10; i++) {
    pr = prompt("Введите число.");


    if(+pr > 0){
        more++;
    }else if(+pr < 0){
        less++;
    }else {
        equal++;
    }
}

alert(`Больше 0: ${more}
            Меньше 0: ${less}
            Равно 0: ${equal}`);