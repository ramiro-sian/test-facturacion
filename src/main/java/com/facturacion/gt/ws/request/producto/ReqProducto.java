package com.facturacion.gt.ws.request.producto;

import com.facturacion.gt.orm.Producto;

/**
 * Created by Ramiro on 22/02/2017.
 */
public class ReqProducto {
    private Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
