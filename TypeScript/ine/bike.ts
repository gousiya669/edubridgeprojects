import { vehicle } from "./vehicle";

export class bike extends vehicle{ 
    private handle: string;
    private doom: string;
    private weight: number;
    private brand: string;
    private maximumSpeed: number;

 
     constructor(handle: string, doom: string, weight: number, 
         brand: string, maximumSpeed: number, engine: string, wheel: number, seats: number, fuelTank: number, lights: string){
         super(engine, wheel, seats, fuelTank, lights);
         this.handle= handle;
         this.doom=doom;
         this.weight=weight;
         this.brand=brand;
         this.maximumSpeed=maximumSpeed;
         }
 
      displayInfo(){
        
         console.log(`${this.brand} is a great bike which attains the maximum speed of ${this.maximumSpeed}kms`);
         console.log(`The weight of the vehicle is ${this.weight} kilograms`);
         console.log(`############################################################`);
         super.displayInfo();
     }
    }
     