package com.facturacion.gt.ws.response.producto;

import com.facturacion.gt.orm.Producto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="respListProducto")
public class RespListProducto {
    @XmlElement
    private String codResp;
    @XmlElement
    private String DescResp;
    @XmlElement
    private List<Producto> productoList;

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public String getCodResp() {
        return codResp;
    }

    public void setCodResp(String codResp) {
        this.codResp = codResp;
    }

    public String getDescResp() {
        return DescResp;
    }

    public void setDescResp(String descResp) {
        DescResp = descResp;
    }
}
