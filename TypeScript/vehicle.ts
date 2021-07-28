export class vehicle{
    
    private engine: string;
    private wheel: number;
    private seats: number;
    private fuelTank: number;
    private lights: string;

 
    constructor(engine: string, wheel: number, seats: number, fuelTank: number, lights: string){
        console.log('inside vehicle');
        this.engine = engine;
        this.wheel = wheel;
        this.seats = seats;
        this.fuelTank= fuelTank;
        this.lights= lights;
    }
 
    displayInfo(){
     console.log(`Engine type= ${this.engine}`);
     console.log(`Fueltank capacity= ${this.fuelTank} litres`);
     console.log(`Number of seats= ${this.seats}`);
   
    }
 
 }