import { BrowserModule } from '@angular/platform-browser';
import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavBarComponent } from './navBar/navBar.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { UsuarioServicios } from './usuario/servicio.usuario';
import { MatDatepickerModule} from '@angular/material/datepicker';
import { LoginService } from './login/login.service';
import { MatTabsModule } from '@angular/material/tabs';
import { ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

//Animations
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MaterialModule } from './material.component';''
import {RouterModule } from '@angular/router';
import { MDBBootstrapModule } from 'angular-bootstrap-md'

//Http
import { HttpModule } from '@angular/http'; 
import { MatNativeDateModule } from '@angular/material';
import { Usuario } from './login/usuario';
import { BuscarJugadorByNombreAndPaisComponent } from './jugador/buscarJugadorByNombreAndPais.component';
import { ObtenerSeleccionesComponent } from './paisEquipo/obtenerSelecciones.component';
import { PaisEquipoServicio } from './paisEquipo/paisEquipo.serivicio';
import { PaisEquipo } from './paisEquipo/paisEquipo';

@NgModule({
  declarations: [
    AppComponent, 
    HomeComponent,
    LoginComponent,
    NavBarComponent,
    BuscarJugadorByNombreAndPaisComponent,
    ObtenerSeleccionesComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    NgbModule.forRoot(),
    MDBBootstrapModule.forRoot(),
    MatTabsModule,
    BrowserAnimationsModule,
    MaterialModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'appComponent', component: AppComponent},
      {path: 'menu', component: NavBarComponent},
      {path: 'home', component: HomeComponent},
      {path: 'login', component: LoginComponent}, 
      {path: 'obtenerSelecciones', component: ObtenerSeleccionesComponent}, 
      {path: 'buscarJugadorByNombreAndPais', component: BuscarJugadorByNombreAndPaisComponent } 
      //{path: 'buscarHabitacion', component: BuscarHabitacionByPrecioComponent}
    ])
  ],
  schemas: [NO_ERRORS_SCHEMA], 
   
  providers: [
    LoginService,
    PaisEquipoServicio,
    UsuarioServicios,
    PaisEquipo,
    Usuario,
  ],
  bootstrap: [AppComponent] 
})
export class AppModule { }
