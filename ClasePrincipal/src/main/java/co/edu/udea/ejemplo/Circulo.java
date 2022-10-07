/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.ejemplo;

/**
 *
 * @author icmar
 */
public class Circulo {
    private double radio;
    public Circulo(){
        this.radio = 0.0;
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return this.radio;
    }
    public void setRadio(double radio){
        if(radio >= 0){
            this.radio = radio;
        }
    }
    public double area(){
        return Math.PI * radio * radio;
    }
}
