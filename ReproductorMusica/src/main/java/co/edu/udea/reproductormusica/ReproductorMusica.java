/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udea.reproductormusica;

/**
 *
 * @author icmar
 */

public class ReproductorMusica {
//Estos son los atributos
    private String [] canciones;
    private int [] cancionesFavoritas;
    private int cancionReproduciendo;
    private boolean pausado;
    
    //Estos son los metodos
    public ReproductorMusica(String[] canciones){
        this.canciones = canciones;
        this.cancionesFavoritas = new int[canciones.length];
        for(int i = 0;i < canciones.length; i++){
            this.cancionesFavoritas[i] = -1;
        }
        this.pausado = true;
        this.cancionReproduciendo = 0;
    }
    public void proximaCancion(){
        if (this.cancionReproduciendo >= 0 && this.cancionReproduciendo < (this.canciones.length -1)){
            this.cancionReproduciendo = this.cancionReproduciendo + 1;
        } else if (this.cancionReproduciendo >= this.canciones.length -1){
            this.cancionReproduciendo = (this.cancionReproduciendo + 1)% this.canciones.length;
        }
    }
    
    public void devolverCancion(){
        if (this.cancionReproduciendo == 0){
            this.cancionReproduciendo = (this.cancionReproduciendo + this.canciones.length -1)% this.canciones.length;
            
        } else {
            this.cancionReproduciendo = this.cancionReproduciendo -1;
        }
    }
    public void cambiarEstadoReproduciendo(){
        this.pausado = !this.pausado;
    }
    
    public void agregarCancionesFavoritas(){
        for (int i = 0; i < CancionesFavoritas.length; i++) {
            if (cancionesFavoritas[i] == cancionReproduciendo)
                return;
            else if (cancionesFavoritas[i]== -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }
        }
            
    }
    public String[] getCanciones(){
        return canciones;
    }
    public void setCanciones(String[] canciones){
        this.canciones = canciones;
    }
    public int[] getCancionesFavoritas(){
        return cancionesFavoritas;
    }
    public void setCancionesFavotitas(int[] cancionesFavoritas){
        this.cancionesFavoritas = cancionesFavoritas,
    }
    public boolean  isPausado(){
        return pausado;
    }
    public void setPausado(boolean pausado){
        this.pausado = pausado;
    }
    public int getCancionReproduciendo(){
        return cancionReproduciendo;
    }
    public void setCancionReproduciendo(int cancionReproduciendo){
        this.cancionReproduciendo = this.cancionReproduciendo;
    }
}


