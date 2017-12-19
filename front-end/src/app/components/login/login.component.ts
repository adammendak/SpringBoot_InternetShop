import { Component, OnInit } from '@angular/core';
import { LoginService} from '../../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private credential = {
    'username' : '',
    'password' : ''
  };

  private loggedIn = false;

  constructor(private loginService: LoginService) { }

  onSubmit() {
    this.loginService.sendCredentials(this.credential.username, this.credential.password).subscribe();
    res => {
      console.log(res);
      localStorage.setItem('xAuthToken', res.json().token);
      this.loggedIn = true;
      location.reload();
    }, err => {
      console.log(err);
    };
  }

  ngOnInit() { }

}
