/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda[] rueda = new Rueda[4];
        rueda[0]  = new Rueda("michelin");
        rueda[1]  = new Rueda("michelin");
        rueda[2] = new Rueda("michelin");
        rueda[3]  = new Rueda("michelin");
        
        Motor motor = new Motor("2546bv");
        Carro c1 = new Carro("BMW", rueda, motor);
        Carro c2 = new Carro("BMW", rueda, motor);
        ArrayList<Carro> cc = new ArrayList<>();
        cc.add(c1);
        cc.add(c2);
        Persona p1 = new Persona("natalia_la_mamona", cc);
        p1.Listar();
   
    
    
    
    }

}
