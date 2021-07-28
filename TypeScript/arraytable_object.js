function student(stdname, lastName, email) {
    this.stdname = stdname;
    this.lastName = lastName;
    this.email = email;
}
var student1 = new student("Peter", "Eze", "peter@test.com");
var student2 = new student("Chris", "Nwamba", "chris@test.com");
var student3 = new student("William", "Imoh", "william@test.com");
console.table([student1, student2, student3]);
