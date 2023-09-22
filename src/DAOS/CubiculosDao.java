/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import DTOS.CubiculosDto;
import IMPORTANTE.Login;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author Rafael Rosas
 */
public class CubiculosDao {
     Connection cn = Conexion.getConnection();

    public DefaultTableModel mostrarSalones(CubiculosDto cubiDto) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Cubículo", "Impre","FI","Silla","FS","Mesa","FM",
                "PC","FPC", "Libero", "FLI", "Basu", "FBB", "Centro", "FCM", "Ubi", "Obser"};
            String[] salonDto = new String[21];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarCubiculos(?)}");
            cst.setString(1, cubiDto.getCodigoCubi());
                    //.getCodigoSalon());
                  ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                //    cubiculos (id_Cubi,codigoCubi, impresora,fi,silla,fs,mesa, fm,pc,fpc,librero,fli,boteBa,fbb,CentroMan,fcm  ,ubi,obser)
                salonDto[0] = rs.getString("id_Cubi");
                salonDto[1] = rs.getString("codigoCubi");
                salonDto[2] = rs.getString("impresora");
                salonDto[3] = rs.getString("fi");
                salonDto[4] = rs.getString("silla");
                salonDto[5] = rs.getString("fs");
                salonDto[6] = rs.getString("mesa");
                salonDto[7] = rs.getString("fm");
                salonDto[8] = rs.getString("pc");
                salonDto[9] = rs.getString("fpc");
                salonDto[10] = rs.getString("librero");
                salonDto[11] = rs.getString("fli");
                salonDto[12] = rs.getString("boteBa");
                salonDto[13] = rs.getString("fbb");
                salonDto[14] = rs.getString("CentroMan");
                salonDto[15] = rs.getString("fcm");
                salonDto[16] = rs.getString("ubi");
                salonDto[17] = rs.getString("obser");
                
                miModelo.addRow(salonDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarCubiculos(CubiculosDto cubiDto) {
        String msg = null;
        try { //11 para 11
            CallableStatement cst = cn.prepareCall("{Call insertarCubiculos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
         //    cubiculos (id_Cubi,codigoCubi, impresora,fi,silla,fs,mesa, fm,pc,fpc,librero,fli,boteBa,fbb,CentroMan,fcm  ,ubi,obser)
           cst.setString(1, cubiDto.getCodigoCubi());
           cst.setString(2, cubiDto.getImpresora());
           cst.setString(3, cubiDto.getFi());
           cst.setString(4, cubiDto.getSilla());
           cst.setString(5, cubiDto.getFs());
           cst.setString(6, cubiDto.getMesa());
           cst.setString(7, cubiDto.getFm());
           cst.setString(8, cubiDto.getPc());
           cst.setString(9, cubiDto.getFpc());
           cst.setString(10, cubiDto.getLibrero());
           cst.setString(11, cubiDto.getFli());
           cst.setString(12, cubiDto.getBoteBa());
           cst.setString(13, cubiDto.getFbb());
           cst.setString(14, cubiDto.getCentroMan());
           cst.setString(15, cubiDto.getFcm());
           cst.setString(16, cubiDto.getUbi());
           cst.setString(17, cubiDto.getObser());
             
            cst.executeUpdate();
            msg = "Salón Registrado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String editarCubiculos(CubiculosDto cubiDto) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call editarCubiculos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
           cst.setInt(1, cubiDto.getId_Cubi());
           cst.setString(2, cubiDto.getCodigoCubi());
           cst.setString(3, cubiDto.getImpresora());
           cst.setString(4, cubiDto.getFi());
           cst.setString(5, cubiDto.getSilla());
           cst.setString(6, cubiDto.getFs());
           cst.setString(7, cubiDto.getMesa());
           cst.setString(8, cubiDto.getFm());
           cst.setString(9, cubiDto.getPc());
           cst.setString(10, cubiDto.getFpc());
           cst.setString(11, cubiDto.getLibrero());
           cst.setString(12, cubiDto.getFli());
           cst.setString(13, cubiDto.getBoteBa());
           cst.setString(14, cubiDto.getFbb());
           cst.setString(15, cubiDto.getCentroMan());
           cst.setString(16, cubiDto.getFcm());
           cst.setString(17, cubiDto.getUbi());
           cst.setString(18, cubiDto.getObser());
           
            cst.executeUpdate();
            msg = "Salón Actualizado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarCubiculos(CubiculosDto cubiDto) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarCubiculos(?)}");
          cst.setInt(1,cubiDto.getId_Cubi());
            cst.executeUpdate();
            msg = "Salón Eliminado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

}
