"use strict";
exports.__esModule = true;
exports.vehicle = void 0;
var vehicle = /** @class */ (function () {
    function vehicle(engine, wheel, seats, fuelTank, lights) {
        console.log('inside vehicle');
        this.engine = engine;
        this.wheel = wheel;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }
    vehicle.prototype.displayInfo = function () {
        console.log("Engine type= " + this.engine);
        console.log("Fueltank capacity= " + this.fuelTank + " litres");
        console.log("Number of seats= " + this.seats);
    };
    return vehicle;
}());
exports.vehicle = vehicle;
