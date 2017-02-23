package com.facturacion.gt.ws.request.cliente;

import com.facturacion.gt.orm.Cliente;

/**
 * Created by Ramiro on 22/02/2017.
 */
public class ReqCliente {
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
