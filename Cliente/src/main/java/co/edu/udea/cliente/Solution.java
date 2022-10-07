/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udea.cliente;

/**
 *
 * @author icmar
 */
import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        
    /*ArrayList<Cliente> t3 = new ArrayList<>();
    
    t3.add(new Cliente("Valeria Di", "10367876345", 9653, "03/07/2022","0004"));
    t3.add(new Cliente("Johan Doe", "1037645345", 3918, "03/07/2022","0005"));
    t3.add(new Cliente("Maurice Doe", "98765234", 6048, "03/07/2022","0006"));
    t3.add(new Cliente("Mattew Doe", "1036789453", 5840, "03/07/2022","0007"));
    t3.add(new Cliente("Agustina Doe", "10003456", 3940, "03/07/2022","0008"));
    t3.add(new Cliente("Agustina Doe", "10003456", 3840, "03/07/2022","0009"));
    t3.add(new Cliente("Milena Doe", "20003456", 3696, "03/07/2022","0010"));
    t3.add(new Cliente("Carla Di", "103789762", 2432, "03/07/2022","0011"));
    */
    
    int total = 0;
    String cliMinPagado = "";
    int minPagado = Integer.MAX_VALUE;
    String cliMaxPagado = "";
    int maxPagado = Integer.MIN_VALUE;
    
    
    for(Cliente usuario : tienda){
        
    total += usuario.getTotalAPagar();
    
    if (minPagado > usuario.getTotalAPagar()){
        minPagado = usuario.getTotalAPagar();
        cliMinPagado = usuario.getNombreCompleto();
    }
    
    if (maxPagado < usuario.getTotalAPagar()){
        maxPagado = usuario.getTotalAPagar();
        cliMaxPagado = usuario.getNombreCompleto();
    }
      
    }
        
        double promedio = total/tienda.size();
            
        Object[] reportes = {promedio, cliMinPagado, minPagado, cliMaxPagado, maxPagado};
        return reportes;
    }
    
   
}
