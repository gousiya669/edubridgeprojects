//Declared variable using Typed Annotation
let empName: string;
empName = 'Azmina';

//console.log(empName);

let studentName: string = 'Arun';
//console.log(studentName);

let another_studentName = 'Nivetha';
//console.log(another_studentName);

//console.log('Type of empName variable: '+typeof(empName));
//console.log('Type of studentName variable: '+typeof(studentName));
//console.log('Type of another_studentName variable: '+(typeof another_studentName));


let studentNumber: number = 1234;
//console.log(studentNumber);
//console.log("Type of studentNumber: "+(typeof studentNumber));

let flag: boolean = true;
//console.log(flag);
//console.log("Type of flag: "+ (typeof flag));

//arrays
let arr_num: number[] = [1,2,3];
//arr_num.push('a'); // this will give error

let arr_str = ['a','b','c'];
//arr_str.push(1); //this will give error

//var emp_name = 'Azmina';
//var emp_id = 1;

let emp = {
    emp_name: 'Azmina',
    emp_id: 1
}

//console.log("Entire emp: "+JSON.stringify(emp));
//console.log(emp);
//console.log("Just emp name: "+emp.emp_name);
//console.log("Type of emp: "+ typeof(emp));

emp = {
    emp_id: 2,
    emp_name: 'Some emp'
};

//console.log(emp);

let arr_emp = [
    {
        emp_name: 'Aaaaa',
        emp_id: 5,
        department: 'R&D'
    },
    {
        emp_name: 'Bbbb',
        department: 'Support',
        emp_id: 6
    }
];

//console.log(arr_emp);
//console.log(arr_emp[1].emp_name);

document.write(arr_emp[1].emp_name);

//TODO: By Students:
//Emp1 Aaaa 5 R&D
//Emp2 Bbbb 6 Support

