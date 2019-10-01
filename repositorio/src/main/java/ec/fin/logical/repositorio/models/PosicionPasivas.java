package ec.fin.logical.repositorio.models;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posicion_pasivas")
public class PosicionPasivas {
    @Id
    public ObjectId _id;

    public String fecha;
    public String tipo_institucion;
    public String nombre_corto;
    public String nombre_largo;
    public String producto;
    public BigDecimal saldo;

    /**
     * 
     */
    public PosicionPasivas() {
    }

    /**
     * @param _id
     * @param fecha
     * @param tipo_institucion
     * @param nombre_corto
     * @param nombre_largo
     * @param producto
     * @param saldo
     */
    public PosicionPasivas(ObjectId _id, String fecha, String tipo_institucion, String nombre_corto,
            String nombre_largo, String producto, BigDecimal saldo) {
        this._id = _id;
        this.fecha = fecha;
        this.tipo_institucion = tipo_institucion;
        this.nombre_corto = nombre_corto;
        this.nombre_largo = nombre_largo;
        this.producto = producto;
        this.saldo = saldo;
    }

    /**
     * @return the _id
     */
    public ObjectId get_id() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo_institucion
     */
    public String getTipo_institucion() {
        return tipo_institucion;
    }

    /**
     * @param tipo_institucion the tipo_institucion to set
     */
    public void setTipo_institucion(String tipo_institucion) {
        this.tipo_institucion = tipo_institucion;
    }

    /**
     * @return the nombre_corto
     */
    public String getNombre_corto() {
        return nombre_corto;
    }

    /**
     * @param nombre_corto the nombre_corto to set
     */
    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    /**
     * @return the nombre_largo
     */
    public String getNombre_largo() {
        return nombre_largo;
    }

    /**
     * @param nombre_largo the nombre_largo to set
     */
    public void setNombre_largo(String nombre_largo) {
        this.nombre_largo = nombre_largo;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    
}