/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario
 * @author Usuario
 */
public class ServicePais {
    
    private Scanner leer;
    
    private TreeSet <Pais>paises;

    public ServicePais() {
        leer=new Scanner(System.in).useDelimiter("\n");
        paises=new TreeSet();
    }
    
    
    
    public void crearPais(){
       
       String respuesta;
       do{
           
                      
       System.out.println("          ingrese el nombre del pais ");
       String nombreIngresado=leer.next();
       nombreIngresado=nombreIngresado.toUpperCase();
       
             
       paises.add(new Pais(nombreIngresado));
        
           System.out.println("         desea ingresar otro pais? s/n");
           respuesta=leer.next();
           if(respuesta.equalsIgnoreCase("n")){
              mostrarPais();
               break;
               
           }      
       
       }while(true);
   }
    public void mostrarPais(){
        
        for (Pais aux : paises) {
            
            System.out.println(aux);
            
        }
        
        
        
    }
    public void crearAuto(){
     
       
       paises.add(new Pais("argentina"));
       paises.add(new Pais("francia"));
       paises.add(new Pais("alemania"));
       paises.add(new Pais("ghana"));
       paises.add(new Pais("chile"));
       paises.add(new Pais("bolivia"));
       
      mostrarPais();
            
   }
    
    public void buscarPais(){
        
        System.out.println("ingrese el pais a buscar");
        String buscar=leer.next();
        
        
        Iterator<Pais>it=paises.iterator();
        
        while(it.hasNext()){
            if(it.next().getNombre().equals(buscar)){
                it.remove();
                mostrarPais();
               break;             
            }
            if(it.hasNext()==false){
            System.out.println("no se encontro ningun pais ");
            
            }
        }
        
        
        
        
    }
   
}
