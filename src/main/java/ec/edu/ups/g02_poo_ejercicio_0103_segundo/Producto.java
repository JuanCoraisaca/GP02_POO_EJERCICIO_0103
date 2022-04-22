/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_poo_ejercicio_0103_segundo;

/**
 *
 * @author usuario
 */
public class Producto {
    private int codigoBarra;
    private int precio;
    private float peso;
    
    public String esCostoso(int costoMaximo){
        var retorno = "IBD";
        if(this.precio>=costoMaximo){
            retorno = "Es costoso";
            
        }else{
            if(this.precio<= costoMaximo)
            retorno="No es costoso";
            
        }
        return retorno;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

   
    
}
