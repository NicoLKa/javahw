let number = prompt("Введите число.");


function f(number) {

    let c = 0;
    while(c < number.length) c++;
    return c;
}

alert(f(number));