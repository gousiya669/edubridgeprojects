import {Person} from './Person';

export class Student extends Person{
    //name: string;
    private studentId: number;
    //age: number;
    //gender: string;
    private marks: number;
    private standard: string;

    constructor(studentName: string, studentAge: number, studentGender: string, 
        studentId: number, marks: number, standard: string){
        //console.log('Before calling super');
        super(studentName,studentAge,studentGender);
        console.log('I am student class constructor');
        this.studentId = studentId;
        this.marks = marks;
        this.standard = standard;
    }

    //Using same method name of your parent becomes method overriding
    displayInfo(){
        super.displayInfo();
        console.log(`Marks are: ${this.marks}`);
        //console.log(this.personName);
        //console.log(this.age);
        //console.log(this.gender);
    }
    
}

let objStudent1 = new Student('Arun', 24, 'Male', 1, 94, 'Degree');
objStudent1.displayInfo();
//objStudent1.displayStudentInfo();
//objStudent1.personName;
//objStudent1.age;
//objStudent1.gender;