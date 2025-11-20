/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;
import Presentacion.frmLogin;
import Datos.estructuras;

/**
 *
 * @author sebas
 */

public class Hotelum {
    static estructuras estr = new estructuras();
    
    public static void main(String[] args) {
        //crear y mostrar ventanas (JframeForm)
        estr.preCargaUsuarios();
        estr.preCargaCliente();
        estr.preCargaHab();
        frmLogin lgn = new frmLogin();
        lgn.setLocationRelativeTo(null);
        lgn.setVisible(true);
    }
    
}
