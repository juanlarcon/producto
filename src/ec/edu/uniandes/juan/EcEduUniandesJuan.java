/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.juan;

import java.util.ArrayList;

/**
 *
 * @author Pc01
 */
public class EcEduUniandesJuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <clsproducto> prod = new ArrayList<>();
        clsproducto prod1 = new clsproducto(1, "clavo",20, clsproducto.unidad.libras);
        clsproducto prod2 = new clsproducto(2, "aceite",20, clsproducto.unidad.litro);
        clsproducto prod3 = new clsproducto(1, "zinc",20, clsproducto.unidad.metro);
        clsproducto prod4 = new clsproducto(1, "3 en 1",10, clsproducto.unidad.litro);
        clsproducto prod5 = new clsproducto(5, "lija",15, clsproducto.unidad.metro);
        
prod.add(prod1);
prod.add(prod2);
prod.add(prod3);
prod.add(prod4);
prod.add(prod5);
imprimir(prod);
    }
    public static void imprimir(ArrayList<clsproducto> prod) {
for (clsproducto producto : prod){
System.out.println("**************");
System.out.println("id:     " + producto.Id());
System.out.println("nombre:     " + producto.Nombre());
System.out.println("valor:     " + producto.Valor());
System.out.println("unidad:     " + producto.Unidad());
System.out.println("");
}
}
    }