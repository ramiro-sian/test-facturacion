package com.facturacion.gt.ws.response.compra;

import com.facturacion.gt.orm.Compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="respCompra")
public class RespListCompra {
    @XmlElement
    private String codResp;
    @XmlElement
    private String DescResp;
    @XmlElement
    private List<Compra> compras;

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

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
