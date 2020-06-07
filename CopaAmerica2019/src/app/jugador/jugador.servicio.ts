import { Http, Response } from '@angular/http';
import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';

@Injectable()
export class UsuarioServicios {
    private _getAllSelecciones: string = 'http://localhost:8081/API_CopaAmerica2019/get/listarSelecciones'

    constructor(private _http: Http){

    }

    


}