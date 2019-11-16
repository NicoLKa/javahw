function rep(num) {
    let arr = [];

    for (let i = 0; i <  num.toString().length; i++) {
        arr.push(+num.toString().charAt(i));
    }
    for (let j = 0; j < arr.length; j++) {
        if(arr[j]%2 == 0){
            arr[j] = arr[j] + "-";
        }
    }
    console.log(arr.join(""));
}


rep(25468);