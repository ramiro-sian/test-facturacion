package com.facturacion.gt.orm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="venta")
public class Venta {
    @XmlElement
    private String factura;
    @XmlElement
    private BigInteger cod_cliente;
    @XmlElement
    private List<ProductoDetalle> listado_producto;
    @XmlElement
    private BigDecimal subtotal;
    @XmlElement
    private BigDecimal iva;
    @XmlElement
    private BigDecimal total;
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


    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public BigInteger getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(BigInteger cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public List<ProductoDetalle> getListado_producto() {
        return listado_producto;
    }

    public void setListado_producto(List<ProductoDetalle> listado_producto) {
        this.listado_producto = listado_producto;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
}
