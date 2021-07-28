import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
currentyear;
companyname: string ="gousiya company"
  constructor() {
    this.currentyear=(new Date()).getFullYear();
   }

  ngOnInit(): void {
  }

}
