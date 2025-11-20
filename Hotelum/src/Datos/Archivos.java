/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

//imports para trabajar con archivos
import java.io.File;                    //Input - Output
import java.io.FileReader;              // Lectura
import java.io.FileWriter;              // Escritura
import java.io.BufferedReader;          // Lectura
import java.io.PrintWriter;             // Escritura
import java.io.IOException;             // try catch
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author sebas
 */
public class Archivos {

    public Archivos() {
    }
    
    
    public void creaArchivoCliente(){
        File miArchivo = new File("Cliente.txt");
        try{
            if (miArchivo.createNewFile()){
                System.out.println("--------------------");
                System.out.println("---Archivo creado---");
                System.out.println("--------------------");
            } else {
                System.out.println("-------------------");
                System.out.println("-Archivo ya existe-");
                System.out.println("-------------------");
            
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally{
        
        }
    }
    
    public ArrayList<objCliente> leerArchivoCliente(){
        ArrayList<objCliente> resultado = new ArrayList<>();
        try {
            FileReader file = new FileReader("Cliente.txt");
            BufferedReader lector = new BufferedReader(file);
            
            //Variable para cargar lineas
            
            String linea = lector.readLine();
            
            String segmento[]; //vector
            
            while (linea != null){
                segmento = linea.split(";"); //divide linea cuando encientra lo que se le envia por parametro
                if (!segmento[0].equals("")){
                    objCliente clnt = new objCliente();
                    clnt.setId(Integer.parseInt(segmento[0]));
                    clnt.setCedula(segmento[1]);
                    clnt.setTelefono(Integer.parseInt(segmento[2]));
                    clnt.setNombre(segmento[3]);
                    clnt.setApellido(segmento[4]);
                    clnt.setDireccion(segmento[5]);
                    clnt.setEstado(Integer.parseInt(segmento[6]));
                    resultado.add(clnt);
                    
                }
                linea = lector.readLine(); // siguiente linea
                
            
            }
            
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }
        return resultado;
    }
    
    public void limpiarArchivoCliente(){
        try {
            PrintWriter escritor = new PrintWriter("Cliente.txt"); //limpiar el archivo que se le indique por string 
            System.out.println("Datos limpios de Cliente.txt");

        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al limpiar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());

        } finally {

        }
    }
    
    public void escribirArchivoCliente(){
        //antes de escribir se limpia
        this.limpiarArchivoCliente();

        //guardar
        try {
            FileWriter escritor = new FileWriter("Cliente.txt", true);
            String linea; // variable para recorrer el txt

            for (int i = 0; i < estructuras.listaClientes.size(); i++){
                objCliente clnt = estructuras.listaClientes.get(i);
                linea = String.valueOf(clnt.getId()) + ";" +
                        clnt.getCedula() + ";" +
                        String.valueOf(clnt.getTelefono()) + ";" +
                        clnt.getNombre() + ";" +
                        clnt.getApellido() + ";" +
                        clnt.getDireccion() + ";" +
                        String.valueOf(clnt.getEstado()) + ";\n";
                escritor.write(linea);
            }

            escritor.write(10); //comando de cierre 
            escritor.close();

        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al escribir el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally {

        }
    
    }
    
    public void creaArchivoUsuario(){
        File miArchivo = new File("Usuario.txt");
        try{
            if (miArchivo.createNewFile()){
                System.out.println("--------------------");
                System.out.println("---Archivo creado---");
                System.out.println("--------------------");
            } else {
                System.out.println("-------------------");
                System.out.println("-Archivo ya existe-");
                System.out.println("-------------------");
            
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally{
        
        }
    }
    
    public void creaArchivoHabitacion(){
        File miArchivo = new File("Habitacion.txt");
        try{
            if (miArchivo.createNewFile()){
                System.out.println("--------------------");
                System.out.println("---Archivo creado---");
                System.out.println("--------------------");
            } else {
                System.out.println("-------------------");
                System.out.println("-Archivo ya existe-");
                System.out.println("-------------------");
            
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally{
        
        }
    }
    
    //limpiar datos del txt
    
    public void limpiarArchivoHabitacion(){
        try {
            PrintWriter escritor = new PrintWriter("Habitacion.txt"); //limpiar el archivo que se le indique por string 
            System.out.println("Datos limpios de Habitacion.txt");

        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al limpiar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());

        } finally {

        }
    }
    
    //Ingresar datos en habitaacion
    
    public void escribirArchivoHabitacion(){
        //antes de escribir se limpia
        this.limpiarArchivoHabitacion();

        //guardar
        try {
            FileWriter escritor = new FileWriter("Habitacion.txt", true);
            String linea; // variable para recorrer el txt

            for (int i = 0; i < estructuras.listaHabitaciones.size(); i++){
                objHabitacion hab = estructuras.listaHabitaciones.get(i);
                linea = String.valueOf(hab.getId()) + ";" +
                        String.valueOf(hab.getCategoria()) + ";" +
                        String.valueOf(hab.getClase()) + ";" +
                        String.valueOf(hab.getEdificio()) + ";" +
                        String.valueOf(hab.getPiso()) + ";" +
                        String.valueOf(hab.getEstado()) + ";" +
                        hab.getDetalles() + ";\n";
                escritor.write(linea);
            }

            escritor.write(10); //comando de cierre 
            escritor.close();

        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al escribir el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally {

        }
    
    }
    
    public ArrayList<objHabitacion> leerArchivoHabitacion(){
        ArrayList<objHabitacion> resultado = new ArrayList<>();
        try {
            FileReader file = new FileReader("Habitacion.txt");
            BufferedReader lector = new BufferedReader(file);
            
            //Variable para cargar lineas
            
            String linea = lector.readLine();
            
            String segmento[]; //vector
            
            while (linea != null){
                segmento = linea.split(";"); //divide linea cuando encientra lo que se le envia por parametro
                if (!segmento[0].equals("")){
                    objHabitacion hab = new objHabitacion();
                    hab.setId(Integer.parseInt(segmento[0]));
                    hab.setCategoria( Integer.parseInt(segmento[1]));
                    hab.setClase(Integer.parseInt(segmento[2]));
                    hab.setEdificio(Integer.parseInt(segmento[3]));
                    hab.setPiso(Integer.parseInt( segmento[4] ) );
                    hab.setEstado(Integer.parseInt(segmento[5]) );
                    hab.setDetalles( segmento[6] );
                    resultado.add(hab);
                    
                }
                linea = lector.readLine(); // siguiente linea
                
            
            }
            
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al leer el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }
        return resultado;
    }
    
    public void creaArchivoEncReserva(){
        File miArchivo = new File("EncReserva.txt");
        try{
            if (miArchivo.createNewFile()){
                System.out.println("--------------------");
                System.out.println("---Archivo creado---");
                System.out.println("--------------------");
            } else {
                System.out.println("-------------------");
                System.out.println("-Archivo ya existe-");
                System.out.println("-------------------");
            
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally{
        
        }
    }
    
    public void creaArchivoDetReserva(){
        File miArchivo = new File("DetReserva.txt");
        try{
            if (miArchivo.createNewFile()){
                System.out.println("--------------------");
                System.out.println("---Archivo creado---");
                System.out.println("--------------------");
            } else {
                System.out.println("-------------------");
                System.out.println("-Archivo ya existe-");
                System.out.println("-------------------");
            
            }
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el archivo...", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        } finally{
        
        }
    }
    
    
    
}
