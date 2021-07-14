var arr_num1 = new Array(1, 2, 3);
//console.log(arr_num1);
//arr_num1.push('5');
var another_arr = [1, 2, 3, 'a', 'b', 'c', false]; //javascript syntax for arrays
//console.log(another_arr);
another_arr.push(5);
another_arr.push('d');
another_arr.push(true);
//console.log(another_arr);
var another_arr1 = [1, 2, 3];
var combination_arr = [1, 2, 3, 'f', 'g'];
for (var i = 0; i < arr_num1.length; i++) {
    console.log(arr_num1[i]);
}
for (var _i = 0, another_arr1_1 = another_arr1; _i < another_arr1_1.length; _i++) {
    var num = another_arr1_1[_i];
    console.log(num);
}
//TODO: Azmina to check
/*for(var num: number in another_arr1){
    console.log(num);
}*/
console.log("Type of another_arr1 : " + (typeof another_arr1));
console.log("Type of combination_arr : " + (typeof combination_arr));
