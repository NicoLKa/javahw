let number = +prompt("Введите число.");

let i = 1;
let res = "";
while (i <= number){
    if((number%i) == 0){
        res += i + " ";
    }
    i++;
}

alert("Все делители этого числа" + res);