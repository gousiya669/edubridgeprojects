//To create a class, use class keyword followed by ClassName
export class Person{
    //Member variables or instance variables
   protected personName: string;
   private age: number;
    gender: string;
   //someVariable: string;

   //constructor
   constructor(personName: string, age: number, gender: string){
       console.log('I am Person class constructor');
       this.personName = personName;
       this.age = age;
       this.gender = gender;
   }

   //Member function or methods
   displayInfo(){
    console.log(`${this.personName} is a ${this.gender} with age ${this.age}`);
   }

}

//let objPerson1 = new Person('Azmina',35,'Female');
//objPerson1.someVariable = 'some value';
//objPerson1.personName = 'some name';
//objPerson1.displayInfo();

//let objPerson2 = new Person('Jay',24,'Male');
//objPerson2.displayInfo();