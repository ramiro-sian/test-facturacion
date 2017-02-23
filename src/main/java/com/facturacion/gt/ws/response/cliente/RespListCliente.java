package com.facturacion.gt.ws.response.cliente;

import com.facturacion.gt.orm.Cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="respListCliente")
public class RespListCliente {
    @XmlElement
    private String codResp;
    @XmlElement
    private String DescResp;
    @XmlElement
    private List<Cliente> cliente;

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
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
