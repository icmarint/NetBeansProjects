/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udea.reto1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//Para importar todo: import java.util.*;
/**
 *
 * @author icmar
 */
public class Reto1 {

    public static void main(String[] args) {
        int edad;
        int miArray[]; //Declarar un array, sintaxis similar  a variables
        int miArray2[] = new int[5]; //Declarar e instanciar un array, tamaño 5
        Integer[] miArray3 = {5, 6, 8, 9, 4, 2, 7, 8};
        
        ArrayList<Integer> miArrayDinamico = new ArrayList<Integer>();
        miArrayDinamico.add(15);
        miArrayDinamico.add(10);
        miArrayDinamico.add(8);
        
        for(int valor:miArrayDinamico){
            System.out.println(valor);
        }
        
        System.out.println("-----");
        
        for(int valor:miArray3){
            System.out.println(valor);
        }
        
        int valorMaximo;
        int valorMinimo;
        
        //Valor máximo con Collections
        
        valorMaximo = Collections.max(Arrays.asList(miArray3));
        valorMinimo = Collections.min(Arrays.asList(miArray3));
        
        System.out.println("Valor maximo: " + valorMaximo);
        System.out.println("Valor minimo: " + valorMinimo);
        
        //Valor máximo con for y Math
        
        valorMaximo = 0;
        valorMinimo = 99999;
        
        System.out.println("Máximos usando for each y Math");
        for(int numero:miArrayDinamico){
            valorMaximo = Math.max(valorMaximo, numero);
            valorMinimo = Math.min(valorMinimo, numero);
        }
        System.out.println(valorMaximo);
        System.out.println(valorMinimo);
        
        //Valor máximo con for y condicionales
        
        valorMaximo = Integer.MIN_VALUE;
        valorMinimo = Integer.MAX_VALUE;
        
        System.out.println("Máximos usando for each y Condicionales");
        for(int i=0; i < miArray3.length; i++){
            if(miArray3[i] < valorMinimo){
                valorMinimo = miArray3[i];
            }
            if(miArray3[i] > valorMaximo){
                valorMaximo = miArray3[i];
            }
        }
        
        System.out.println(valorMaximo);
        System.out.println(valorMinimo);
        
    }
}
