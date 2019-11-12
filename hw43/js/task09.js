let res = "";
for (let i = 2; i <= 9; i++) {
    res +=`Умножение на ${i} \n`;
    for (let j = 1; j <=10 ; j++) {
        res += i +  "*" +  j + "=" + i * j + "\n";
    }

}

console.log(res);