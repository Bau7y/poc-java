/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import javax.swing.DefaultListModel;
import java.time.LocalDate;
import java.util.*;
import java.math.BigDecimal;
import java.text.ParseException;



/**
 *
 * @author sebas
 */
public class estructuras {
    
    static ArrayList<objUsuario> listaUsuarios = new ArrayList<>();
    static ArrayList<objEmpleado> listaEmpleados = new ArrayList<>();
    static ArrayList<objLiquidacion> listaLiquidaciones = new ArrayList<>();
    static ArrayList<objViatico> listaViaticos = new ArrayList<>();
    static ArrayList<objDetalleLiq> listaDetalleLiq = new ArrayList<>();
    static ArrayList<objUsuario> listaUsuarioActual = new ArrayList<>();
    static String[] roles = {"Administrador", "Empleado"};

    public estructuras() {
    }
    
    public void precargaDatos(){
        
        objViatico via1 = new objViatico();
        via1.setEstado(0);
        via1.setIdViatico(1);
        via1.setMonto(3000);
        via1.setHoraLlegada(7);
        via1.setHoraSalida(10);
        via1.setNomViatico("Desayuno");
        
        objViatico via2 = new objViatico();
        via2.setEstado(0);
        via2.setIdViatico(2);
        via2.setMonto(5000);
        via2.setHoraLlegada(10);
        via2.setHoraSalida(14);
        via2.setNomViatico("Almuerzo");
        
        objViatico via3 = new objViatico();
        via3.setEstado(0);
        via3.setIdViatico(3);
        via3.setMonto(5000);
        via3.setHoraLlegada(16);
        via3.setHoraSalida(20);
        via3.setNomViatico("Cena");
        
        listaViaticos.add(via1);
        listaViaticos.add(via2);
        listaViaticos.add(via3);
        
        objEmpleado emp1 = new objEmpleado();
        emp1.setNombreEmp("Dei V");
        emp1.setApellido1Emp("Flores");
        emp1.setApellido2Emp("Delgado");
        emp1.setCedulaEmp(208740690);
        emp1.setDireccion("Sucre");
        emp1.setEstado(0);
        emp1.setIdEmpleado("1T-7");
        emp1.setNumTelefonico(87104771);
        
        listaEmpleados.add(emp1);
        
    }
    
    public void cargarUsuarios () {
        objUsuario usr1 = new objUsuario();
        usr1.setEstado(0);
        usr1.setIdUsuario(74);
        usr1.setClave("111");
        usr1.setIdentificacion("1-C");
        usr1.setNombreUsr("sebasR");
        usr1.setNombreCompleto("Sebastian Rojas H");
        usr1.setRol(0);
        
        objUsuario usr2 = new objUsuario();
        usr2.setEstado(0);
        usr2.setIdUsuario(75);
        usr2.setClave("222");
        usr2.setIdentificacion("4e-C");
        usr2.setNombreUsr("Aan88");
        usr2.setNombreCompleto("Aanie campos villegas");
        usr2.setRol(1);
        
        objUsuario usr3 = new objUsuario();
        usr3.setEstado(1);
        usr3.setIdUsuario(24);
        usr3.setClave("333");
        usr3.setIdentificacion("8Q-2");
        usr3.setNombreUsr("rojasA");
        usr3.setNombreCompleto("Mateo Rojas Acosta");
        usr3.setRol(1);
        
        listaUsuarios.add(usr1);
        listaUsuarios.add(usr2);
        listaUsuarios.add(usr3);
        
    }
    
    
    public void agregarUsr( objUsuario miUsr ) {
        listaUsuarios.add(miUsr);
    }
    
    public void borrarUsr( int idxUsr ) {
        listaUsuarios.remove(idxUsr);
    }
    
    public void modUsr (int idxUsr, objUsuario miNuevoUsr) {
        listaUsuarios.set(idxUsr, miNuevoUsr);
    }
    
    public void agregarEmp( objEmpleado miEmp ) {
        listaEmpleados.add(miEmp);
    }
    
    public void borrarEmp( int idxEmp ) {
        listaEmpleados.remove(idxEmp);
    }
    
    public void modEmp (int idxEmp, objEmpleado miNuevoEmp) {
        listaEmpleados.set(idxEmp, miNuevoEmp);
    }
    
    public void agregarLiq( objLiquidacion miLiq ) {
        listaLiquidaciones.add(miLiq);
    }
    
