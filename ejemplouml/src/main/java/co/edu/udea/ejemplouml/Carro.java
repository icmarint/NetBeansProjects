/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.ejemplouml;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Carro extends Vehiculo{
    
    private String placa;
    private String modelo;
    private boolean puerta;
    private ArrayList llantas;
    private Matricula matricula;
    

    public Carro(String placa, String modelo, boolean puerta, ArrayList llantas, String idMatricula) {
        this.placa = placa;
        this.modelo = modelo;
        this.puerta = puerta;
        this.llantas = llantas;
        this.matricula = new Matricula(idMatricula , this);
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    

    public ArrayList getLlantas() {
        return llantas;
    }

    public void setLlantas(ArrayList llantas) {
        this.llantas = llantas;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }
    
    public void bloquear(){
       if(this.velocidad == 0 ){
           this.puerta = true;
       }else{
           this.puerta = false;
       }
       
       this.puerta = this.velocidad == 0 ;
    }
    
    public void agregarLlanta(Llanta llanta){
        this.llantas.add(llanta);
    }

    @Override
    public void llenarTanque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", modelo=" + modelo + ", puerta=" + puerta + ", llantas=" + llantas + ", matricula=" + matricula + '}';
    }
    
    
}
