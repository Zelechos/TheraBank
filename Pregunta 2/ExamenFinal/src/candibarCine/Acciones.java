/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candibarCine;


import sun.reflect.generics.tree.ClassSignature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Zelec
 */
public class Acciones implements IProducto{
    private String CrearProducto, CrearCombo, ConsultarProducto, ConsultarCombos;
    List<String> acciones = new ArrayList<>();

    public String getCrearProducto() {
        return CrearProducto;
    }

    public void setCrearProducto(String crearProducto) {
        CrearProducto = crearProducto;
    }

    public String getCrearCombo() {
        return CrearCombo;
    }

    public void setCrearCombo(String crearCombo) {
        CrearCombo = crearCombo;
    }

    public String getConsultarProducto() {
        return ConsultarProducto;
    }

    public void setConsultarProducto(String consultarProducto) {
        ConsultarProducto = consultarProducto;
    }

    public String getConsultarCombos() {
        return ConsultarCombos;
    }

    public void setConsultarCombos(String consultarCombos) {
        ConsultarCombos = consultarCombos;
    }

    public List<String> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<String> acciones) {
        this.acciones = acciones;
    }

    public Acciones() {
        CrearProducto = "crearProducto";
        CrearCombo = "crearCombo";
        ConsultarProducto = "consultarProducto";
        ConsultarCombos = "consultarCombos";
    }

    @Override
    public void CrearProducto() {
        acciones.add(this.CrearProducto);
    }

    @Override
    public void CrearCombo() {
        acciones.add(this.CrearCombo);
    }

    @Override
    public void ConsultarProducto() {
        acciones.add(this.ConsultarProducto);
    }

    @Override
    public void ConsultarCombos() {
        acciones.add(this.ConsultarCombos);
    }

    public void HistorialAcciones(){
        System.out.println("Lista de Acciones Realizadas");
        int cont = 1;
        for (String accion: acciones){
            System.out.println(cont + ".-" + accion);
            cont++;
        }
        System.out.println("\n");
    }
}

