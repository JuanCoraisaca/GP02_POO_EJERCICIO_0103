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
public class Pais {
    private double poblacion; 
    private double limiteTerritorial;
    private String continente; 
    
    public boolean esContinenteEuropeo(){
        var retorno = true;
        
        if(this.continente== "Ecuador"){
            return false;
        }else{
            if(this.continente=="Italia"){
                return true;
            }
        }
        return retorno;
                
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public double getLimiteTerritorial() {
        return limiteTerritorial;
    }

    public void setLimiteTerritorial(double limiteTerritorial) {
        this.limiteTerritorial = limiteTerritorial;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    

}
