package com.mycompany.holamundo;

/**
 *
 * @author icmar
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int suma=10;
        System.out.println(suma);
        
        int n = -5;
        
        boolean ismayor = n >=1;
        boolean ismenor = n <=10;
        
        System.out.println("Es mayor que 1?: " + ismayor);
        System.out.println("Es menor que 10?: " + ismenor);
        
        boolean resultadoAnd = ismayor && ismenor;
        
        System.out.println("Esta en el rango del 1 al 10?: " + resultadoAnd);
        System.out.println("Esta en el rango del 1 al 10?: " + (n>=1 && n<=10));
        
        if (resultadoAnd){
            System.out.println("Estoy dentro del rango: " + n);
        }else{
            System.out.println("No estoy dentro del rango: " + n);
        }
        n = 0;
        while(n<=10){
            int multiplicacion = n*10;
            System.out.println("Multiplicación de "+ n +"x 10 = "+ multiplicacion);
            n = n + 1;
        }
    }
}
