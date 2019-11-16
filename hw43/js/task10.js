let start = 0;
let end = 100;
let equal = true;
let count = 0;

while(equal) {
    let result = prompt(`Если число равно ${((end + start)/2)} тогда =, если число больше >,
     если число меньше <`);
    if (result === ">") {
        start = (start + end) / 2;
    } else if (result === "<") {
        end = (start + end) / 2;
    } else if (result === "=" || result == null) {
        equal = false;
    }
    count++;
}

alert(`Количество попыток ${count}`);