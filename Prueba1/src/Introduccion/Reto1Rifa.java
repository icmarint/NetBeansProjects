package Introduccion;

import java.util.Scanner;

public class Reto1Rifa {
    public static void main(String[] args){
        int limiteInferior = 0;
        int limiteSuperior = 20;
        int numeroGanador = 12;
        int numeroJugador; //Declaro variable y la inicializo
        int numeroIntentos = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entre" + limiteInferior + " y " +limiteSuperior);
        numeroJugador = sc.nextInt();

        System.out.println(numeroJugador);
        
        //Verificar que el número está dentro del intervalo de la rifa
        if(numeroJugador > limiteInferior && numeroJugador < limiteSuperior){
                System.out.println("El numero está dentro del intervalo");
                if(numeroJugador > numeroGanador){
                    System.out.println("Te pasaste!");
                }
                else if (numeroJugador == numeroGanador){
                    System.out.println("Ganaste!");
                }
                numeroIntentos++;
        }
        else {
                System.out.println("EL número está fuera del intervalo");
        }
    }
}
