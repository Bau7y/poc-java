/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;

/**
 *
 * @author sebas
 */
public class estructuras {
    
    //instancia de Archivos
    Archivos file = new Archivos();
    
    //def listas 
    static ArrayList<objHabitacion> listaHabitaciones = new ArrayList<>();
    static ArrayList<objCliente> listaClientes = new ArrayList<>();
    static ArrayList<objUsuario> listaUsuarios = new ArrayList<>();
    static String[] catsHabs = {"Estandar", "Premium", "Deluxe"};
    static String[] claseHabs = {"Sencilla", "Doble", "Triple", "Cuádruple"};
    static String[] edificios = {"Arenal", "Miravalles", "Poas", "Platanar"};
    
    
    //def vector
    int[] vector = new int[9];
    
    //def matriz
    String[][] matriz = new String[9][9];

    public estructuras() {
    }
    
    public void preCargaUsuarios(){
        objUsuario miUsuario = new objUsuario();
        miUsuario.setId(1);
        miUsuario.setNombreComple("SebasR");
        miUsuario.setClave("0708");
        miUsuario.setEstado(0);
        miUsuario.setNombreUsua("Rojas06");
        
        objUsuario miUsuario2 = new objUsuario();
        miUsuario.setId(1);
        miUsuario.setNombreComple("sebas");
        miUsuario.setClave("1111");
        miUsuario.setEstado(0);
        miUsuario.setNombreUsua("sebas1");
        
        this.agregarUsuario(miUsuario);
        this.agregarUsuario(miUsuario2);
    }
    
    public void preCargaCliente(){ listaClientes = file.leerArchivoCliente(); }
    
    public void preCargaHab(){ listaHabitaciones = file.leerArchivoHabitacion(); }
    
    public int compruebaLogin(String usuario, String clave){
        int resultado = 0;
        for (int i = 0; i < listaUsuarios.size(); i++){
           if ( usuario.equals(listaUsuarios.get(i).getNombreUsua()) && clave.equals(listaUsuarios.get(i).getClave())){
               resultado = 1;
               break;
           }
       }
        return resultado;
    }
    
    public void agregarHab( objHabitacion miHab ) {
        listaHabitaciones.add(miHab);
        file.escribirArchivoHabitacion();
    }
    
    public void borrarHab( int idxHab ) {
        listaHabitaciones.remove(idxHab);
        file.escribirArchivoHabitacion();
    }
    
    public void modHab (int idxHab, objHabitacion miNuevaHab) {
        listaHabitaciones.set(idxHab, miNuevaHab);
        file.escribirArchivoHabitacion();
    }
    
    public objHabitacion getHabitacion( int id ){
       //return listaHabitaciones.get(id);
       objHabitacion resultado = null;
       for (int i = 0; i < listaHabitaciones.size(); i++){
           if ( id == listaHabitaciones.get(i).getId() ){
               resultado = listaHabitaciones.get(i);
           }
       }
       return resultado;
    }
    
    public boolean buscarBorrar( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaHabitaciones.size(); i++){
           if ( id == listaHabitaciones.get(i).getId() ){
               this.borrarHab(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    
    public int getIndex( int id ){
       //return listaHabitaciones.get(id);
       int idx = -1;
       for (int i = 0; i < listaHabitaciones.size(); i++){
           if ( id == listaHabitaciones.get(i).getId() ){
               idx = i;
               break;
           }
       }
       return idx;
    }
    
    
    //cliente
    public void agregarCliente( objCliente cliente ) {
        listaClientes.add(cliente);
        file.escribirArchivoCliente();
    }
    
    public void borrarCliente( int idxClient ) {
        listaClientes.remove(idxClient);
        file.escribirArchivoCliente();
    }
    
    public void modCliente (int idxClient, objCliente miNuevoClient) {
        listaClientes.set(idxClient, miNuevoClient);
        file.escribirArchivoCliente();
    }
    
    //usuario
    public void agregarUsuario( objUsuario usuario ) {
        listaUsuarios.add(usuario);
    }
    
    public void borrarUsuario( int idxUsua ) {
        listaUsuarios.remove(idxUsua);
    }
    
    public void modUsuario (int idxUsua, objUsuario miNuevoUsuario) {
        listaUsuarios.set(idxUsua, miNuevoUsuario);
    }
    
    public objUsuario getUsuario ( int id ){
       //return listaHabitaciones.get(id);
       objUsuario usr = null;
       for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getId() ){
               usr = listaUsuarios.get(i);
           }
       }
       return usr;
    }
    
    public int getIndiceUsr( int id ){
        int resultado = -1;
        for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getId() ){
               resultado = i;
           }
        }
        return resultado;
    }
    
    public boolean buscarBorrarUsuario( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getId() ){
               this.borrarUsuario(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    public DefaultListModel listarUsuarios(){
        DefaultListModel miLista = new DefaultListModel();
        for ( int i = 0; i < listaUsuarios.size(); i++ ){
            miLista.add( i, listaUsuarios.get(i).getId() + " : " + listaUsuarios.get(i).getNombreComple() );
        }
        
        return miLista;
    }
    
    public String BuscarCliente( String cedCli ){
       String usr = "";
       for (int i = 0; i < listaClientes.size(); i++){
           if ( cedCli.equals(listaClientes.get(i).getCedula())){
               usr = listaClientes.get(i).getApellido() + " " + listaClientes.get(i).getNombre();
           }
       }
       return usr;
    }
    
    
    public String BuscarClaseHab( int idHab ) {
        String clase = "";
       for (int i = 0; i < listaHabitaciones.size(); i++){
           if ( idHab == listaHabitaciones.get(i).getId()){
               clase = claseHabs[ listaHabitaciones.get(i).getClase() ];
           }
       }
       return clase;
    }
    
    public String BuscarCateHab( int idHab ) {
       String cate = "";
       for (int i = 0; i < listaHabitaciones.size(); i++){
           if ( idHab == listaHabitaciones.get(i).getId()){
               cate = catsHabs[ listaHabitaciones.get(i).getCategoria()];
           }
       }
       return cate;
    }
    
    public boolean buscarBorrarClnt( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaClientes.size(); i++){
           if ( id == listaClientes.get(i).getId() ){
               this.borrarCliente(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    public objCliente getCliente( int id ){
       objCliente resultado = null;
       for (int i = 0; i < listaClientes.size(); i++){
           if ( id == listaClientes.get(i).getId() ){
               resultado = listaClientes.get(i);
           }
       }
       return resultado;
    }
}
