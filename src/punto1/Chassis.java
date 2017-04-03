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
public class Chassis {
    private String numSerie;

    public Chassis(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    @Override
    public String toString() {
        return "Chassis{" + "numSerie=" + numSerie + '}';
    }
    
}
