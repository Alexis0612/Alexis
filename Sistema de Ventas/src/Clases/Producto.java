/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author joela
 */
public class Producto {
    //declarar nuestras variables privadas
    private String idProductos;    
    private String descripcion;
    private int precio;    
    private int IVA;
    private String Nota;

public Producto(String idProductos, String descripcion, int precio, int IVA, String Nota) {
        this.idProductos = idProductos;
        this.descripcion = descripcion;
        this.precio = precio;
        this.IVA = IVA;
        this.Nota = Nota;
    }    

public String getIdProductos() {
        return idProductos;
    }

public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }
    
public String getDescripcion() {
        return descripcion;
    }

public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  

public int getPrecio() {
        return precio;
    }

public void setPrecio(int precio) {
        this.precio = precio;
    }

public int getIVA() {
        return IVA;
    }

public void setIVA(int IVA) {
        this.IVA = IVA;
    }    

public String getNota(){
    return Nota;
}

public void setNota(String Nota){
    this.Nota = Nota;
}

}
