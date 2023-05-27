/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joela
 */
public class Datos {
    //declaramos las variables privadas
    private int maxUsu = 50;
    
    //crear un arreglo para almacenar la inforamcion de los usuarios
    Usuario misUSuarios[] = new Usuario[maxUsu];
    
    private int contUsu = 0; //lleva el control del numero de usuarios creados
    
    //creamos un constructor
    public Datos()
    {
        //generar una instancia a la clase usuario
        Usuario miUsuario;        
        miUsuario = new Usuario("1","Joel", "Tarrago","123", 1);
        misUSuarios[contUsu] = miUsuario;
        contUsu++;
        
        //generamos una instancia al metodo cargarUsuarios
        //cargarUsuarios();
    }
    //generar metodo para validar al usuario y contraseña
    public boolean validarUsuario(String usuario, String clave)
    {
        for (int i = 0; i < contUsu; i++)
        {
            if (misUSuarios[i].getNombres().equals(usuario) && misUSuarios[i].getClave().equals(clave))
            {
                return true;
            }        
        }
        
        return false;
  }
    
    //metodo para obtener el perfil del usuario
    public int getPerfil(String usuario)
    {
        for (int i = 0; i < contUsu; i++)
        {
            if (misUSuarios[i].getNombres().equals(usuario))
            {
                return misUSuarios[i].getPerfil();
            }                        
        }    
        return -1;
    }
    
    //metodo para el cambio de clave
    public void cambioClave(String usuario, String clave)
    {
        for (int i = 0; i < contUsu; i++)
        {
            if (misUSuarios[i].getNombres().equals(usuario))
            {
                misUSuarios[i].setClave(clave);
                return;
            }                        
        } 
    }
    //metodo para llevar el contro el numero de los usuarios
    public int numeroUsuarios()
    {
        return contUsu;
    }
    
    //metodo para mostrar los registros
    public Usuario[] getUsuarios()
    {
        return misUSuarios;
    }
    
    //crear un metodo para determinar la posicion del usuario
    public int posicionUsuario(String usuario)
    {
        for (int i = 0; i < contUsu; i++)
        {
            if (misUSuarios[i].getIdUsuario().equals(usuario))
            {
                return i;
            }                        
        }    
        return -1;
    }
    
    //crear un metodo para un nuevo registro
    public String agregarUsuario(Usuario miUsuario)
    {
        //verificar si no se ha llegado al numero maximo de registros dle arreglo
        if(contUsu == maxUsu)
        {
            return "Se ha alcanzado el maximo de usuario";
        }
        misUSuarios[contUsu] = miUsuario;
        contUsu++;
        return "Usuario agregado correctamente";
    }
    
    //crear un metodo para modificar un registro
    public String modificarUsuario(Usuario miUsuario, int pos)
    {   
        misUSuarios[pos].setNombres(miUsuario.getNombres());
        misUSuarios[pos].setApellidos(miUsuario.getApellidos());
        misUSuarios[pos].setClave(miUsuario.getClave());
        misUSuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    
    //metodo para eliminar los registros    
    public String borrarRegistro(int pos)
    {
        for(int i = pos; i < contUsu - 1; i++)
        {
            misUSuarios[i] = misUSuarios[i+1];
        }
        contUsu--;
        return "Usuario borrado correctamente";
    }
    
    /*/metodo para grabar los usuarios
    public void grabarTodo()
    {
            DatosProductos dp = new DatosProductos();
            dp.grabarProducto();
            
            DatosCliente dc = new DatosCliente();
            dc.grabarClientes();
            
            grabarUsuarios();
    }
    
    //metodo para crear el archivo de texto
    public void grabarUsuarios()
    {
        //objeto para generar el archivo
            FileWriter fw = null;
            //un objeto para escribir en el archivo
            PrintWriter pw = null;
            
        try {            
            //vamos a crear el archivo y vamos a especificar la ruta
            fw = new FileWriter("Datos/Usuarios.txt");
            pw = new PrintWriter(fw);
            
            //debemos utilizar un ciclo para escribir dentro del archivo
            for(int  i = 0; i < contUsu; i++)
            {
                //utlizar el metodo toString
                pw.println(misUSuarios[i].toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
                try {
                    if(fw != null)
                    {
                    fw.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    //metodo para cargar los datos del archivo usuarios
    public void cargarUsuarios()
    {
        
            File archivo = null; //cargar el archivo
            FileReader fr = null; //leer el contenido del archivo
            BufferedReader br = null; //cargar la informacion en memoria
            
        try {            
            archivo = new File("Datos/Usuarios.txt"); //ubicando el archivo usuarios
            fr = new FileReader(archivo); //lee linea por linea la informacion del archivo
            br = new BufferedReader(fr);
            //declarar las variables necesarios para obtener la informacion del archivo de texto
            String aux;
            String linea;
            String idUsuario, nombres, apellidos, clave;
            int perfil;
            int pos;
            
            //leer linea por linea lo que tenga la variable br
            while((linea = br.readLine()) != null)
            {
                //extraer el dato del idUsuario
                pos = linea.indexOf('|');
                aux = linea.substring(0,pos);
                idUsuario = aux;
                linea = linea.substring(pos + 1);
                //extraer los nombres
                pos = linea.indexOf('|');
                aux = linea.substring(0,pos);
                nombres = aux;
                linea = linea.substring(pos + 1);
                //extraer los apellidos
                pos = linea.indexOf('|');
                aux = linea.substring(0,pos);
                apellidos = aux;
                linea = linea.substring(pos + 1);
                //extraer la clave
                pos = linea.indexOf('|');
                aux = linea.substring(0,pos);
                clave = aux;
                linea = linea.substring(pos + 1);
                //extraer el perfil
                perfil = new Integer(linea);
                
                //llenar el arreglo misUsuarios con la informacion obtenida
                Usuario misUsuarios = new Usuario(idUsuario, nombres, apellidos, clave, perfil);
                misUSuarios[contUsu] = misUsuarios;
                contUsu++;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
                try {
                    if(fr != null)
                    {
                    fr.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }*/
}   
