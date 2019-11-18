'use strict';
let color = 'black';

if (Math.ceil(Math.random() * 100) <= 50) {
    drawBox(setColor(color));
} else {
    drawBox(setColor());
}

function setColor(color) {
    if (color !== undefined) {
        console.log(color);
        return color;
    } else {
        let color = 'red';
        console.log(color);
        return color
    }
}

function drawBox(color) {
    document.write("<div style='background:" + color + ";height:10px;'></div>")
}
