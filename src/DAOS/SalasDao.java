/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;
import DTOS.SalasDto;
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
public class SalasDao {
  Connection cn = Conexion.getConnection();

    public DefaultTableModel mostrarSalas(SalasDto salas) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Sala", "Pizar","F","Silla","F","Mesa","F","PC","F","Proy","F", "Lib", "F", "Basu", "FBB", "Microo", "F",
                "Cafet", "F", "Tv", "F","Refri","F","G.Agua","F", "Ubi", "Obser"};
            String[] jefDto = new String[30];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarSalas(?)}");
            cst.setString(1, salas.getCodSal());
                  ResultSet rs = cst.executeQuery();
            while (rs.next()) {
//salas(id_Sa,codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )

                jefDto[0] = rs.getString("id_Sa");
                jefDto[1] = rs.getString("codSa");
                jefDto[2] = rs.getString("pizar");
                jefDto[3] = rs.getString("fp");
                jefDto[4] = rs.getString("silla");
                jefDto[5] = rs.getString("fs");
                jefDto[6] = rs.getString("mesa");
                jefDto[7] = rs.getString("fm");
                jefDto[8] = rs.getString("pc");
                jefDto[9] = rs.getString("fpc");
                jefDto[10] = rs.getString("proyec");
                jefDto[11] = rs.getString("fpro");
                jefDto[12] = rs.getString("lib");
                jefDto[13] = rs.getString("fli");
                jefDto[14] = rs.getString("boteBa");
                jefDto[15] = rs.getString("fbb");
                jefDto[16] = rs.getString("microo");
                jefDto[17] = rs.getString("fmic");
                jefDto[18] = rs.getString("cafet");
                jefDto[19] = rs.getString("fcaf");
                jefDto[20] = rs.getString("tv");
                jefDto[21] = rs.getString("ftv");
                jefDto[22] = rs.getString("refri");
                jefDto[23] = rs.getString("fref");
                jefDto[24] = rs.getString("gAgua");
                jefDto[25] = rs.getString("fag");
                jefDto[26] = rs.getString("ubi");
                jefDto[27] = rs.getString("obser");
          
                
                
                miModelo.addRow(jefDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarSalas2(SalasDto salas) {
        String msg = null;
        try { 
//salas(id_Sa,codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )

            CallableStatement cst = cn.prepareCall("{Call insertarSalas(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString(1, salas.getCodSal());
            cst.setString(2, salas.getPizar());
            cst.setString(3, salas.getFp());
            cst.setString(4, salas.getSilla());
            cst.setString(5, salas.getFs());
            cst.setString(6, salas.getMesa());
            cst.setString(7, salas.getFm());
            cst.setString(8, salas.getPc());
            cst.setString(9, salas.getFpc());
            cst.setString(10, salas.getProyec());
            cst.setString(11, salas.getFpro());
            cst.setString(12, salas.getLib());
            cst.setString(13, salas.getFli());
            cst.setString(14, salas.getBoteBa());
            cst.setString(15, salas.getFbb());
            cst.setString(16, salas.getMicroo());
            cst.setString(17, salas.getFmic());
            cst.setString(18, salas.getCafet());
            cst.setString(19, salas.getFcaf());
            cst.setString(20, salas.getTv());
            cst.setString(21, salas.getFtv());
            cst.setString(22, salas.getRefri());
            cst.setString(23, salas.getFref());
            cst.setString(24, salas.getgAgua());
            cst.setString(25, salas.getFag());
            cst.setString(26, salas.getUbi());
            cst.setString(27, salas.getObser());
            cst.executeUpdate();
            msg = "Sala Registrada";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String editarSalas(SalasDto salas) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call editarSalas(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            //salas(id_Sa,codSa,pizar,fp,silla,fs,mesa,fm,pc,fpc,proyec,fpro,lib,fli,boteBa,fbb,microo,fmic,cafet,fcaf,tv,ftv,refri,fref,gAgua,fag,ubi,obser )

            cst.setInt(1, salas.getId_sal());
            cst.setString(2, salas.getCodSal());
            cst.setString(3, salas.getPizar());
            cst.setString(4, salas.getFp());
            cst.setString(5, salas.getSilla());
            cst.setString(6, salas.getFs());
            cst.setString(7, salas.getMesa());
            cst.setString(8, salas.getFm());
            cst.setString(9, salas.getPc());
            cst.setString(10, salas.getFpc());
            cst.setString(11, salas.getProyec());
            cst.setString(12, salas.getFpro());
            cst.setString(13, salas.getLib());
            cst.setString(14, salas.getFli());
            cst.setString(15, salas.getBoteBa());
            cst.setString(16, salas.getFbb());
            cst.setString(17, salas.getMicroo());
            cst.setString(18, salas.getFmic());
            cst.setString(19, salas.getCafet());
            cst.setString(20, salas.getFcaf());
            cst.setString(21, salas.getTv());
            cst.setString(22, salas.getFtv());
            cst.setString(23, salas.getRefri());
            cst.setString(24, salas.getFref());
            cst.setString(25, salas.getgAgua());
            cst.setString(26, salas.getFag());
            cst.setString(27, salas.getUbi());
            cst.setString(28, salas.getObser());
            
            cst.executeUpdate();
            msg = "Sala Actualizada";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarSalas(SalasDto salas) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarSalas(?)}");
            cst.setInt(1, salas.getId_sal());
            cst.executeUpdate();
            msg = "Sala Eliminada";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
      
}
