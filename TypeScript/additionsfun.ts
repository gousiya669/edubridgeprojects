function addNumbers(a: number, b: number) { 
    return a + b; 
} 

var sum: number = addNumbers(10, 15) 

console.log('Sum of the two numbers is using named functions: ' +sum); 






var sum1 = (function(a: number, b: number){
  return a + b;
})(1, 2);
console.log('Sum of the two numbers is using Anonymous  functions: ' +sum1); 