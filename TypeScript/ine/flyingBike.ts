import { bike } from "./bike";

class flyingBike extends bike{ 
    private wings: string;
    
     constructor(handle: string, doom: string, weight: number, 
         brand: string, maximumSpeed: number, engine: string, wheel: number, seats: number, fuelTank: number, lights: string, wings: string){
         super(handle,doom, weight, brand, maximumSpeed, engine, wheel, seats, fuelTank, lights);
         this.wings=wings;
         }
 
      displayInfo(){
        
         //console.log(`${this.brand} is a great bike which attains the maximum speed of ${this.maximumSpeed}kms`);
         //console.log(`The weight of the vehicle is ${this.weight} kilograms`);
         
         super.displayInfo();
         console.log(`############################################################`);
     }
    }
     let objectFlyingBike= new flyingBike('short handle', 'no doom',15, 'Photon', 250, 'Gasoline', 2,2,100,'headlight and backlights','You have wings to fly');
     objectFlyingBike.displayInfo();

     let objectBike= new bike('short handle', 'no doom',300, 'Royal enfield', 200, 'petrol Engine', 2,2,15,'headlight and backlights');
     objectBike.displayInfo();