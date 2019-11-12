let number = +prompt("Введите число от 0 до 100.");
let res;
let N = 100;
let check1 = true;
let check2 = true;
while (true) {
    res = +prompt("Отгадываем.");
    N = N / 2;
    if (res > number ) {
        if(check1 == false && res < 50){
            alert(`Ваше число: > N (от ${N + N} до ${50})`);
        }else {
            alert(`Ваше число: > N (от ${0} до ${50})`);
            N = 50;
        }
        check1 = false;
    } else if (res < number) {
        if(check2 == false && res > 50){
            alert(`Ваше число: < N (от ${N += (N*2)} до ${100})`);
        } else {
            alert(`Ваше число: < N (от ${51} до ${100})`);
        }
        check2 = false;
    } else if (res === number) {
        alert("Ваше число == N");
        break;
    }
}