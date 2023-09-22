/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import DTOS.ComprasDto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Rosas
 */
public class ComprasDao {
     Connection cn = Conexion.getConnection();
     public DefaultTableModel mostrarCompras(ComprasDto compraDto) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Artículo", "Cantidad","Descripcion","Fecha"};
            String[] usuDto = new String[7];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarCompras(?)}");
            cst.setString(1, compraDto.getArticulo());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                   // compras (idcompras,articulo,cantidad,descripcion,fecha) 

                usuDto[0] = rs.getString("idcompras");
                usuDto[1] = rs.getString("articulo");
                usuDto[2] = rs.getString("cantidad");
                usuDto[3] = rs.getString("descripcion");
                usuDto[4] = rs.getString("fecha");
               
                miModelo.addRow(usuDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarCompras(ComprasDto compras) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarCompras(?,?,?,?)}");
            cst.setString(1, compras.getArticulo());
            cst.setString(2, compras.getCantidad());
            cst.setString(3, compras.getDescripcion());
            cst.setString(4, compras.getFecha());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String editarCompras(ComprasDto compras) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call editarCompras(?,?,?,?,?)}");
            cst.setInt(1, compras.getIdcompras());
            cst.setString(2, compras.getArticulo());
            cst.setString(3, compras.getCantidad());
            cst.setString(4, compras.getDescripcion());
            cst.setString(5, compras.getFecha());
           
            cst.executeUpdate();
            msg = "Se actualizo de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarCompras(ComprasDto compras) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarCompras(?)}");
            cst.setInt(1, compras.getIdcompras());
            cst.executeUpdate();
            msg = "Se elimino de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
}
