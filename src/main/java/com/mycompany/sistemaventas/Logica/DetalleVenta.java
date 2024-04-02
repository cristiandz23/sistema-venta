package com.mycompany.sistemaventas.Logica;

public class DetalleVenta {
    
    private int id;
    private Producto producto;
    private Venta venta;
    private int canttidad;

   

    public DetalleVenta() {
    }

    public DetalleVenta(int id, Producto producto, Venta venta, int canttidad) {
        this.id = id;
        this.producto = producto;
        this.venta = venta;
        this.canttidad = canttidad;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
     public int getCanttidad() {
        return canttidad;
    }

    public void setCanttidad(int canttidad) {
        this.canttidad = canttidad;
    }
    
}
