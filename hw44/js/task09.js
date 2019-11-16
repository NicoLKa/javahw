function unique(arr) {
    let resAr = [];
    for (let i = 0; i < arr.length; i++) {
        if (!resAr.includes(arr[i])) {
            resAr.push(arr[i]);
        }
    }
    return resAr;
}

console.log(unique([7, 9, 0, -2]));
console.log(unique([7, 7, 0, -2]));
console.log(unique([7, 9, 9, -2]));
console.log(unique([1, 1, 1, 1])); 