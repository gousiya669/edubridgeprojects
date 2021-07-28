//To create a class, use class keyword followed by ClassName
var Person = /** @class */ (function () {
    function Person(personName, age, gender) {
        console.log('I am Person class constructor');
        this.personName = personName;
        this.age = age;
        this.gender = gender;
    }
    Person.prototype.displayInfo = function () {
        console.log(this.personName + " is a " + this.gender + " with age " + this.age);
    };
    return Person;
}());
var objPerson1 = new Person('Azmina', 35, 'Female');
objPerson1.displayInfo();
var objPerson2 = new Person('Jay', 24, 'Male');
objPerson2.displayInfo();
