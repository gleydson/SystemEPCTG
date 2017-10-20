import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

import { Administrator } from './../administrator/administrator';

@Injectable()
export class AuthenticationService {

    private static adminAuthStatus:boolean = false;

    public constructor (
        private http: Http,
        private router: Router
    ) { }

    public login(admin : Administrator) {  
        return this.http.post('http://localhost:8080/login', admin, this.options())
        .map((response : Response) => {
            if (response.status == 200) {
                AuthenticationService.adminAuthStatus = true;
                this.setLocalToken(response.headers.get("authorization"));
                this.router.navigate(['/home']);
            }
        })
        .catch((error : Response) => Observable.throw(error));
    }

    public options() {
        let headers = new Headers({'Content-Type' : 'application/json'});
        return new RequestOptions({ headers: headers });
    }

    public logout() {
        AuthenticationService.adminAuthStatus = false;
        this.removerLocalToken();
        this.router.navigate(['/login']);
    }

    public isAuthenticated() : Boolean {
        return AuthenticationService.adminAuthStatus;
    }

    public setLocalToken(token) : void {
        localStorage.setItem('token', JSON.stringify(token));
    }

    public getLocalToken() : string {
        return localStorage.getItem('token');
    }

    public removerLocalToken() : void {
        localStorage.removeItem('token');
    }

    public header() : RequestOptions {
        let headers = new Headers({
            'Authorization'               : this.getLocalToken(),
            'Content-Type'                : 'application/json'
        });
        return new RequestOptions({ headers: headers });
    }

}
