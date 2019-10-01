package net.unir.mongoDemo.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="credencial")
public class Credencial{

	private String _id;
    private String identificacion;
    private String password;
    private String rol;

    public Credencial() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

}