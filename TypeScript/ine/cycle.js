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
var vehicle_1 = require("./vehicle");
var cycle = /** @class */ (function (_super) {
    __extends(cycle, _super);
    function cycle(handle, doom, weight, brand, maximumSpeed, engine, wheel, seats, fuelTank, lights, comfort) {
        var _this = _super.call(this, engine, wheel, seats, fuelTank, lights) || this;
        _this.comfort = comfort;
        return _this;
    }
    cycle.prototype.displayInfo = function () {
        console.log("Comfort= " + this.comfort);
        console.log("############################################################");
        _super.prototype.displayInfo.call(this);
    };
    return cycle;
}(vehicle_1.vehicle));
var objectCycle = new cycle('short handle', 'no doom', 15, 'Hercules', 40, 'NO engine', 2, 2, 0, 'nil', 'Less comfort compared to bike');
objectCycle.displayInfo();
