/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOS;

/**
 *
 * @author Rafael Rosas
 */
public class CubiculosDto {
     private int id_Cubi;
    private String codigoCubi;
    private String impresora;
    private String fi;
    private String silla;
    private String fs;
    private String mesa;
    private String fm;
    private String pc;
    private String fpc;
    private String librero;
    private String fli;
    private String boteBa;
    private String fbb;
    private String CentroMan;
    private String fcm;
    private String ubi;
    private String obser;
    
    public CubiculosDto(){
        
    }

    public CubiculosDto(int id_Cubi, String codigoCubi, String impresora, String fi, String silla, String fs, String mesa, String fm, String pc, String fpc, String librero, String fli, String boteBa, String fbb, String CentroMan, String fcm, String ubi, String obser) {
        this.id_Cubi = id_Cubi;
        this.codigoCubi = codigoCubi;
        this.impresora = impresora;
        this.fi = fi;
        this.silla = silla;
        this.fs = fs;
        this.mesa = mesa;
        this.fm = fm;
        this.pc = pc;
        this.fpc = fpc;
        this.librero = librero;
        this.fli = fli;
        this.boteBa = boteBa;
        this.fbb = fbb;
        this.CentroMan = CentroMan;
        this.fcm = fcm;
        this.ubi = ubi;
        this.obser = obser;
    }

    public int getId_Cubi() {
        return id_Cubi;
    }

    public void setId_Cubi(int id_Cubi) {
        this.id_Cubi = id_Cubi;
    }

    public String getCodigoCubi() {
        return codigoCubi;
    }

    public void setCodigoCubi(String codigoCubi) {
        this.codigoCubi = codigoCubi;
    }

    public String getImpresora() {
        return impresora;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getFpc() {
        return fpc;
    }

    public void setFpc(String fpc) {
        this.fpc = fpc;
    }

    public String getLibrero() {
        return librero;
    }

    public void setLibrero(String librero) {
        this.librero = librero;
    }

    public String getFli() {
        return fli;
    }

    public void setFli(String fli) {
        this.fli = fli;
    }

    public String getBoteBa() {
        return boteBa;
    }

    public void setBoteBa(String boteBa) {
        this.boteBa = boteBa;
    }

    public String getFbb() {
        return fbb;
    }

    public void setFbb(String fbb) {
        this.fbb = fbb;
    }

    public String getCentroMan() {
        return CentroMan;
    }

    public void setCentroMan(String CentroMan) {
        this.CentroMan = CentroMan;
    }

    public String getFcm() {
        return fcm;
    }

    public void setFcm(String fcm) {
        this.fcm = fcm;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

  
}
