/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Campeonato {
    private String nombreCompleto;
    private equipo[] equipos;

    Campeonato(String campeonato_Unifranz, equipo[] equipos) {
        this.nombreCompleto = campeonato_Unifranz;
        this.equipos = equipos;
        
    }

   

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the equipos
     */
    public equipo[] getEquipos() {
        return equipos;
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipos(equipo[] equipos) {
        this.equipos = equipos;
    }
    public void ImprimirCampeonato()
    {
        System.out.print(nombreCompleto);
        System.out.print(equipos);
        for(int i=0;i<this.equipos.length; i++)
        {
            this.equipos[i].ImprimirEquipo();
        }
        
    }
    
}
