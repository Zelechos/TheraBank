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

public class ProductoCompuesto extends ProductoAbstracto{
    private List<ProductoAbstracto> productos = new ArrayList<>();
    public ProductoCompuesto(String nombre) {
        super(nombre, 0);
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (ProductoAbstracto hijo: productos) {
            precio += hijo.getPrecio();
        }
        return precio;
    }

    public void addProducto(ProductoAbstracto producto) {
        this.productos.add(producto);
    }

    public boolean removeProduct(ProductoAbstracto producto) {
        return this.productos.remove(producto);
    }

}

