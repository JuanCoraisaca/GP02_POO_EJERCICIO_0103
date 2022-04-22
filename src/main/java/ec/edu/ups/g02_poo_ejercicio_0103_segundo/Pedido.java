/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_poo_ejercicio_0103_segundo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Pedido {
    private int numeroPedido;
    private Date fechaRealizacion;
    private Date fechaEntrega;
    
    public int calcularFechaLlegada(){
        return LocalDate.now().getDayOfMonth()-this.fechaRealizacion;
        
        
        
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
