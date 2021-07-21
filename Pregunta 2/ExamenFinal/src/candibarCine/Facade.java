/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candibarCine;

/**
 *
 * @author Zelec
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade implements IProducto{
    private ProductoSimple pipocaPequeña;
    private ProductoSimple pipocaMediana;
    private ProductoSimple pipocaGrande;
    private ProductoSimple sodaPequeña;
    private ProductoSimple sodaMediana;
    private ProductoSimple sodaGrande;
    private List<ProductoSimple> productoSimple = new ArrayList<>();
    private List<ProductoCompuesto> productoCompuestos = new ArrayList<>();
    Acciones acciones = new Acciones();

    public void CrearProducto(){
        Scanner input = new Scanner(System.in);
        String nombre;
        input.nextLine();
        Double precio;
        System.out.println("Crear Producto");
        System.out.print("Nombre Producto: ");
        nombre = input.nextLine();
        System.out.print("Precio Producto: ");
        precio = input.nextDouble();
        if (nombre.equals("Pipoca Pequeña")){
            pipocaPequeña = new ProductoSimple(nombre, precio);
            productoSimple.add(pipocaPequeña);
        }
        if (nombre.equals("Pipoca Mediana")){
            pipocaMediana = new ProductoSimple(nombre, precio);
            productoSimple.add(pipocaMediana);
        }
        if(nombre.equals("Pipoca Grande")){
            pipocaGrande = new ProductoSimple(nombre, precio);
            productoSimple.add(pipocaGrande);
        }
        if(nombre.equals("Soda Pequeña")){
            sodaPequeña = new ProductoSimple(nombre, precio);
            productoSimple.add(sodaPequeña);
        }
        if (nombre.equals("Soda Mediana")){
            sodaMediana = new ProductoSimple(nombre, precio);
            productoSimple.add(sodaMediana);
        }
        if(nombre.equals("Soda Grande")){
            sodaGrande = new ProductoSimple(nombre, precio);
            productoSimple.add(sodaGrande);
        }
        System.out.println("....Se creo el Producto");
        acciones.CrearProducto();
        System.out.println("\n");
    }

    public void CrearCombo(){
        Scanner input = new Scanner(System.in);
        String nombreCombo;
        System.out.println("Crear Combo");
        System.out.print("Nombre Combo: ");
        nombreCombo = input.nextLine();

        if (nombreCombo.equals("Combo 1")){
            ProductoCompuesto combo1 = new ProductoCompuesto(nombreCombo);
            combo1.addProducto(pipocaPequeña);
            combo1.addProducto(pipocaPequeña);
            combo1.addProducto(sodaMediana);
            combo1.addProducto(sodaMediana);
            productoCompuestos.add(combo1);
        }
        if(nombreCombo.equals("Combo 2")){
            ProductoCompuesto combo2 = new ProductoCompuesto(nombreCombo);
            combo2.addProducto(pipocaMediana);
            combo2.addProducto(sodaMediana);
            productoCompuestos.add(combo2);
        }
        if (nombreCombo.equals("Combo 3")){
            ProductoCompuesto combo3 = new ProductoCompuesto(nombreCombo);
            combo3.addProducto(pipocaGrande);
            combo3.addProducto(pipocaGrande);
            combo3.addProducto(sodaMediana);
            combo3.addProducto(sodaMediana);
            productoCompuestos.add(combo3);
        }
        System.out.println("...Se creo el Combo");
        acciones.CrearCombo();
        System.out.println("\n");
    }

    public void ConsultarProducto(){

            int cont = 1;
            System.out.println("....PRODUCTOS ALMACENADOS....");
            for (ProductoSimple producto: productoSimple){
                System.out.println(cont + ".-" + producto.getNombre());
                cont++;
            }
            System.out.println("\n");
            acciones.ConsultarProducto();


    }

    public void ConsultarCombos(){
        int cont = 1;
        System.out.println("....COMBOS ALMACENADOS....");
        for (ProductoCompuesto combo: productoCompuestos){
            System.out.println(cont + ".-" + combo.getNombre());
            cont++;
        }
        System.out.println("\n");
        acciones.ConsultarCombos();
    }

    public void Acciones(){
        acciones.HistorialAcciones();
    }
}
