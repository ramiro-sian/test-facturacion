package com.facturacion.gt.ws.request.venta;

import com.facturacion.gt.orm.Venta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="reqVenta")
public class ReqVenta {
    @XmlElement
    private
    Venta venta;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
