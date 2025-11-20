/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Datos.estructuras;
import Presentacion.frmLogin;


/**
 *
 * @author sebas
 */
public class SistemaViaticos {

    /**
     * @param args the command line arguments
     */
    
    static estructuras datos = new estructuras();
            
    public static void main(String[] args) {
        datos.cargarUsuarios();
        frmLogin lgn = new frmLogin();
        lgn.setLocationRelativeTo(null);
        lgn.setVisible(true);
    }
    
}
