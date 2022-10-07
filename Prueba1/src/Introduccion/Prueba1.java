/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Introduccion;

/**
 *
 * @author icmar
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=1;
        double numero_decimal = 1.5;
        double suma = numero + numero_decimal;
        System.out.println(suma);
        
        float punto_flotante = 143.2f;
        String nombre = "";
        Boolean verificacion = true;
        
        if (numero > 0){
            System.out.println("Hola");
        }
        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }
        //Cuenta regresiva:
        int i = 9;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
        switch(numero){
            case 10:
                System.out.println("es diez");
            break;
            case 19:
                System.out.println("es 19");
            break;
            default:
                System.out.println("No sé qué numero es");
            break;
        }
        
    }
    
}
