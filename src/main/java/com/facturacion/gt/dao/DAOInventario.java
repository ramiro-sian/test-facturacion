package com.facturacion.gt.dao;

import com.facturacion.gt.orm.*;
import com.facturacion.gt.ws.request.venta.ReqVenta;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
public class DAOInventario {

    public int ejecutaInventarioVenta(Venta venta){
        Inventario inventario = new Inventario();


        /**TODO Esto preferiria reemplazarlo con la ejecucion de un PL en la DB*/
        for(int size =0; size>venta.getListado_producto().size();size++){
            inventario = new Inventario();
            ProductoDetalle detalle = venta.getListado_producto().get(size);
            inventario = getInventario(detalle.getProducto());
            inventario.setEgreso(detalle.getCantidad());
            BigInteger anterior = inventario.getExistencia();
            BigInteger actual = anterior.subtract(detalle.getCantidad());
            inventario.setExistencia(actual);
            updateInventario(inventario);
        }

        return 1;
    }

    public int ejejcutaInventarioCompra(Compra compra){
        Inventario inventario = new Inventario();
        /**TODO Esto preferiria reemplazarlo con la ejecucion de un PL en la DB*/
        for(int size =0; size>compra.getListado_producto().size();size++){
            inventario = new Inventario();
            ProductoDetalle detalle = compra.getListado_producto().get(size);
            inventario = getInventario(detalle.getProducto());
            inventario.setIngreso(detalle.getCantidad());
            BigInteger anterior = inventario.getExistencia();
            BigInteger actual = anterior.add(detalle.getCantidad());
            inventario.setExistencia(actual);
            updateInventario(inventario);
        }
        return 1;
    }

    private int updateInventario(Inventario inventario){

        /**TODO Implementar logica de update a la DB*/
        return 1;
    }

    public Inventario getInventario(Producto producto){
        Inventario respuesta = new Inventario();
        String query = "Select * from inventario where cod_producto ="+producto.getCod_producto();

        /**TODO implemntar algun framework como inbernate para ejecutar consultas*/

        return respuesta;
    }

}
