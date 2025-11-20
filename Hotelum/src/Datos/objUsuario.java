/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author sebas
 */
public class objUsuario {
    
    int id; int estado;
    String nombreComple; String nombreUsua; String clave;
    
    public objUsuario(){
    }
    
    public objUsuario(int id, String nombreComple, String nombreUsua, String clave, int estado){
        
        this.id = id;
        this.nombreComple = nombreComple;
        this.nombreUsua = nombreUsua;
        this.clave = clave;
        this.estado = estado;
        
    }

    public int getId() {
        return id;
    }

    public String getNombreComple() {
        return nombreComple;
    }

    public String getNombreUsua() {
        return nombreUsua;
    }

    public String getClave() {
        return clave;
    }
    
    public int getEstado(){
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreComple(String nombreComple) {
        this.nombreComple = nombreComple;
    }

    public void setNombreUsua(String nombreUsua) {
        this.nombreUsua = nombreUsua;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    
    
    
    
}
