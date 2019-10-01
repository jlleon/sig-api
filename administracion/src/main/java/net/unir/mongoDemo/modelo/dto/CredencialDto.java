package net.unir.mongoDemo.modelo.dto;

import java.util.Collection;

import net.unir.mongoDemo.modelo.Modulo;

public class CredencialDto{
    //username
    private String _id;
    // Persona
    // private String identificacion;
    private String nombre;
    private String apellido;
    private String institucion;
    private String email;
    // rol
    private String tipo_institucion;
    private String rol;
    // modulos
    private Collection<Modulo> modulos;

    public CredencialDto() {
    }

    public Collection<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(Collection<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String get_id() {
        return _id;
    }

    public String getTipo_institucion() {
        return tipo_institucion;
    }

    public void setTipo_institucion(String tipo_institucion) {
        this.tipo_institucion = tipo_institucion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}