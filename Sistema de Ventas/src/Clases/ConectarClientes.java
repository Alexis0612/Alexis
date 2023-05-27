/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Efrain Soza 
 */
public class ConectarClientes {
   // crear un objeto para conectarnos a la base de datos
    private Connection con;
    
    public ConectarClientes()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //generar el string de conexion
            String db = "jdbc:mysql://localhost/sventasbd?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
            System.out.print("Conectados a SVentasBD");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para cerrar la conexion
    public void cerrarConexion()
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para insertar los clientes
    public boolean insertarCliente(Cliente cliente)
    {
        try {
            String sql = "INSERT INTO clientes VALUES("+cliente.getIdClientes()+","
                + "'"+cliente.getIdentificacion()+"',"
                + "'"+cliente.getNombres()+"'," 
                + "'"+cliente.getApellidos()+"',"     
                + "'"+cliente.getDireccion()+"',"
                + "'"+cliente.getTelefono()+"',"
                + "'"+cliente.getCiudad()+"',"
                + "'"+cliente.getFechaNacimiento()+"',"
                + "'"+cliente.getFechaIngreso()+"')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    //metodo para mostrar la informacion de la base de datos en la tabla
    public ResultSet getClientes()
    {   
        try {
            String sql = "Select * from clientes";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    
    }
    
    //metodo para buscar los registros por medio del Id
    public Cliente getCliente(String id)
    {
        try {
            Cliente clientes = null;
            String sql = "Select * from clientes where Id_clientes = '"+id+"'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                clientes = new Cliente(rs.getString("Id_clientes"),
                rs.getInt("identificacion"),
                rs.getString("Nombre"),
                rs.getString("Apellido"),
                rs.getString("Direccion"),
                rs.getInt("Telefono"),
                rs.getInt("Ciudad"),
                rs.getString("Fecha_Nacimiento"),
                rs.getString("Fecha_Ingreso"));
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //metodo para modificar clientes
    public boolean UpdateCliente(Cliente cliente)
    {
        try {
            String sql = "UPDATE clientes SET Identificacion = '"+cliente.getIdentificacion()+"',"
                + "Identificacion ='"+cliente.getIdentificacion()+"',"
                + "Nombre ='"+cliente.getNombres()+"',"
                + "Apellido = '"+cliente.getApellidos()+"', "
                + "Direccion = '"+cliente.getDireccion()+"',"
                + "Telefono = '"+cliente.getTelefono()+"',"
                + "Ciudad = '"+cliente.getCiudad()+"',"
                + "Fecha_Nacimiento = '"+cliente.getFechaNacimiento()+"',"
                + "Fecha_Ingreso = '"+cliente.getFechaIngreso()+"',"
                + "WHERE Id_clientes = '"+cliente.getIdClientes()+"'";
            Statement st;
            st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //metodo para eliminar clientes
    public boolean deleteCliente(Cliente cliente)
    {
        try {
            String sql = "DELETE FROM clientes WHERE Id_clientes = '"+cliente.getIdClientes()+"'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
