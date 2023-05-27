    
package Clases;

/**
 *
 * @author fitosterralogistics
 */
public class Factura {
    private String fecha;
    private String nombre;
    private String producto;
    //private int precio;
    private int cantidad;
    private double total;
    
    //creo las instancias

    public Factura(String fecha, String nombre, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.producto = producto;
        //this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    /*public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }*/

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
