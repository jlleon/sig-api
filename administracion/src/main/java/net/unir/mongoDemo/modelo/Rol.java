package net.unir.mongoDemo.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="rol")
public class Rol {

	private String id;
    private String nombre;
    private String tipo_institucion;
    private String[] modulos;

    public Rol() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getModulos() {
        return modulos;
    }

    public void setModulos(String[] modulos) {
        this.modulos = modulos;
    }

    public String getTipo_institucion() {
        return tipo_institucion;
    }

    public void setTipo_institucion(String tipo_institucion) {
        this.tipo_institucion = tipo_institucion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}