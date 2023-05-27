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

public class Opcion {
    private String valor;
    private String descripcion;

    public Opcion(String valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }
    
    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descripcion; 
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
