"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Student = void 0;
var Person_1 = require("./Person");
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(studentName, studentAge, studentGender, studentId, marks, standard) {
        var _this = 
        //console.log('Before calling super');
        _super.call(this, studentName, studentAge, studentGender) || this;
        console.log('I am student class constructor');
        _this.studentId = studentId;
        _this.marks = marks;
        _this.standard = standard;
        return _this;
    }
    //Using same method name of your parent becomes method overriding
    Student.prototype.displayInfo = function () {
        _super.prototype.displayInfo.call(this);
        console.log("Marks are: " + this.marks);
        //console.log(this.personName);
        //console.log(this.age);
        //console.log(this.gender);
    };
    return Student;
}(Person_1.Person));
exports.Student = Student;
var objStudent1 = new Student('Arun', 24, 'Male', 1, 94, 'Degree');
objStudent1.displayInfo();
//objStudent1.displayStudentInfo();
//objStudent1.personName;
//objStudent1.age;
//objStudent1.gender;
