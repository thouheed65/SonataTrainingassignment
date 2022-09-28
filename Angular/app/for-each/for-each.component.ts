import { Component, OnInit } from '@angular/core';
import { hero } from '../hero';
@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {
heroes = ['Vijay', 'Ajith','Salman', 'Shahrukh'];



  constructor() { }
  
  data = [

    new hero(123 , "ABC"),

    new hero(456 , "DEF")

  ];

  ngOnInit(): void {
  }

}
