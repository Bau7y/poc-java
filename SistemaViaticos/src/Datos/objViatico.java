/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author sebas
 */
public class objViatico {
    
    int idViatico; 
    String nomViatico;
    int monto;
    int estado;
    int horaSalida, horaLlegada;

    public objViatico() {
    }

    public objViatico(int idViatico, String nomViatico, int monto, int estado, int horaLlegada, int horaSalida) {
        this.idViatico = idViatico;
        this.nomViatico = nomViatico;
        this.monto = monto;
        this.estado = estado;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }


    public int getIdViatico() {
        return idViatico;
    }

    public String getNomViatico() {
        return nomViatico;
    }

    public int getMonto() {
        return monto;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdViatico(int idViatico) {
        this.idViatico = idViatico;
    }

    public void setNomViatico(String nomViatico) {
        this.nomViatico = nomViatico;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
    
    
    
    
}
