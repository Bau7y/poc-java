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
    
    int idUsuario; int estado; int rol;
    String identificacion; String nombreCompleto; 
    String nombreUsr; String clave;
    

    public objUsuario() {
    }

    public objUsuario(int idUsuario, int estado, String identificacion, String nombreCompleto, String nombreUsr, String clave, int rol) {
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.nombreUsr = nombreUsr;
        this.clave = clave;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getEstado() {
        return estado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNombreUsr() {
        return nombreUsr;
    }

    public String getClave() {
        return clave;
    }

    public int getRol() {
        return rol;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
    
}
