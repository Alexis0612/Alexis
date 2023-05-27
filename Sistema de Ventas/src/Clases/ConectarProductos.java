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
 * @author joela
 */
public class ConectarProductos {
    // crear un objeto para conectarnos a la base de datos
    private Connection con;
    
    public ConectarProductos()
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
    
    //metodo para insertar los usuarios
    public boolean insertarProducto(Producto producto)
    {
        try {
            String sql = "INSERT INTO productos VALUES("+producto.getIdProductos()+","
                + "'"+producto.getDescripcion()+"',"
                + "'"+producto.getPrecio()+"'," 
                + "'"+producto.getIVA()+"',"     
                + "'"+producto.getNota()+"')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    //metodo para mostrar la informacion de la base de datos en la tabla
    public ResultSet getProductos()
    {        
        
        try {
            String sql = "Select * from productos";
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
    public Producto getProducto(String id)
    {
        try {
            Producto productos = null;
            String sql = "Select * from productos where Id_productos = '"+id+"'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                productos = new Producto(rs.getString("Id_productos"),
                rs.getString("Descripcion"),
                rs.getInt("Precio"),
                rs.getInt("IVA"),                
                rs.getString("Nota"));
            }
            return productos;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //metodo para modificar usuarios
    public boolean UpdateProducto(Producto producto)
    {
        
        try {
            String sql = "UPDATE productos SET Descripcion = '"+producto.getDescripcion()+"', Precio ='"+producto.getPrecio()+"',"
                + "IVA = '"+producto.getIVA()+"', Nota = '"+producto.getNota()+"'"
                + "WHERE Id_productos = '"+producto.getIdProductos()+"'";
            Statement st;
            st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //metodo para eliminar usuarios
    public boolean deleteProducto(Producto producto)
    {
        
        try {
            String sql = "DELETE FROM productos WHERE Id_productos = '"+producto.getIdProductos()+"'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
