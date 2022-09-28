import { Component,OnInit } from '@angular/core';
import { MyComponent } from './MyComponents';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  ImagePath:string;
  constructor() {
    //Image location
    this.ImagePath = 'https://c.ndtvimg.com/2021-10/gjo8hnng_ms-dhoni-ipl_625x300_07_October_21.jpg'
  }
 

ngOnInit() {

}
  
}


