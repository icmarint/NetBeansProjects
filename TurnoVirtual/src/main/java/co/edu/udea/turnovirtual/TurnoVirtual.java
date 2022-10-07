/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udea.turnovirtual;

/**
 *
 * @author icmar
 */

//import java.util.ArrayList;

public class TurnoVirtual {
    
    //ESTA CLASE NO TIENE MAIN
    
    //INSERTE LOS ATRIBUTOS
    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;
    
    //INSERTE EL MÉTODO CONSTRUCTOR

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (null == (turnosPerdidos[i])) {
                turnosPerdidos[i] = " ";
            }
        }
    }
    
    
    //INSERTE LOS GETTERS Y SETTERS
    public String[] getTurnos(){
        return turnos;
    };

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    
    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }
    
    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    //INSERTE LOS DEMÁS MÉTODOS
    public void atenderProximoTurno(){
        if(this.estadoTurnoVirtual == true){
            this.setTurnoEnAtencion(this.getTurnoEnAtencion()+1);
            this.setCantidadTurnosAtendidos(this.getCantidadTurnosAtendidos()+1);
        }
    };

    public void cambiarEstadoTurno(){
        if(this.estadoTurnoVirtual == true){
            this.setEstadoTurnoVirtual(false);
        }else{
            this.setEstadoTurnoVirtual(true);
        }
    };

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }
}