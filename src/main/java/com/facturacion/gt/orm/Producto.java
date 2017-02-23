package com.facturacion.gt.orm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Ramiro on 22/02/2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="producto")
public class Producto {

    @XmlElement
    private BigInteger cod_producto;
    @XmlElement
    private String descripcion;
    @XmlElement
    private String marca;
    @XmlElement
    private String imagen;
    @XmlElement
    private BigDecimal precio;


    public BigInteger getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(BigInteger cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
