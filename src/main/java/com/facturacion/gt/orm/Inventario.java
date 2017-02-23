package com.facturacion.gt.orm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="inventario")
public class Inventario {

    @XmlElement
    private BigInteger cod_producto;
    @XmlElement
    private BigInteger ingreso;
    @XmlElement
    private BigInteger egreso;
    @XmlElement
    private BigInteger existencia;
    @XmlElement
    private String estado;
    @XmlElement
    private String observacion;
    @XmlElement
    private Timestamp fecha_creacion;
    @XmlElement
    private String usuario_creacion;


    public BigInteger getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(BigInteger cod_producto) {
        this.cod_producto = cod_producto;
    }

    public BigInteger getIngreso() {
        return ingreso;
    }

    public void setIngreso(BigInteger ingreso) {
        this.ingreso = ingreso;
    }

    public BigInteger getEgreso() {
        return egreso;
    }

    public void setEgreso(BigInteger egreso) {
        this.egreso = egreso;
    }

    public BigInteger getExistencia() {
        return existencia;
    }

    public void setExistencia(BigInteger existencia) {
        this.existencia = existencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
