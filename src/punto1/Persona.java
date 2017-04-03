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
public class Persona {
    private String nombre;
    private ArrayList<Carro> carros;

    public Persona(String nombre, ArrayList<Carro> carros) {
        this.nombre = nombre;
        this.carros = carros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public void Listar(){
        for (Carro carro : carros) {
            System.out.println(carro);
        }
   }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", carros=" + carros + '}';
    }

   
}
