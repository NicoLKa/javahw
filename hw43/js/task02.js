let first = +prompt("Первое число.");
let second = +prompt("Второе число.");

if (second > first) {
    let temp = first;
    first = second;
    second = temp;
}

while (true) {
    if (second == 0){
        alert(first);
        break;
    }
    first %= second;
    if (first == 0){
        alert(second);
        break;
    }
    second %= first;
}
