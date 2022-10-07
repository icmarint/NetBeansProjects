/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.reto1;

/**
 *
 * @author icmar
 */
public class SolucionReto1 {
    
    public static void main(String[] args){
    
    Double[] ListaNotas = {4.5, 5.0, 4.9, 3.0, 2.0};
    reporte(ListaNotas);
        
    }
    
    public static Double[] reporte(Double[] ListaNotas){
        Double[] resultados = new Double[3];
        
        Double valorMaximo;
        Double valorMinimo;
        Double suma;
        
        valorMaximo = Double.MIN_VALUE;
        valorMinimo = Double.MAX_VALUE;
        suma = 0.0;
        
        System.out.println("Máximos de mi solución del Reto 1 usando for each y Math");
        
        for(Double numero:ListaNotas){
            valorMaximo = Math.max(valorMaximo, numero);
            valorMinimo = Math.min(valorMinimo, numero);
            suma += numero;
        }
        
        resultados[0] = suma/ListaNotas.length;
        resultados[1] = valorMaximo;
        resultados[2] = valorMinimo;
        
        System.out.println(resultados[0]);
        System.out.println(resultados[1]);
        System.out.println(resultados[2]);
        
        return resultados;
    }
}
