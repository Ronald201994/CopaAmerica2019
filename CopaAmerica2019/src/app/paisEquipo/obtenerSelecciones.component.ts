import { Component, OnInit } from "@angular/core";
import { PaisEquipo } from "./paisEquipo";
import { PaisEquipoServicio } from "./paisEquipo.serivicio";
import { Router, ActivatedRoute } from "@angular/router";
import * as $ from 'jquery';

@Component({
    selector: 'app-obtener-selecciones',
    templateUrl: './obtenerSelecciones.component.html',
    styleUrls: ['./obtenerSelecciones.component.css']
})
 
export class ObtenerSeleccionesComponent implements OnInit{
    ngOnInit(): void {     
    }

    selecciones: PaisEquipo[];

    constructor(private _paisEquipoServicio: PaisEquipoServicio, private _router : Router, private route: ActivatedRoute){
        this._paisEquipoServicio.GetSelecciones()
        .subscribe(
            data => {this.selecciones = data;
                console.log(this.selecciones)
            },
            
        );
    }

    
}