import { vehicle } from "./vehicle";

class cycle extends vehicle{ 
    private comfort: string;
    
         constructor(handle: string, doom: string, weight: number, 
         brand: string, maximumSpeed: number, engine: string, wheel: number, seats: number, fuelTank: number, lights: string, comfort: string){
         super(engine, wheel, seats, fuelTank, lights);

         this.comfort=comfort;

         }
 
      displayInfo()
      {
         console.log(`Comfort= ${this.comfort}`);
         console.log(`############################################################`);
         super.displayInfo();
     }
    }
     let objectCycle= new cycle('short handle', 'no doom',15, 'Hercules', 40, 'NO engine', 
     2,2,0,'nil','Less comfort compared to bike');
    
     objectCycle.displayInfo();