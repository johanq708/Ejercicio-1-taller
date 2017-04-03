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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona("juan");
        Rueda r1[]=new Rueda[4];
        for(int i=0;i<4;i++){
            r1[i]=new Rueda(13,"bridgestone");
        }
        Motor m1=new Motor(1300,200);
        Rueda r2[]=new Rueda[4];
        for(int i=0;i<4;i++){
            r2[i]=new Rueda(16,"goodyear");
        }
        Motor m2=new Motor(2000,500);
        Carro c1=new Carro("aveo",r1,m1);
        Carro c2=new Carro("explorer",r2,m2);
        c1.crearchasis(500, "azul");
        c2.crearchasis(1000, "negro");
        p1.adcionarcarros(c1);
        p1.adcionarcarros(c2);
        System.out.println(p1);
        p1.mostrarcarros();
    }
    
}
