 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joela
 */
public class Utilerias {
    //crear un metodo para verificar si el usuario esta ingresando datos  numericos
    public static boolean esNumero(String cadena)
    {
        try
        {
            Integer.parseInt(cadena);
            return true;
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }
    
    
}
