let number = prompt("Введите число.");
let shift = +prompt("На сколько сдвинуть число?");

alert(number.substring(shift) + number.substring(0, shift));