/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class RazasService {

    private Scanner leer;

    private ArrayList<String> raza;

    public RazasService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.raza = new ArrayList();
    }

    public void menuRaza() {
        String respuesta;
        do {
            ingresarRaza();

            System.out.println("desea ingresar otra raza?");
            respuesta = leer.next();
            if (respuesta.equals("n")) {
                mostrarRaza();
            }

        } while (respuesta.equals("s"));
    }

    public void ingresarRaza() {

        System.out.println("ingrese la raza del perro");
        String razaNombre = leer.next();

        raza.add(razaNombre);

    }

    public void mostrarRaza() {
        System.out.println("las razas actuales ingresadas son: ");
        for (String aux : raza) {
            System.out.println(aux);
        }
        System.out.println("su cantidad es de " + raza.size());

    }

    public void eliminarRaza() {

        System.out.println("ingrese la raza que desea eliminar");
        String eliminar = leer.next();
        Iterator<String> it = raza.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(eliminar)) {
                it.remove();
               
            } else {
                System.out.println("la raza ingresada no se encuentra en la lista");
             
            }
            mostrarRaza();
        }

    }

}
