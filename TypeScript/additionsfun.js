function addNumbers(a, b) {
    return a + b;
}
var sum = addNumbers(10, 15);
console.log('Sum of the two numbers is using named functions: ' + sum);
var sayWelcome = function () {
    console.log('Say Welcome');
};
var sum1 = (function (a, b) {
    return a + b;
})(1, 2);
console.log('Sum of the two numbers is using Anonymous  functions: ' + sum1);
