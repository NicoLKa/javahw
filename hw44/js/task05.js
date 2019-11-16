function first(arr, n) {

    if (n == undefined) {
        return arr[0];
    } else {
        let resArr = [];
        for (let i = 0; i < n; i++) {
            if(arr[i] == undefined){
                continue;
            }
            resArr[i] = arr[i];
        }
        return resArr;
    }
}

console.log(first([7, 9, 0, -2]));
console.log(first([], 3));
console.log(first([7, 9, 0, -2], 3));
console.log(first([7, 9, 0, -2], 6));
console.log(first([7, 9, 0, -2], -3));
