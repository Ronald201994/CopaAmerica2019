import { Http, Response } from '@angular/http';
import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { PaisEquipo } from './paisEquipo';

@Injectable()
export class PaisEquipoServicio {
    private _getAllSelecciones: string = 'http://localhost:8081/API_CopaAmerica2019/get/listarSelecciones'
    paisEquipo: PaisEquipo = null;

    constructor(private _http: Http){
    }

    GetSelecciones() : Observable<PaisEquipo[]>{
        return this._http.get(this._getAllSelecciones)
        .pipe(map((response: Response) => <PaisEquipo[]> response.json()),
            catchError(error => {
                return throwError("Error: Error en el servidor...");
            })
        )
    }
}