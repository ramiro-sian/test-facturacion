package com.facturacion.gt.dao;

import com.facturacion.gt.orm.Producto;
import com.facturacion.gt.orm.ProductoDetalle;
import com.facturacion.gt.orm.Venta;
import com.facturacion.gt.ws.request.venta.ReqVenta;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ramiro on 22/02/2017.
 */
public class DAOVenta {
    Logger logger = LoggerFactory.getLogger(DAOVenta.class);
    public List<Venta> consulta(ReqVenta reqVenta){
        List<Venta> respuesta = new LinkedList<Venta>();
        /**TODO Implementar logica de consulta a la DB*/
        try {
            Venta venta = new Venta();
            venta.setCod_cliente(BigInteger.valueOf(00011101));
            venta.setEstado("A");
            venta.setFactura("F0-000001");
            venta.setListado_producto(getListadoProductoDetalle());
            venta.setTotal(BigDecimal.valueOf(1500.00));
            respuesta.add(venta);
        }catch (Exception e){
            logger.error("Error metodo consulta",e);
        }
        return respuesta;
    }

    private static List<ProductoDetalle> getListadoProductoDetalle(){
        List<ProductoDetalle> respuesta = new LinkedList<ProductoDetalle>();
        List<Producto> lstProducto = DAOProducto.getProductos(null);
        ProductoDetalle detalle = null;
        for(int size = 0; size < lstProducto.size();size++){
            detalle = new ProductoDetalle();
            detalle.setCantidad(BigInteger.valueOf(500*size));
            detalle.setProducto(lstProducto.get(size));
            respuesta.add(detalle);
        }

        return respuesta;
    }

    public int ejecutaVenta(ReqVenta reqVenta){
        /**TODO Implementar logica de insert a la DB*/
        DAOInventario inventario = new DAOInventario();
        inventario.ejecutaInventarioVenta(reqVenta.getVenta());

        return 1;
    }

    public int eliminaVenta(ReqVenta reqVenta){
        /**TODO Implementar logica de insert a la DB*/
        return 1;
    }


}
