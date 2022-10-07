/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.ejemplouml;

/**
 *
 * @author usuario
 */
public class Llanta {
    private int presion;
    
    public Llanta(){
        this.presion = 0;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }
    
    
    public int inflar(int cant){
        System.out.println("Llanta se esta inflando con +"+cant);
        this.setPresion(this.getPresion() + cant);
        return this.getPresion();
    }
}