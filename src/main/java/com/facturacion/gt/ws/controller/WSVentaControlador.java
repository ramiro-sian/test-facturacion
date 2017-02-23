package com.facturacion.gt.ws.controller;

import com.facturacion.gt.service.venta.ProcesaVenta;
import com.facturacion.gt.ws.request.venta.ReqVenta;
import com.facturacion.gt.ws.response.venta.RespListVenta;
import com.facturacion.gt.ws.response.venta.RespVenta;

import javax.ws.rs.*;

/**
 * Created by Ramiro on 22/02/2017.
 */
@Path("venta")
public class WSVentaControlador {

    @GET
    @Path("/consulta")
    @Consumes({"application/json", "application/xml"})
    @Produces({"application/json", "application/xml"})
    public RespListVenta getIt(ReqVenta request) {
        ProcesaVenta procesa = new ProcesaVenta();
        return procesa.consulta(request);
    }


    @POST
    @Path("/ejecuta")
    @Consumes({"application/json", "application/xml"})
    @Produces({"application/json", "application/xml"})
    public RespVenta execute(ReqVenta request) {
        ProcesaVenta venta = new ProcesaVenta();
        return venta.procesa(request);
    }
}
