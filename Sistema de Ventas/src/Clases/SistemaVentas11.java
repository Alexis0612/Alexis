/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.frmLogin;


/**
 *
 * @author joela
 */
public class SistemaVentas11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generar una instancia a la clase Datos
        Datos misDatos = new Datos();
        //generar una instancia para conectarnos al formulario Login
        frmLogin login = new frmLogin();
        login.setDatos(misDatos);  
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    }
    
}
