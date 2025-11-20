/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class objDetReserva {
    
    int idEnc; int idHab;
    LocalDate ingreso;
    Date egreso;
    double costo;

    public objDetReserva() {
    }

    public objDetReserva(int idEnc, int idHab, LocalDate ingreso, Date egreso, double costo) {
        this.idEnc = idEnc;
        this.idHab = idHab;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.costo = costo;
    }

    public int getIdEnc() {
        return idEnc;
    }

    public int getIdHab() {
        return idHab;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public double getCosto() {
        return costo;
    }

    public void setIdEnc(int idEnc) {
        this.idEnc = idEnc;
    }

    public void setIdHab(int idHab) {
        this.idHab = idHab;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
