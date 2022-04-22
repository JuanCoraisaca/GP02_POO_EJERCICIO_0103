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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       var proveedor = new Proveedor();
       var proveedor2 = new Proveedor();
       
       //PROVEEDOR
       proveedor.setCedula("0192837623");
       proveedor.setDireccion("Miraflores");
       proveedor.setNombre("Juan");
       proveedor2.setCedula("030484723");
       proveedor2.setDireccion("Calle Larga");
       proveedor2.setNombre("Patricio");
       
        System.out.println("La cedula del proveedor es: " + proveedor.validarCedula());
        System.out.println("La direccion del proveedor es: " + proveedor.getDireccion());
        System.out.println("El nombre del proveedor es: " + proveedor.getNombre());
        System.out.println("---------------------------------------------------------------");
        System.out.println("La cedula del proveedor es: " + proveedor2.validarCedula());
        System.out.println("El nombre del proveedor es: " + proveedor2.getNombre());
        System.out.println("La direccion del proveedor es: " + proveedor2.getDireccion());
        System.out.println("---------------------------------------------------------------");
        
        //PRODUCTO
        var producto = new Producto();
        var producto2= new Producto();
        
        producto.setCodigoBarra(128);
        producto.setPeso(87);
        producto.setPrecio(60);
        producto2.setCodigoBarra(345);
        producto2.setPeso(45);
        producto2.setPrecio(30);
        
        System.out.println("El codigo de barra es: " + producto.getCodigoBarra() );
        System.out.println("El peso es: " + producto.getPeso());
        System.out.println("El precio " + producto.getPrecio());
        System.out.println("El producto es " + producto.esCostoso(60));
        System.out.println("El codigo de barra es: " + producto2.getCodigoBarra() );
        System.out.println("El peso es: " + producto2.getPeso());
        System.out.println("El precio " + producto2.getPrecio());
        System.out.println("El producto es " + producto2.esCostoso(30));
        
       
       
    }
    
}
