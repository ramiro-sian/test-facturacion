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
@XmlRootElement(name="proveedor")
public class Proveedor {
    @XmlElement
    private BigInteger cod_proveedor;
    @XmlElement
    private BigInteger telefono;
    @XmlElement
    private String nit;
    @XmlElement
    private String nombre1;
    @XmlElement
    private String nombre2;
    @XmlElement
    private String apellido1;
    @XmlElement
    private String apellido2;
    @XmlElement
    private String direccion;
    @XmlElement
    private String tipo;
    @XmlElement
    private String email;
    @XmlElement
    private String estado;
    @XmlElement
    private Timestamp fecha_creacion;
    @XmlElement
    private String usuario_creacion;
    @XmlElement
    private Timestamp fecha_modificacion;
    @XmlElement
    private String usuario_modifica;



    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Timestamp getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Timestamp fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getUsuario_modifica() {
        return usuario_modifica;
    }

    public void setUsuario_modifica(String usuario_modifica) {
        this.usuario_modifica = usuario_modifica;
    }

    public BigInteger getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(BigInteger cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }
}
