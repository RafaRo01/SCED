/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOS;

import java.sql.Date;

/**
 *
 * @author Rafael Rosas
 */
public class ComprasDto {
   // compras (idcompras,articulo,cantidad,descripcion,fecha) 
    int idcompras;
    String articulo;
    String cantidad;
    String descripcion;
    String fecha;

    public ComprasDto() {
    }

    public ComprasDto(int idcompras, String articulo, String cantidad, String descripcion, String fecha) {
        this.idcompras = idcompras;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdcompras() {
        return idcompras;
    }

    public void setIdcompras(int idcompras) {
        this.idcompras = idcompras;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
   
    
}
