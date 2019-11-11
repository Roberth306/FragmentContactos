package tk.roberthramirez.contactesfragment;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fecha;
    private String compania;
    private String email;
    private String telefono1;
    private String telefono2;
    private String direccion;

    public Contacto(String nombre, String apellido1, String apellido2, String fecha, String compania, String email, String telefono1, String telefono2, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha = fecha;
        this.compania = compania;
        this.email = email;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccion = direccion;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCompania() {
        return compania;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getDireccion() {
        return direccion;
    }
}
