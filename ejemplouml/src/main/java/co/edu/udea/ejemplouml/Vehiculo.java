/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.ejemplouml;

/**
 *
 * @author usuario
 */
public abstract class Vehiculo {
    
    protected float velocidad;

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    /**
     * 
     * @param aceleracion
     * @return 
     */
    public float acelerar(float aceleracion){
        System.out.println("Voy acelerar en +"+aceleracion);
        this.setVelocidad(this.getVelocidad() + aceleracion);
        return this.getVelocidad();
    }
    
    /**
     * Sirve para disminuir el valor de la velocidad
     * @param freno cantidad de disminución
     * @return nueva velocidad
     */
    public float frenar(float freno){
        if(this.getVelocidad() > 0){
            if(this.getVelocidad() - freno < 0){
                this.setVelocidad(0);
            }else{
                this.setVelocidad(this.getVelocidad() - freno);
            }
        }
        return this.getVelocidad();
    }
    
    public abstract void llenarTanque();
    
}