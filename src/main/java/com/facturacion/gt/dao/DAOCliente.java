package com.facturacion.gt.dao;

import com.facturacion.gt.orm.Cliente;
import com.facturacion.gt.ws.request.cliente.ReqCliente;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ramiro on 22/02/2017.
 */
public class DAOCliente {
    public List<Cliente> consulta(ReqCliente reqCliente){
        List<Cliente> respuesta = new LinkedList<Cliente>();
        /**TODO Implementar logica de consulta a la DB*/

        return respuesta;
    }

    public int ejecutaCliente(ReqCliente reqCliente){
        /**TODO Implementar logica de insert a la DB*/


        return 1;
    }

    public int eliminaCliente(ReqCliente reqCliente){
        /**TODO Implementar logica de insert a la DB*/
        return 1;
    }


}
