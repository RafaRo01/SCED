/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;
import DTOS.SalonesDto;
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
public class SalonesDao {
    Connection cn = Conexion.getConnection();

    public DefaultTableModel mostrarSalones(SalonesDto salones) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Salón", "Piza","FP","Silla","FS","Mesa","FM","PC","FPC", "Proyec", "FPR", "Basu", "FBB", "MesaBanco", "FMB", "Clima", "Luz", "Ubi", "Obser"};
            String[] salonDto = new String[21];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarSalones(?)}");
            cst.setString(1, salones.getCodigoSalon());
                  ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                    //id_salon, codigoSalon, pizarron, f, silla, fs, mesa, fm, pc, fpc, proyector, fpro, bBasura, fbb, mesaBan, fmb, clima, luz, ubi, obser
                salonDto[0] = rs.getString("id_salon");
                salonDto[1] = rs.getString("codigoSalon");
                salonDto[2] = rs.getString("pizarron");
                salonDto[3] = rs.getString("f");
                salonDto[4] = rs.getString("silla");
                salonDto[5] = rs.getString("fs");
                salonDto[6] = rs.getString("mesa");
                salonDto[7] = rs.getString("fm");
                salonDto[8] = rs.getString("pc");
                salonDto[9] = rs.getString("fpc");
                salonDto[10] = rs.getString("proyector");
                salonDto[11] = rs.getString("fpro");
                salonDto[12] = rs.getString("bBasura");
                salonDto[13] = rs.getString("fbb");
                salonDto[14] = rs.getString("mesaBan");
                salonDto[15] = rs.getString("fmb");
                salonDto[16] = rs.getString("clima");
                salonDto[17] = rs.getString("luz");
                salonDto[18] = rs.getString("ubi");
                salonDto[19] = rs.getString("obser");
                
                miModelo.addRow(salonDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarSalones(SalonesDto salones) {
        String msg = null;
        try { //11 para 11
            // idsalon,codigoSalon,pizarron,f,silla,fs,mesa,fm,pc,fpc,proyector,fpro,bBasura,fbb,mesaBan,fmb,clima,luz,ubi,obser
            CallableStatement cst = cn.prepareCall("{Call insertarSalones(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString(1, salones.getCodigoSalon());
            cst.setInt(2, salones.getPizarron());
            cst.setString(3, salones.getF());
            cst.setInt(4, salones.getSilla());
            cst.setString(5, salones.getFs());
            cst.setInt(6, salones.getMesa());
            cst.setString(7, salones.getFm());
            cst.setInt(8, salones.getPc());
            cst.setString(9, salones.getFpc());
            cst.setInt(10, salones.getProyector());
            cst.setString(11, salones.getFpro());
            cst.setInt(12, salones.getbBasura());
            cst.setString(13, salones.getFbb());
            cst.setInt(14, salones.getMesaBan());
            cst.setString(15, salones.getFmb());
            cst.setString(16, salones.getClima());
            cst.setString(17, salones.getLuz());
            cst.setString(18, salones.getUbi());
            cst.setString(19, salones.getObser());
            cst.executeUpdate();
            msg = "Salón Registrado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String editarSalones(SalonesDto salones) {
        String msg = null;
        try {
            // idsalon,codigoSalon,pizarron,f,silla,fs,mesa,fm,pc,fpc,proyector,fpro,bBasura,fbb,mesaBan,fmb,clima,luz,ubi,obser  20

            CallableStatement cst = cn.prepareCall("{Call editarSalones(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setInt(1, salones.getId_salon());
            cst.setString(2, salones.getCodigoSalon());
            cst.setInt(3, salones.getPizarron());
            cst.setString(4, salones.getF());
            cst.setInt(5, salones.getSilla());
            cst.setString(6, salones.getFs());
            cst.setInt(7, salones.getMesa());
            cst.setString(8, salones.getFm());
            cst.setInt(9, salones.getPc());
            cst.setString(10, salones.getFpc());
            cst.setInt(11, salones.getProyector());
            cst.setString(12, salones.getFpro());
            cst.setInt(13, salones.getbBasura());
            cst.setString(14, salones.getFbb());
            cst.setInt(15, salones.getMesaBan());
            cst.setString(16, salones.getFmb());
            cst.setString(17, salones.getClima());
            cst.setString(18, salones.getLuz());
            cst.setString(19, salones.getUbi());
            cst.setString(20, salones.getObser());
            cst.executeUpdate();
            msg = "Salón Actualizado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarUsuarios(SalonesDto salones) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarSalones(?)}");
            cst.setInt(1, salones.getId_salon());
            cst.executeUpdate();
            msg = "Salón Eliminado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    
}
