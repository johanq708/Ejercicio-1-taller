/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class Motor {
    private int cilindraje;
    private int caballos;

    public Motor(int cilindraje, int caballos) {
        this.cilindraje = cilindraje;
        this.caballos = caballos;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return " de cilindraje: " + cilindraje + " y de caballos: " + caballos;
    }
    
}
