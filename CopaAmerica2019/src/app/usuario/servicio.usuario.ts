import { Http, Response } from '@angular/http';
import { Injectable } from '@angular/core';
import { Usuario } from './usuario';
import { Observable, of, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';

@Injectable()
export class UsuarioServicios {

    private _registrarUsuarioURL : string = 'http://localhost:55349/api/usuario/agregarUsuario'

    constructor(private _http: Http) {
            
    }
    

    usuario: Usuario = null;


    ingreseUsuario (usuario: Usuario): Observable<Usuario> {
        var body ={
          dni: usuario.DNI,
          nombre: usuario.Nombre,
          ApellidoPat: usuario.ApellidoPaterno,
          apellidoMat: usuario.ApellidoMaterno,
          correo: usuario.Correo,
          contraseña: usuario.Password
        };
        var request = this._http.post(this._registrarUsuarioURL, body);

        return request.pipe(map((response: Response) => <Usuario> response.json()),
        catchError(error => {
            return throwError("Server Error");


        })
      )
    }
}