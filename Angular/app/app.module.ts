import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponent } from './MyComponents';
import { ForEachComponent } from './for-each/for-each.component';

import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,MyComponent, ForEachComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
