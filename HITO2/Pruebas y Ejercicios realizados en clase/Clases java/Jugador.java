/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Jugador {
    private String nombreCom;
    private String apellido;
    private String ci;
    private int edad;

    Jugador(String nombre1, String apellidos1, String ci1, int i) {
        this.nombreCom = nombre1; //To change body of generated methods, choose Tools | Templates.
        this.apellido = apellidos1;
        this.ci = ci1;
        this.edad=i;
        
    }

    /**
     * @return the nombreCom
     */
    public String getNombreCom() {
        return nombreCom;
    }

    /**
     * @param nombreCom the nombreCom to set
     */
    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void ImprimirJugador()
    {
        
        System.out.print(nombreCom);
        System.out.print(apellido);
        System.out.print(ci);
        System.out.print(edad);
        
    }
}