    public void borrarLiq( int idxLiq ) {
        listaLiquidaciones.remove(idxLiq);
    }
    
    public void modLiq (int idxLiq, objLiquidacion miLiquidacion) {
        listaLiquidaciones.set(idxLiq, miLiquidacion);
    }
    
    public void agregarVia( objViatico miVia ) {
        listaViaticos.add(miVia);
    }
    
    public void borrarVia( int idxVia ) {
        listaViaticos.remove(idxVia);
    }
    
    public void modVia (int idxVia, objViatico miViatico) {
        listaViaticos.set(idxVia, miViatico);
    }
    
    public void agregarDetL( objDetalleLiq miDetL ) {
        listaDetalleLiq.add(miDetL);
    }
    
    public void borrarDetL( int idxDetL ) {
        listaDetalleLiq.remove(idxDetL);
    }
    
    public void modDetL (int idxDetL, objDetalleLiq miDetalleLiq) {
        listaDetalleLiq.set(idxDetL, miDetalleLiq);
    }
    
    public void agregarUsrAct(objUsuario usr) {
        listaUsuarioActual.add(usr);
    }
    
    public objUsuario getUsr( int id ){
       objUsuario resultado = null;
       for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getIdUsuario()){
               resultado = listaUsuarios.get(i);
           }
       }
       return resultado;
    }
    
    public objViatico getVia( int id ){
       objViatico resultado = null;
       for (int i = 0; i < listaViaticos.size(); i++){
           if ( id == listaViaticos.get(i).getIdViatico()){
               resultado = listaViaticos.get(i);
           }
       }
       return resultado;
    }
    
    public boolean buscarBorrarUsr( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getIdUsuario()){
               this.borrarUsr(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    
    public int getIndexUsr ( int id ){
       int idx = -1;
       for (int i = 0; i < listaUsuarios.size(); i++){
           if ( id == listaUsuarios.get(i).getIdUsuario()){
               idx = i;
               break;
           }
       }
       return idx;
    }
    
    
    public int compruebaLogin(String usuario, String clave){
        int resultado = 0;
        for (int i = 0; i < listaUsuarios.size(); i++){
            if ( usuario.equals(listaUsuarios.get(i).getNombreUsr()) && clave.equals(listaUsuarios.get(i).getClave()) ){
                if (listaUsuarios.get(i).getEstado() == 1){
                    resultado = 2;
                    break;
                }
                resultado = 1;
                this.agregarUsrAct(listaUsuarios.get(i));
                break;
            } 
        }
        
        return resultado;
    }
    
    public String compruebaUsuario() {
        for ( int i = 0; i < listaUsuarioActual.size(); i++){
            if (listaUsuarioActual.get(i).getRol() == 1){
                return roles[1];
            }
        }
        return roles[0];
    }
    
    public ArrayList<String> listaViaticos(){
        ArrayList<String> miLista = new ArrayList<>();
        for (int i = 0; i < listaViaticos.size(); i++){
            miLista.add(listaViaticos.get(i).getNomViatico());
        }
        return miLista;
    }
    
    public ArrayList<String> listaEmpleados(){
        ArrayList<String> miLista = new ArrayList<>();
        for (int i = 0; i < listaEmpleados.size(); i++){
            miLista.add(listaEmpleados.get(i).getIdEmpleado());
        }
        return miLista;
    }
    
    public int getViaIdx( int id ){
        int idx = -1;
        for ( int i = 0; i < listaViaticos.size(); i++ ){
            if ( id == listaViaticos.get(i).getIdViatico() ){
                idx = i;
                break;
            }
        
        }
        return idx;
    }
    
    public boolean buscarBorrarVia( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaViaticos.size(); i++){
           if ( id == listaViaticos.get(i).getIdViatico()){
               this.borrarVia(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    public boolean buscarBorrarEmp( int id ){
        boolean resultado = false;
        for (int i = 0; i < listaEmpleados.size(); i++){
           if ( id == listaEmpleados.get(i).getCedulaEmp()){
               this.borrarEmp(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    public DefaultListModel listarViaticos () {
        DefaultListModel miLista = new DefaultListModel();
        for ( int i = 0; i < listaViaticos.size(); i++ ){
            miLista.add( i, "nom: " + listaViaticos.get(i).getNomViatico()+ " : ₡" + listaViaticos.get(i).getMonto() + " : " + listaViaticos.get(i).getIdViatico());
        }
        
        return miLista;
        
    }
    
    public DefaultListModel listarUsuarios () {
        DefaultListModel miLista = new DefaultListModel();
        for ( int i = 0; i < listaUsuarios.size(); i++ ){
            miLista.add( i, "usr: "+ listaUsuarios.get(i).getNombreUsr()+ " - ced: " + listaUsuarios.get(i).getIdUsuario());
        }
        
        return miLista;
    }
    
    public int getIdxEmp( int id ){
        int idx = -1;
        for ( int i = 0; i < listaEmpleados.size(); i++ ){
            if ( id == listaEmpleados.get(i).getCedulaEmp()){
                idx = i;
                break;
            }
        
        }
        return idx;
    }
    
    public objEmpleado getEmp( int id ){
       objEmpleado resultado = null;
       for (int i = 0; i < listaEmpleados.size(); i++){
           if ( id == listaEmpleados.get(i).getCedulaEmp()){
               resultado = listaEmpleados.get(i);
           }
       }
       return resultado;
    }
    
    public DefaultListModel listarEmpleados () {
        DefaultListModel miLista = new DefaultListModel();
        for ( int i = 0; i < listaEmpleados.size(); i++ ){
            miLista.add( i, "ID: " + listaEmpleados.get(i).getIdEmpleado()+ " - ced: " + listaEmpleados.get(i).getCedulaEmp());
        }
        
        return miLista;
    }
    
    public ArrayList< Integer > getInfoViatico( String nombreVia ) {
        ArrayList< Integer > miLista = new ArrayList<>();
        for (int i = 0; i < listaViaticos.size(); i++){
           if ( nombreVia.equals(listaViaticos.get(i).getNomViatico()) ){
               miLista.add(listaViaticos.get(i).getHoraLlegada());
               miLista.add(listaViaticos.get(i).getHoraSalida());
               miLista.add(listaViaticos.get(i).getMonto());
               break;
           }
       }
        return miLista;
       
    }
    
    public String getNombreEmp (String id) {
       String usr = "";
       for (int i = 0; i < listaEmpleados.size(); i++){
           if ( id.equals(listaEmpleados.get(i).getIdEmpleado())){
               usr = listaEmpleados.get(i).getApellido1Emp()+ " " + listaEmpleados.get(i).getNombreEmp();
           }
       }
       return usr;
    
    }
    
    public int compruebaEstado ( String idEmp ) {
        int idx = 0;
        for ( int i = 0; i < listaEmpleados.size(); i++ ){
            if (idEmp.equals(listaEmpleados.get(i).getIdEmpleado())){
                idx = listaEmpleados.get(i).getEstado();
                break;
            }
        
        }
        return idx;
    
    }
    
    public boolean buscarBorrarLiqDet( String idEmp ){
        boolean resultado = false;
        for (int i = 0; i < listaLiquidaciones.size(); i++){
           if ( idEmp.equals(listaLiquidaciones.get(i).getEmpleadoId()) ){
               this.borrarDetL(i);
               this.borrarLiq(i);
               resultado = true;
               break;
           }
       }
        return resultado;
    }
    
    public boolean comprobarLiqDet(){
        return !(listaDetalleLiq.isEmpty() || listaDetalleLiq.isEmpty());
    }
    
    
    //ids de los empleados presentes en liquidaciones
    public List<String> obtenerEmpleadoIdsConLiquidaciones() {
        LinkedHashSet<String> ids = new LinkedHashSet<>();
        for (objLiquidacion liq : listaLiquidaciones) {
            ids.add(liq.getEmpleadoId()); 
        }
        return new ArrayList<>(ids);
    }
    
    public objEmpleado buscarEmpleadoPorId(String id) {
        for (objEmpleado emp : listaEmpleados) if (emp.getIdEmpleado().equals(id)) return emp;
        return null;
    }
    
    public objViatico buscarViaticoPorId(int id) {
        for (objViatico via : listaViaticos) if (via.getIdViatico() == id) return via;
        return null;
    }
    
    public objViatico buscarViaticoPorNombre(String nombre){
        if (nombre == null) return null;
            String n = nombre.trim().toLowerCase();
            for (objViatico v : listaViaticos) {
                if (v.getNomViatico() != null
                        && v.getNomViatico().trim().toLowerCase().equals(n)) return v;
        }
        return null;
    }
    
    public List<Object[]> reportePorEmpleado(String empleadoId) {
        List<Object[]> filas = new ArrayList<>();
        String nomEmp = getNombreEmp(empleadoId);
        if (nomEmp == null || nomEmp.isBlank()) nomEmp = "ID " + empleadoId;

        java.util.Set<String> llaves = new java.util.HashSet<>(); //no permite duplicados

        for (objLiquidacion liq : listaLiquidaciones) {
            if (!empleadoId.equals(liq.getEmpleadoId())) continue;

            for (objDetalleLiq det : listaDetalleLiq) {
                if (!empleadoId.equals(det.getIdEmp())) continue;

                String nomVia = det.getViatico();
                String just  = det.getJustificacion();
                String obs   = det.getObserva();

                // clave de dedupe
                String key = liq.getFechaConsumo() + "|" + nomVia + "|" +
                             (just==null?"":just) + "|" + (obs==null?"":obs);

                if (!llaves.add(key)) continue; 

                long monto = 0L;
                objViatico cat = buscarViaticoPorNombre(nomVia);
                if (cat != null) monto = cat.getMonto();

                filas.add(new Object[]{
                    liq.getFechaConsumo(),     // [0] Fecha
                    liq.getEmpleadoId(),       // [1] IdEmpleado
                    nomEmp,                    // [2] Empleado
                    nomVia,                    // [3] Viático
                    monto,                     // [4] Monto
                    just,                      // [5] Justificación
                    obs                        // [6] Obs
                });
            }
        }
        return filas;
    }
    
    private java.time.LocalDate toLocalDateFromString(String date) {
        if (date == null || date.isBlank()) return null;
        date = date.trim();

        // Intento ISO
        try { return java.time.LocalDate.parse(date); } catch (Exception ignore) {}

        // dd/MM/yyyy
        try {
            var fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return java.time.LocalDate.parse(date, fmt);
        } catch (Exception ignore) {}

        // Date.toString(): "EEE MMM dd HH:mm:ss zzz yyyy" 
        try {
            var fmt = new java.text.SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", java.util.Locale.ENGLISH);
            java.util.Date d = fmt.parse(date);
            return d.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException ignore) {}

        return null; 
    }
    
    public java.util.List<Object[]> reportePorRango_Detallado(java.time.LocalDate desde,
                                                          java.time.LocalDate hasta) {
        java.util.List<Object[]> filas = new java.util.ArrayList<>();
        if (desde == null || hasta == null) return filas;

        java.util.Set<String> llaves = new java.util.HashSet<>();

        for (objLiquidacion liq : listaLiquidaciones) {
            java.time.LocalDate fLiq = toLocalDateFromString(liq.getFechaConsumo());
            if (fLiq == null) continue;
            if (fLiq.isBefore(desde) || fLiq.isAfter(hasta)) continue;

            String empleadoId = liq.getEmpleadoId();
            String nomEmp = getNombreEmp(empleadoId);
            if (nomEmp == null || nomEmp.isBlank()) nomEmp = "ID " + empleadoId;

            for (objDetalleLiq det : listaDetalleLiq) {
                if (!empleadoId.equals(det.getIdEmp())) continue;

                // Clave de dedupe por contenido 
                String just = det.getJustificacion();
                String obs  = det.getObserva();
                String nomVia = det.getViatico();

                String key = fLiq + "|" + empleadoId + "|" + nomVia + "|" +
                             (just==null?"":just) + "|" + (obs==null?"":obs);
                if (!llaves.add(key)) continue; // 

                long monto = 0L;
                objViatico cat = buscarViaticoPorNombre(nomVia);
                if (cat != null) monto = cat.getMonto();
                

                filas.add(new Object[]{
                    liq.getFechaConsumo(),  
                    empleadoId,            
                    nomEmp,                
                    nomVia,                
                    monto,                
                    just,                  
                    obs                    
                });
            }
        }
        return filas;
    }
    
    
    public boolean dentroRango(int llegada, int salida, int inicio, int fin) {
        // considera cambio de día
        int finNorm = fin < inicio ? fin + 24 : fin;     
        int L = llegada, S = salida;

        if (S < L) S += 24;

        if (L < inicio) L += 24;
        if (S < inicio) S += 24;

        
        return L >= inicio && S <= finNorm && S >= L;
    }
}
