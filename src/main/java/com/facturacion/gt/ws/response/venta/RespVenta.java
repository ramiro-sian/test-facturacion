package com.facturacion.gt.ws.response.venta;

import com.facturacion.gt.orm.Venta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="respVenta")
public class RespVenta {
    @XmlElement
    private String codResp;
    @XmlElement
    private String DescResp;

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
