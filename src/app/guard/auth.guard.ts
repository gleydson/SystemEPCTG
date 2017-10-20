import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';

import { AuthenticationService } from '../authentication/authentication.service';

@Injectable()
export class AuthGuard implements CanActivate {

  public constructor(
      private authenticationService:AuthenticationService,
      private router:Router
  ) { }

  public canActivate(route:ActivatedRouteSnapshot, state:RouterStateSnapshot):Observable<boolean> | boolean {
      if(this.authenticationService.isAuthenticated())
          return true;
      this.router.navigate(['/login']);
      return false;
  }

}