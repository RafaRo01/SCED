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
public class SalonesDto {
    int id_salon;
    String codigoSalon;
    int pizarron;
    String f;
    int silla;
    String fs;
    int mesa;
    String fm;
    int pc;
    String fpc;
    int proyector;
    String fpro;
    int bBasura;
    String fbb;
    int mesaBan;
    String fmb;
    String clima;
    String luz;
    String ubi;
    String obser;
    //id_salon, codigoSalon, pizarron, f, silla, fs, mesa, fm, pc, fpc, proyector, fpro, bBasura, fbb, mesaBan, fmb, clima, luz, ubi, obser 
    public SalonesDto(){
        
    }

    public SalonesDto(int id_salon, String codigoSalon, int pizarron, String f, int silla, String fs, int mesa, String fm, int pc, String fpc, int proyector, String fpro, int bBasura, String fbb, int mesaBan, String fmb, String clima, String luz, String ubi, String obser) {
        this.id_salon = id_salon;
        this.codigoSalon = codigoSalon;
        this.pizarron = pizarron;
        this.f = f;
        this.silla = silla;
        this.fs = fs;
        this.mesa = mesa;
        this.fm = fm;
        this.pc = pc;
        this.fpc = fpc;
        this.proyector = proyector;
        this.fpro = fpro;
        this.bBasura = bBasura;
        this.fbb = fbb;
        this.mesaBan = mesaBan;
        this.fmb = fmb;
        this.clima = clima;
        this.luz = luz;
        this.ubi = ubi;
        this.obser = obser;
    }

    public int getId_salon() {
        return id_salon;
    }

    public void setId_salon(int id_salon) {
        this.id_salon = id_salon;
    }

    public String getCodigoSalon() {
        return codigoSalon;
    }

    public void setCodigoSalon(String codigoSalon) {
        this.codigoSalon = codigoSalon;
    }

    public int getPizarron() {
        return pizarron;
    }

    public void setPizarron(int pizarron) {
        this.pizarron = pizarron;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public String getFpc() {
        return fpc;
    }

    public void setFpc(String fpc) {
        this.fpc = fpc;
    }

    public int getProyector() {
        return proyector;
    }

    public void setProyector(int proyector) {
        this.proyector = proyector;
    }

    public String getFpro() {
        return fpro;
    }

    public void setFpro(String fpro) {
        this.fpro = fpro;
    }

    public int getbBasura() {
        return bBasura;
    }

    public void setbBasura(int bBasura) {
        this.bBasura = bBasura;
    }

    public String getFbb() {
        return fbb;
    }

    public void setFbb(String fbb) {
        this.fbb = fbb;
    }

    public int getMesaBan() {
        return mesaBan;
    }

    public void setMesaBan(int mesaBan) {
        this.mesaBan = mesaBan;
    }

    public String getFmb() {
        return fmb;
    }

    public void setFmb(String fmb) {
        this.fmb = fmb;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getLuz() {
        return luz;
    }

    public void setLuz(String luz) {
        this.luz = luz;
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
