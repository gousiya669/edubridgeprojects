var arr_num1 = new Array(1,2,3);

//console.log(arr_num1);

//arr_num1.push('5');

let another_arr = [1,2,3,'a','b','c',false]; //javascript syntax for arrays
//console.log(another_arr);

another_arr.push(5);
another_arr.push('d');
another_arr.push(true);

//console.log(another_arr);

let another_arr1: number[] = [1,2,3];

let combination_arr: (number|string) [] = [1,2,3,'f','g'];

for(var i = 0; i < arr_num1.length; i++){
    console.log(arr_num1[i]);
}

for(var num of another_arr1){
    console.log(num);
}

//TODO: Azmina to check
/*for(var num: number in another_arr1){
    console.log(num);
}*/

console.log("Type of another_arr1 : "+ (typeof another_arr1));
console.log("Type of combination_arr : "+(typeof combination_arr));




