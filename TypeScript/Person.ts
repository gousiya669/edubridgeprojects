//To create a class, use class keyword followed by ClassName
class Person{
   private personName: string;
   private age: number;
   private gender: string;

   constructor(personName: string, age: number, gender: string){
       console.log('I am Person class constructor');
       this.personName = personName;
       this.age = age;
       this.gender = gender;
   }

   displayInfo(){
    console.log(`${this.personName} is a ${this.gender} with age ${this.age}`);
   }

}

let objPerson1 = new Person('Azmina',35,'Female');
objPerson1.displayInfo();

let objPerson2 = new Person('Jay',24,'Male');
objPerson2.displayInfo();
