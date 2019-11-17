function arrayClone(arr){
    let clArr = [];
    for (let i = 0; i < arr.length; i++) {
        clArr[i] = arr[i];
    }
    return clArr;
}

console.log(arrayClone([1, 2, 4, 0]));
console.log(arrayClone([1, 2, [4, 0]]));
