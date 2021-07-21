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
import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        Facade fachada = new Facade();
        while (opcion != 7){
            System.out.println("1 Crear un Produto");
            System.out.println("2 Crear un  Combo");
            System.out.println("3 Consultar los Produtos");
            System.out.println("4 Consultar el Combo");
            System.out.println("5 Vender");
            System.out.println("6 Historial de Opciones");
            System.out.println("7 Salir");

            System.out.print("Opcion: ");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    fachada.CrearProducto();
                    break;
                case 2:
                   fachada.CrearCombo();
                    break;
                case 3:
                    fachada.ConsultarProducto();
                    break;
                case 4:
                    fachada.ConsultarCombos();
                    break;
                case 6:
                    fachada.Acciones();
                    break;
                case 7: break;
            }
        }
    }
}

