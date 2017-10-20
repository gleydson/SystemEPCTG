import { Component } from '@angular/core';

import { AuthenticationService } from '../authentication/authentication.service';
import { Administrator } from './../administrator/administrator';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  private username:string = "";
  private password:string = "";

  public constructor(private authenticationService : AuthenticationService) { }
  
  public login() {
      this.authenticationService.login(new Administrator(this.username, this.password))
      .subscribe(
        error => {
          if (error) console.log(error);
        }
      );
  }

  public logout() {
      this.authenticationService.logout();
  }

}