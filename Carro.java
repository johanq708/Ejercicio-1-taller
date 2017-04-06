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
public class Carro {
    private String linea;
    private Rueda[] ruedas;
    private Motor motor;
    private Chasis chasis;

    public Carro(String linea, Rueda[] ruedas, Motor motor) {
        this.linea = linea;
        this.ruedas = ruedas;
        this.motor = motor;
        this.chasis = new Chasis();
    }
    
    public void crearchasis(int t,String c){
        chasis.setColor(c);
        chasis.setTamaño(t);
    }

    @Override
    public String toString() {
       return "Carro es: " + linea + ", su motor es " + motor.toString() + ", su chasis es" + chasis.toString() + " y sus ruedas son" + ruedas[0].toString();
    }
    
}
