/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06.g.pkg8;

import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas
 *
 * @author Usuario
 */
public class Ejercicio06G8 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("                            ###  #  ### #  #  ##    #                       ");
        System.out.println("                             #   #  ##  ## #  # #  ###                       ");
        System.out.println("                             #   #  ### # ##  ##  #   #                     ");
        System.out.println("                                                                            ");
        System.out.println("                         elija una opcion                                                                  ");
        System.out.println("                         1-introducir producto                                                             ");
        System.out.println("                         2-modificar precio de producto                                                    ");
        System.out.println("                         3-eliminar producto                                                               ");
        System.out.println("                         4-mostrar productos con precio                                                    ");
        System.out.println("                                                                                                           ");
        System.out.println(" //////////////////////////////////////////////////                                                                           ");
        int opcion = leer.nextInt();
        System.out.println("///////////////////////////////////////////////////                                                         ");

        switch (opcion) {

            case 1: 
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                
                break;
                
                
                
                

        }

    }

}
