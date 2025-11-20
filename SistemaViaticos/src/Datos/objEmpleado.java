/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author sebas
 */
public class objEmpleado {
    
    String idEmpleado; int cedulaEmp;
    int numTelefonico; int estado;
    String nombreEmp; String apellido1Emp;
    String apellido2Emp; String direccion;

    public objEmpleado() {
    }

    public objEmpleado(String idEmpleado, int cedulaEmp, int numTelefonico, int estado, String nombreEmp, String apellido1Emp, String apellido2Emp, String direccion) {
        this.idEmpleado = idEmpleado;
        this.cedulaEmp = cedulaEmp;
        this.numTelefonico = numTelefonico;
        this.estado = estado;
        this.nombreEmp = nombreEmp;
        this.apellido1Emp = apellido1Emp;
        this.apellido2Emp = apellido2Emp;
        this.direccion = direccion;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public int getCedulaEmp() {
        return cedulaEmp;
    }

    public int getNumTelefonico() {
        return numTelefonico;
    }

    public int getEstado() {
        return estado;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String getApellido1Emp() {
        return apellido1Emp;
    }

    public String getApellido2Emp() {
        return apellido2Emp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setCedulaEmp(int cedulaEmp) {
        this.cedulaEmp = cedulaEmp;
    }

    public void setNumTelefonico(int numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public void setApellido1Emp(String apellido1Emp) {
        this.apellido1Emp = apellido1Emp;
    }

    public void setApellido2Emp(String apellido2Emp) {
        this.apellido2Emp = apellido2Emp;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
