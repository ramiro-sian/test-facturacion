package com.facturacion.gt.dao;

import com.facturacion.gt.orm.Producto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

    /**
     * Created by Ramiro on 22/02/2017.
     */
    public class DAOProducto {

        public static List<Producto> getProductos(Producto producto){
            List<Producto> respuesta = new LinkedList<Producto>();
            /**TODO implemtar logica*/
            Producto dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000001));
            dProducto.setMarca("BIC");
            dProducto.setDescripcion("Lapicero color azul");
            dProducto.setPrecio(BigDecimal.valueOf(2.50));
            respuesta.add(dProducto);
            dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000002));
            dProducto.setMarca("BIC");
            dProducto.setDescripcion("Lapicero color negro");
            dProducto.setPrecio(BigDecimal.valueOf(2.75));
            respuesta.add(dProducto);
            dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000003));
            dProducto.setMarca("BIC");
            dProducto.setDescripcion("Lapicero color rojo");
            dProducto.setPrecio(BigDecimal.valueOf(2.70));
            respuesta.add(dProducto);
            dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000011));
            dProducto.setMarca("PILOT");
            dProducto.setDescripcion("Lapicero color azul");
            dProducto.setPrecio(BigDecimal.valueOf(5.00));
            respuesta.add(dProducto);
            dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000012));
            dProducto.setMarca("PILOT");
            dProducto.setDescripcion("Lapicero color negro");
            dProducto.setPrecio(BigDecimal.valueOf(5.50));
            respuesta.add(dProducto);
            dProducto = new Producto();
            dProducto.setCod_producto(BigInteger.valueOf(310000013));
            dProducto.setMarca("PILOT");
            dProducto.setDescripcion("Lapicero color rojo");
            dProducto.setPrecio(BigDecimal.valueOf(5.25));
            respuesta.add(dProducto);
            return respuesta;
        }


}
