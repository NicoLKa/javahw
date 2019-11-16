let start = 0;
let end = 100;
let equal = true;
let count = 0;

while(equal) {
    let sum = Math.round((end + start)/2);
    let result = prompt(`Если число равно ${sum} тогда =, если число больше >,
     если число меньше <`);
    if (result === ">") {
        start = sum;
    } else if (result === "<") {
        end = sum;
    } else if (result === "=") {
        equal = false;
    }
    count++;
}

alert(`Количество попыток ${count}`);