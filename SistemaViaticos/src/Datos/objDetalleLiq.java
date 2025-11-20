/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDateTime;

/**
 *
 * @author sebas
 */
public class objDetalleLiq {
    
    String idEmp; String nombreEmp;
    String justificacion; String viatico;
    String observa;

    public objDetalleLiq() {
    }

    public objDetalleLiq(String idEmp, String nombreEmp, String justificacion, String viatico, String observa) {
        this.idEmp = idEmp;
        this.nombreEmp = nombreEmp;
        this.justificacion = justificacion;
        this.viatico = viatico;
        this.observa = observa;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public String getViatico() {
        return viatico;
    }

    public String getObserva() {
        return observa;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public void setViatico(String viatico) {
        this.viatico = viatico;
    }

    public void setObserva(String observa) {
        this.observa = observa;
    }
    
    

    
    
    
}
