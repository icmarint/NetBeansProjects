/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udea.ejemplouml;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejemplouml {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ArrayList<Llanta> llantas = new ArrayList(); 
        
        llantas.add(new Llanta());
        llantas.add(new Llanta());
        llantas.add(new Llanta());
        llantas.add(new Llanta());
        
        Carro carro_1 = new Carro("ABCD12345","MazdaUdea2022",false,llantas,"1234");
        
        System.out.println(carro_1.getMatricula());
        System.out.println(carro_1.getMatricula().getCarro());
        System.out.println(carro_1.getMatricula().getCarro().getModelo());
        System.out.println(carro_1.getMatricula().getCarro().getPlaca());
        System.out.println(carro_1);
        
        //carro_1 = new avion()
        
        Avion avion_1 = new Avion();
       
        Vehiculo carro_2 = new Carro("ABCD123","MazdaUdea2022",false,llantas,"34512");
        
        //carro_2.llenarTanque();
        
        Vehiculo avion_2 = new Avion();
        
        System.out.println("Velocidad= "+carro_2.getVelocidad());
        
        carro_2.acelerar(1);
        
        System.out.println("Velocidad= "+carro_2.getVelocidad());
        avion_2.acelerar(50);
        avion_2.equals(args);
        
        System.out.println("Velocidad avion= "+avion_2.getVelocidad());
        
        
        
        ArrayList<String> nombres = new ArrayList<String>();
        
        nombres.add("Paula");
        nombres.add("Alejandro");
        nombres.add("Andres");
        nombres.add("Angie");
        nombres.add("Alexander");
        nombres.add("Biviana");
        
        ArrayList<String> nombres_2 = new ArrayList<String>();
        
        nombres.add("Paula");
        nombres.add("Alejandro");
        nombres.add("Andres");
        nombres.add("Angie");
        nombres.add("Alexander");
        nombres.add("Biviana");
        
        
        System.out.println(nombres.size());
        
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(1));
        
        
        for(int i = 0; i < nombres.size(); i++){
            for(int j = 0; j < nombres_2.size(); j++){
                System.out.println(nombres.get(i).equals(nombres_2.get(j)));
            }
        }
        
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
        nombres.add(0, "Braya0,n");
        System.out.println(nombres.get(0));
        
        String nombre_1 = "Paula";
        
        Scanner entrada = new Scanner(System.in);
        String nombre_2 = entrada.next();
        
        System.out.println(nombre_1 == nombre_2);
        System.out.print(nombre_1.equals(nombre_2));
        
//Vehiculo vehiculo_1 = new Vehiculo();
    }
}