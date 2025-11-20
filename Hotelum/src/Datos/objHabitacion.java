/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos; //Paquete donde se encuentra la clase (Objeto)

/**
 *
 * @author sebas
 */
public class objHabitacion {
    //Atributos sin inicializar 
    
    int id; int categoria; int clase; int edificio; int piso; int estado; String detalles;
    
    public objHabitacion(){
        
    }
    
    public objHabitacion(int id, int categoria, int clase, int edificio, int piso, int estado, String detalles){
        this.id = id;
        this.categoria = categoria;
        this.clase = clase;
        this.edificio = edificio;
        this.piso = piso;
        this.estado = estado;
        this.detalles = detalles;
        
    }
    
    //metodos set y get

    public int getId() {
        return id;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getClase() {
        return clase;
    }

    public int getEdificio() {
        return edificio;
    }

    public int getPiso() {
        return piso;
    }

    public int getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: " + id + " edificio: " + edificio + " Piso: " + piso + " observaciones: " + detalles);
    }
    
    
    
}
