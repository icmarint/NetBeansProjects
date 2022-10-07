/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.ejemplouml;

/**
 *
 * @author usuario
 */
public class Avion extends Vehiculo{
    
    private double altitud;
    private Aeropuerto aeropuerto;

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
    
    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    
    
    public double ascender(){
        System.out.println("Altitud ascender + 0.5");
        this.setAltitud(this.getAltitud() + 0.5);
        return this.getAltitud();
    }
    
    public double descender(){

        if(this.getAltitud() > 0){
            if(this.getAltitud() - 0.5 < 0){
                this.setAltitud(0);
            }else{
                this.setAltitud(this.getAltitud()-0.5);
            }
        }
        return this.getAltitud();
    }
    
    @Override
    public float acelerar(float aceleracion){
        System.out.println("Esta acelerando el avion");
        System.out.println("Con las alas acelero mas rapido");
        return this.getVelocidad();
    }

    @Override
    public void llenarTanque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}