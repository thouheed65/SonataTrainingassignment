import { Directive, ElementRef,Input,OnInit } from "@angular/core";


@Directive({
selector:'[color]'
})
export class CustomDirective implements OnInit{
    @Input() color! :string ;
    constructor(private e1:ElementRef){

    }
   
    ngnOnInit() {
        this.e1.nativeElement.style.backgroundcolor = this.color;
    }
}

