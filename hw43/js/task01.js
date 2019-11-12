let to = +prompt("Введите от какого числа считать.");
let from = +prompt("Введите до какого числа считать.");

let res = 0;
while (to <= from){
    res += to;
    to++;
}
alert(res);