let pr;
let firstN;
let secondN;

while (true) {
    firstN = +prompt("Введите первое число.");
    pr = prompt("Введите знак число.");
    secondN = +prompt("Введите второе число.");


    if (pr === "+") {
        alert(firstN + secondN);
    } else if (pr === "-") {
        alert(firstN - secondN);
    } else if (pr === "/") {
        alert(firstN / secondN);
    } else if (pr === "*") {
        alert(firstN * secondN);
    }

    if (confirm("Хотите ли вы решить еще пример?")) {
        continue;
    } else {
        break;
    }

}