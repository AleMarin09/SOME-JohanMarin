/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String []args)
    {
        
        Jugador jugador1= new Jugador("nombre1 ", "apellidos1 ","ci1 ",20);
        Jugador jugador2= new Jugador("nombre2 ", "apellidos2 ","ci1 ",20);
        Jugador jugador3= new Jugador("nombre3 ", "apellidos3 ","ci1 ",20);
        
        Jugador[] jugadoresEquipo1 = new Jugador[3];
        jugadoresEquipo1[0]=jugador1;
        jugadoresEquipo1[1]=jugador2;
        jugadoresEquipo1[2]=jugador3;
        
        equipo equipo1 = new equipo("Equipo TT", "Varones", jugadoresEquipo1);
        
        equipo[] equipos = new equipo[1];
        equipos[0]= equipo1;
        
        Campeonato camp = new Campeonato ("Campeonato Unifranz ", equipos);
        camp.ImprimirCampeonato();
        
        
        
        
    }
}
