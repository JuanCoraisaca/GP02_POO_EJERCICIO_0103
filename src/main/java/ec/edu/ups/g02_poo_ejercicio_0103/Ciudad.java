/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_poo_ejercicio_0103;

/**
 *
 * @author usuario
 */
public class Ciudad {
    private String nombre;
    private int numeroParroquias;
    private int yearFundacion;
    
    public int calcularYearFundacion(){
        var retorno=1000;
        retorno=2022-this.yearFundacion;
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public int getNumeroParroquias() {
        return numeroParroquias;
    }

    public void setNumeroParroquias(int numeroParroquias) {
        this.numeroParroquias = numeroParroquias;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(int yearFundacion) {
        this.yearFundacion = yearFundacion;
    }
    
    
}
