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
public class Carro {

    private String marca;
    private Rueda[] ruedas;
    private Chassis chassis;
    private Motor motor;

    public Carro(String marca, Rueda[] ruedas, Motor motor) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.chassis = new Chassis("fch24d");
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void Configuracion() {
        System.out.println();
    }

    @Override
    public String toString() {
        String imprimir = "Carro{" + "marca=" + marca + ", ruedas=";
        for (Rueda rueda : ruedas) {
            imprimir+=rueda.toString();
        }
        imprimir+=", chassis=" + chassis + ", motor=" + motor + '}';
        return imprimir;
    }

   }
