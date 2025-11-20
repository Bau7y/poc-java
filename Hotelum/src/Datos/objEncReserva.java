/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author sebas
 */
public class objEncReserva {
    
    int consecutivo; int estado;
    String cedula; String detalles;

    public objEncReserva() {
    }

    public objEncReserva(int consecutivo, int estado, String cedula, String detalles) {
        this.consecutivo = consecutivo;
        this.estado = estado;
        this.cedula = cedula; //cedula cliente
        this.detalles = detalles;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public int getEstado() {
        return estado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
    
}
