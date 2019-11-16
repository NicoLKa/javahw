'use strict';
var color ;

function setColor() {
    if(Math.ceil(Math.random()*100) <= 50 ){
        color = 'red';
    }else {
        var color = 'black';
    }
    console.log(color);
    return color;
};

function drawBox(color) {
    document.write("<div style='background:"+ color +";height:10px;'></div>")
}

drawBox(setColor());