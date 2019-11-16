function array_Clone(arr){
    let clArr = [];
    for (let i = 0; i < arr.length; i++) {
        clArr[i] = arr[i];
    }
    return clArr;
}

console.log(array_Clone([1, 2, 4, 0]));
console.log(array_Clone([1, 2, [4, 0]]));
