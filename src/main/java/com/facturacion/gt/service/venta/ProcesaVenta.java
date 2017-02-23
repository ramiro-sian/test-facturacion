package com.facturacion.gt.service.venta;

import com.facturacion.gt.dao.DAOVenta;
import com.facturacion.gt.ws.request.venta.ReqVenta;
import com.facturacion.gt.ws.response.venta.RespListVenta;
import com.facturacion.gt.ws.response.venta.RespVenta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ramiro on 22/02/2017.
 */

public class ProcesaVenta {

    Logger logger = LoggerFactory.getLogger(DAOVenta.class);
    public RespListVenta consulta(ReqVenta reqVenta){
        RespListVenta respuesta = new RespListVenta();
        try {
            DAOVenta venta = new DAOVenta();
            respuesta.setVentas(venta.consulta(reqVenta));
            respuesta.setCodResp("210");
            respuesta.setDescResp("Consulta realizada Exitosamente");
        }catch (Exception e){
            logger.error("Error en clase consulta",e);
        }
        return respuesta;
    }

    public RespVenta procesa(ReqVenta reqVenta){
        DAOVenta venta = new DAOVenta();
        int resp = venta.ejecutaVenta(reqVenta);
        RespVenta respuesta = new RespVenta();
        if(resp<0){
            respuesta.setCodResp("210");
            respuesta.setDescResp("Venta procesada exitosamente");
        }else{
            respuesta.setCodResp("510");
            respuesta.setDescResp("Ocurrio un error al procesar la venta");
        }

        return respuesta;
    }
}
