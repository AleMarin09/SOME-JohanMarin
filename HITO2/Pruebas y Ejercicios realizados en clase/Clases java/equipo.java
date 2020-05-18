/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

public class equipo {
    private String nombreEquipo;
    private String categoria;
    private Jugador[] jugadores;

    equipo(String equipo_TT, String varones, Jugador[] jugadoresEquipo1) {
        this.nombreEquipo = equipo_TT;
        this.categoria = varones;
        this.jugadores = jugadoresEquipo1;
        
    }
    

    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the jugadores
     */
    public Jugador[] getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    public void ImprimirEquipo()
    {
        System.out.print(this.nombreEquipo);
        System.out.print(this.categoria);
        
       for(int i=0;i<this.jugadores.length; i++)
        {
            this.jugadores[i].ImprimirJugador();
    }
    }
}
    
    

