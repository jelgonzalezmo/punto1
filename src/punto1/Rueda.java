/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

/**
 *
 * @author Estudiante
 */
public class Rueda {
    private String marca;
 

    public Rueda(String marca) {
        this.marca = marca;
     
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + '}';
    }

        
    }

   

    

