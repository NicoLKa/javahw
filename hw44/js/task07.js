function sumSq(arr) {
    let newArr = [];
    for (let i = 0; i < arr.length; i++) {
        let sqr = arr[i] ** 2;
        newArr.push(sqr);
    }
    let resSum = 0;

    for (let j = 0; j < newArr.length; j++) {
        resSum += newArr[j];
    }
    return resSum;
}

console.log(sumSq([1, 2, 4, 10, 7, 4]));

