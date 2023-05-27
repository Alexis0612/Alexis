/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author joela
 */
public class DatosReporte {
    //declaramos las variables privadas
    private int maxRegistro = 50;
    
    //crear un arreglo para almacenar la informacion de la factura
    Opcion misRegistros[] = new Opcion[maxRegistro];
    
    private int contRegistro = 0; //lleva el control del numero de clientes creados
        
    //metodo para eliminar los registros    
    public String borrarRegistro(int pos)
    {
        for(int i = pos; i < contRegistro - 1; i++)
        {
            misRegistros[i] = misRegistros[i+1];
        }
        contRegistro--;
        return "Registro borrado correctamente";
    }
}
