/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Persona {
    private ArrayList<Carro> carros;
    private String nombre;

    public Persona(String nombre) {
        this.carros = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public void adcionarcarros(Carro c){
        this.carros.add(c);
    }
    public void mostrarcarros(){
        for(int i=0;i<carros.size();i++){
            System.out.println(carros.get(i));
        }
     }

    @Override
    public String toString() {
        return nombre + " tiene " + this.carros.size() +" carros";
    }
    
}
