let start = 0;
let end = 100;
let equal = true;
let count = 0;

do {
    let result = prompt(`Если число равно ${((end + start)/2)} тогда =, если число больше >,
     если число меньше <`);
    count++;
    if (result === ">") {
        start = (start + end) / 2;
    } else if (result === "<") {
        end = (start + end) / 2;
    } else if (result === "=") {
        equal = false;
    }
} while (equal || result !== null);

alert(`Количество попыток ${count}`);