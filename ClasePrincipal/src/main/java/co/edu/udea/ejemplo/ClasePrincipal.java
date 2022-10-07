/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udea.ejemplo;

/**
 *
 * @author icmar
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Circulo miCirculo;
        Circulo otroCirculo;
        //Circulo nuevoCirculo;
        
        miCirculo = new Circulo();
        otroCirculo = new Circulo(10.8);
        //nuevoCirculo new Circulo();
        
        //nuevoCirculo.setRadio(7.8);
        
        System.out.println("Radio: " + miCirculo.getRadio());
        System.out.println("Área: " + miCirculo.area());
        System.out.println("Radio: " + otroCirculo.getRadio());
        System.out.println("Área: " + otroCirculo.area());
    }
}
