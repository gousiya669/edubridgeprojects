"use strict";
exports.__esModule = true;
exports.Person = void 0;
//To create a class, use class keyword followed by ClassName
var Person = /** @class */ (function () {
    //someVariable: string;
    //constructor
    function Person(personName, age, gender) {
        console.log('I am Person class constructor');
        this.personName = personName;
        this.age = age;
        this.gender = gender;
    }
    //Member function or methods
    Person.prototype.displayInfo = function () {
        console.log(this.personName + " is a " + this.gender + " with age " + this.age);
    };
    return Person;
}());
exports.Person = Person;
//let objPerson1 = new Person('Azmina',35,'Female');
//objPerson1.someVariable = 'some value';
//objPerson1.personName = 'some name';
//objPerson1.displayInfo();
//let objPerson2 = new Person('Jay',24,'Male');
//objPerson2.displayInfo();
