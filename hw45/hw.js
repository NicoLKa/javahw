function isUpperCaseFirstLetter(str) {
    return /^[A-ZА-Я]/g.test(str);
}

function isValidEmail(str) {
    return /\w+@\w+.\w+$/.test(str);
}

function trimString(str) {
    str = str.replace(/^\s*/, "")
        .replace(/\s*$/g, "")
        .replace(/\s/g, " ")


    return str;
}

function thousandsSeparators(num) {
    num = num.toString().replace(/(\d)(?=((\d{3})+)(\D|$))/g, '$1,');
    return num;
}
