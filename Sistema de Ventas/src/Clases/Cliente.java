/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Efrain
 */
public class Cliente {
    //declarar nuestras variables privadas
    private String idClientes;  
    private int identificacion;
    private String nombres;
    private String apellidos;    
    private String direccion;
    private int telefono;
    private int ciudad;
    private String fechaNacimiento;
    private String fechaIngreso;
    
    public Cliente(String idClientes, int identificacion, String nombres, String apellidos, String direccion, 
            
                   int telefono, int ciudad, String fechaNacimiento, String fechaIngreso) {

    this.idClientes = idClientes;

    this.identificacion = identificacion;

    this.nombres = nombres;

    this.apellidos = apellidos;

    this.direccion = direccion;

    this.telefono = telefono;

    this.ciudad = ciudad;

    this.fechaNacimiento = fechaNacimiento;

    this.fechaIngreso = fechaIngreso;

  }

    public String getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(String idClientes) {
        this.idClientes = idClientes;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
