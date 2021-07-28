import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'This is gousiya';
  Occupation='student';

  username='gousiya';
clearvalue(){
  console.log("username is:"+this.username);
  this.username='';
  console.log("username is:"+this.username);
}
}
