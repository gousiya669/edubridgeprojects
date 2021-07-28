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
var bike_1 = require("./bike");
var flyingBike = /** @class */ (function (_super) {
    __extends(flyingBike, _super);
    function flyingBike(handle, doom, weight, brand, maximumSpeed, engine, wheel, seats, fuelTank, lights, wings) {
        var _this = _super.call(this, handle, doom, weight, brand, maximumSpeed, engine, wheel, seats, fuelTank, lights) || this;
        _this.wings = wings;
        return _this;
    }
    flyingBike.prototype.displayInfo = function () {
        //console.log(`${this.brand} is a great bike which attains the maximum speed of ${this.maximumSpeed}kms`);
        //console.log(`The weight of the vehicle is ${this.weight} kilograms`);
        _super.prototype.displayInfo.call(this);
        console.log("############################################################");
    };
    return flyingBike;
}(bike_1.bike));
var objectFlyingBike = new flyingBike('short handle', 'no doom', 15, 'Photon', 250, 'Gasoline', 2, 2, 100, 'headlight and backlights', 'You have wings to fly');
objectFlyingBike.displayInfo();
var objectBike = new bike_1.bike('short handle', 'no doom', 300, 'Royal enfield', 200, 'petrol Engine', 2, 2, 15, 'headlight and backlights');
objectBike.displayInfo();
