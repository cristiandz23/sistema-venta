package com.mycompany.sistemaventas.Logica;

public class Empresa {
    
    private int id;
    private String cuil;
    private String nombre;
    private String direccion;
    private String telefono;
    private String razonSocial;

    public Empresa() {
    }

    public Empresa(int id, String cuil, String nombre, String direccion, String telefono, String razonSocial) {
        this.id = id;
        this.cuil = cuil;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
