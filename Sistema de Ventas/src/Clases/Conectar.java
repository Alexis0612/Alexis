
package Clases;

import Formularios.frmPrincipal;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author joela
 */
public class Conectar {
    // crear un objeto para conectarnos a la base de datos
    public Connection con;
    private Datos misDatos;
    public static String ObtenerUsuario; 
    public static String ObtenerClave;
    
    public Conectar()
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
    frmPrincipal f1 = new frmPrincipal();
    //metodo para validar usuarios
    public boolean validarUsuario(String usuario, String clave)
    {
        ObtenerUsuario = usuario;
        ObtenerClave = clave;
        try {
            String sql = "Select * from usuarios where Nombre = '"+usuario+"' and " + "clave = '"+clave+"'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuario = rs.getString("Nombre");
                clave = rs.getString("Clave");
                f1.setVisible(true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //metodo para insertar los usuarios
    public boolean insertarUsuario(Usuario usuario)
    {
        try {
            String sql = "INSERT INTO usuarios VALUES("+usuario.getIdUsuario()+","
                + "'" +usuario.getNombres()+"',"
                + "'" +usuario.getApellidos()+"'," 
                + "'" +usuario.getClave()+"',"     
                + "'" +usuario.getPerfil()+"')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    //metodo para mostrar la informacion de la base de datos en la tabla
    public ResultSet getUsuarios()
    {   
        try {
            String sql = "Select * from usuarios";
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
    public Usuario getUsuario(String idusuario)
    {
        try {
            Usuario usuarios = null;
            String sql = "Select * from usuarios where Id_usuarios = '"+idusuario+"'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuarios = new Usuario(rs.getString("Id_usuarios"),
                rs.getString("Nombre"),
                rs.getString("Apellido"),
                rs.getString("Clave"),                
                rs.getInt("Id_Perfil"));
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //metodo para modificar usuarios
    public boolean UpdateUsuario(Usuario usuario)
    {
        try {
            String sql = "UPDATE usuarios SET Nombre = '"+usuario.getNombres()+"', Apellido ='"+usuario.getApellidos()+"',"
                + "Clave = '"+usuario.getClave()+"', Id_Perfil = '"+usuario.getPerfil()+"'"
                + "WHERE Id_usuarios = '"+usuario.getIdUsuario()+"'";
            Statement st;
            st = con.createStatement();
            st.executeUpdate(sql);            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
        //metodo para actualizar clave
    public boolean UpdateClave(String actual, String nuevaClave)
    {
            try {
                if(ObtenerClave.equals(actual)){
                    String sql = "UPDATE usuarios SET Clave = '"+nuevaClave+"'"
                    + "WHERE Nombre = '"+ObtenerUsuario+"'";
                    Statement st;
                    st = con.createStatement();
                    st.executeUpdate(sql);            
                    return true;
                }
                return false;
            } 
            catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }            
    }
    
    //metodo para eliminar usuario
    public boolean deleteUsuario(Usuario usuario)
    {
        try {
            String sql = "DELETE FROM usuarios WHERE Id_usuarios = '"+usuario.getIdUsuario()+"'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean insertarFactura(Factura factura)
    {
            
        
        try {
            String sql = "INSERT INTO Factura VALUES('"
                +factura.getFecha()+"','"
                +factura.getNombre()+"','"
                +factura.getProducto()+"','"
                +factura.getCantidad()+"',"
                +factura.getTotal()+")";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
    }
    
    //método para mostrar la información de la base de datos en la tabla
    public ResultSet getFactura()
    {
                 
        try {
            String sql = "Select * from Factura"; 
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
     //metodo para buscar los registros por medio del Nombre
    public Factura getFactura(String nombre)
    {
            
            
        try { 
            Factura factura = null;
            String sql = "Select * from Factura where Cliente = '"+nombre+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
            factura = new Factura(rs.getString("Fecha"),
            rs.getString("Cliente"),
            rs.getString("Producto"),
            rs.getInt("Cantidad"),
            rs.getDouble("Total"));
            }
            return factura;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //método para modificar Factura
    public boolean udpdateFactura(Factura factura)
    {
        try {
            String sql = "update Factura set Fecha = '"+factura.getFecha()+"',Fecha ='"+factura.getFecha()+"',"
                    +"Producto ='"+factura.getProducto()+"',Cantidad = '"+factura.getCantidad()+"',Total ='"+factura.getTotal()+"'";
  
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //método para eliminar Factura
    public boolean deleteFactura(Factura factura)
    {
            
        try {
            String sql = "Delete from Factura where Cliente = '"+factura.getNombre()+"'"; 
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    public void llenarComboboxCliente(JComboBox combo) {
        
        try {
            String sql = "Select Nombre from clientes";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.addItem("Seleccione un Cliente...");
            while(rs.next()){
            combo.addItem(rs.getString("Nombre"));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void llenarComboboxProducto(JComboBox combop) {
        
            
        try { 
            String sql = "Select Descripcion from productos";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            combop.addItem("Seleccione un producto...");
            while(rs.next())
            {
                combop.addItem(rs.getString("Descripcion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
