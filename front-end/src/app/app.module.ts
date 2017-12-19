import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { LoginComponent } from './components/login/login.component';
import { LoginService} from './services/login.service';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    HttpModule,
    FormsModule,
    NavBarComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
