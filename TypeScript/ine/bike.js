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
exports.bike = void 0;
var vehicle_1 = require("./vehicle");
var bike = /** @class */ (function (_super) {
    __extends(bike, _super);
    function bike(handle, doom, weight, brand, maximumSpeed, engine, wheel, seats, fuelTank, lights) {
        var _this = _super.call(this, engine, wheel, seats, fuelTank, lights) || this;
        _this.handle = handle;
        _this.doom = doom;
        _this.weight = weight;
        _this.brand = brand;
        _this.maximumSpeed = maximumSpeed;
        return _this;
    }
    bike.prototype.displayInfo = function () {
        console.log(this.brand + " is a great bike which attains the maximum speed of " + this.maximumSpeed + "kms");
        console.log("The weight of the vehicle is " + this.weight + " kilograms");
        console.log("############################################################");
        _super.prototype.displayInfo.call(this);
    };
    return bike;
}(vehicle_1.vehicle));
exports.bike = bike;
