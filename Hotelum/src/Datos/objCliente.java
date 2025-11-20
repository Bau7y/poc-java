/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author sebas
 */
public class objCliente {
    
    int id; String cedula; int telefono; int estado;
    String nombre; String apellido; String direccion;
    
    public objCliente(){
    }
    
    public objCliente(int id, String cedula, int telefono, String nombre, String apellido, String direccion, int estado){
        
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public int getEstado(){
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    
    
    
}
