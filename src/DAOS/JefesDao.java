/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;
import DTOS.JefesDto;
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
public class JefesDao {
    Connection cn = Conexion.getConnection();

    public DefaultTableModel mostrarJefes(JefesDto jefes) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Área", "Pizar","FP","Mesa","Fm","Silla","FS","PC","FP", "Lib", "FL", "Basu", "FBB", "Baño", "FB", "Mueble", "FM", "Impre", "FI", "Ubi", "Obser"};
            String[] jefDto = new String[22];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarJefes(?)}");
            cst.setString(1, jefes.getCodigoJ());
                  ResultSet rs = cst.executeQuery();
            while (rs.next()) {
// jefes (id_je,codigoJ,pizarron,fp,mesa,fm,silla,fs,pc,fpc,librero,fli,boteBa,fbb,baño,fba,mueble,fmu,impresora,fi,ubi,obser)

                jefDto[0] = rs.getString("id_je");
                jefDto[1] = rs.getString("codigoJ");
                jefDto[2] = rs.getString("pizarron");
                jefDto[3] = rs.getString("fp");
                jefDto[4] = rs.getString("mesa");
                jefDto[5] = rs.getString("fm");
                jefDto[6] = rs.getString("silla");
                jefDto[7] = rs.getString("fs");
                jefDto[8] = rs.getString("pc");
                jefDto[9] = rs.getString("fpc");
                jefDto[10] = rs.getString("librero");
                jefDto[11] = rs.getString("fli");
                jefDto[12] = rs.getString("boteBa");
                jefDto[13] = rs.getString("fbb");
                jefDto[14] = rs.getString("baño");
                jefDto[15] = rs.getString("fba");
                jefDto[16] = rs.getString("mueble");
                jefDto[17] = rs.getString("fmu");
                jefDto[18] = rs.getString("impresora");
                jefDto[19] = rs.getString("fi");
                jefDto[20] = rs.getString("ubi");
                jefDto[21] = rs.getString("obser");
                
                miModelo.addRow(jefDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarJefes(JefesDto jefes) {
        String msg = null;
        try { 
            // jefes (id_je,codigoJ,pizarron,fp,mesa,fm,silla,fs,pc,fpc,librero,fli,boteBa,fbb,baño,fba,mueble,fmu,impresora,fi,ubi,obser)

            CallableStatement cst = cn.prepareCall("{Call insertarJefes(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString(1, jefes.getCodigoJ());
            cst.setString(2, jefes.getPizarron());
            cst.setString(3, jefes.getFp());
            cst.setString(4, jefes.getMesa());
            cst.setString(5, jefes.getFm());
            cst.setString(6, jefes.getSilla());
            cst.setString(7, jefes.getFs());
            cst.setString(8, jefes.getPc());
            cst.setString(9, jefes.getFpc());
            cst.setString(10, jefes.getLibrero());
            cst.setString(11, jefes.getFli());
            cst.setString(12, jefes.getBoteBa());
            cst.setString(13, jefes.getFbb());
            cst.setString(14, jefes.getBaño());
            cst.setString(15, jefes.getFba());
            cst.setString(16, jefes.getMueble());
            cst.setString(17, jefes.getFmu());
            cst.setString(18, jefes.getImpresora());
            cst.setString(19, jefes.getFi());
            cst.setString(20, jefes.getUbi());
            cst.setString(21, jefes.getObser());
            cst.executeUpdate();
            msg = "Área Registrada";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String editarJefes(JefesDto jefes) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call editarJefes(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setInt(1, jefes.getId_je());
            cst.setString(2, jefes.getCodigoJ());
            cst.setString(3, jefes.getPizarron());
            cst.setString(4, jefes.getFp());
            cst.setString(5, jefes.getMesa());
            cst.setString(6, jefes.getFm());
            cst.setString(7, jefes.getSilla());
            cst.setString(8, jefes.getFs());
            cst.setString(9, jefes.getPc());
            cst.setString(10, jefes.getFpc());
            cst.setString(11, jefes.getLibrero());
            cst.setString(12, jefes.getFli());
            cst.setString(13, jefes.getBoteBa());
            cst.setString(14, jefes.getFbb());
            cst.setString(15, jefes.getBaño());
            cst.setString(16, jefes.getFba());
            cst.setString(17, jefes.getMueble());
            cst.setString(18, jefes.getFmu());
            cst.setString(19, jefes.getImpresora());
            cst.setString(20, jefes.getFi());
            cst.setString(21, jefes.getUbi());
            cst.setString(22, jefes.getObser());
            
            cst.executeUpdate();
            msg = "Área Actualizado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarUsuarios(JefesDto jefes) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarJefes(?)}");
            cst.setInt(1, jefes.getId_je());
            cst.executeUpdate();
            msg = "Área Eliminado";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
    
    
    
    
}
