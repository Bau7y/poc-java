/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class objLiquidacion {
    
    String estado;
    String empleadoId;
    int horaLLegada, horaSalida;
    int montoAsignado;
    String fechaConsumo;
    

    public objLiquidacion() {
    }

    public objLiquidacion(String estado, String empleadoId, int horaLLegada, int horaSalida, int montoAsignado, String fechaConsumo) {
        this.estado = estado;
        this.empleadoId = empleadoId;
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.montoAsignado = montoAsignado;
        this.fechaConsumo = fechaConsumo;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmpleadoId() {
        return empleadoId;
    }

    public int getHoraLLegada() {
        return horaLLegada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public int getMontoAsignado() {
        return montoAsignado;
    }

    public String getFechaConsumo() {
        return fechaConsumo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEmpleadoId(String empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void setHoraLLegada(int horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setMontoAsignado(int montoAsignado) {
        this.montoAsignado = montoAsignado;
    }

    public void setFechaConsumo(String fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }
    
    
    
    

    
    

    
}
