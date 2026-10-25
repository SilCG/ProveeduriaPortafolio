import java.util.ArrayList;

public class Inventario {

    // Atributos
    private ArrayList <Producto> productos; // agregación: los productos existen por sí solos
    private final int STOCK_MINIMO = 10; // constante: bajo este número se considera stock bajo

    // Métodos
    // Constructor
    public Inventario () {
        this.productos = new ArrayList<>();
    }

    // Getters
    public ArrayList <Producto> getProductos() {
        return productos;
    }

    public int getStockMinimo() {
        return STOCK_MINIMO;
    }

    // Relación agregación - Agrega nuevo producto en Inventario
    public void agregarProducto (Producto producto){
        this.productos.add(producto);
    }

    // Buscar un producto por su código; devuelve null si no existe
    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }


    // Entrada de mercadería: aumenta el stock de un producto existente
        public void registrarEntrada(String codigo, int cantidad) {
            Producto producto = buscarProducto(codigo);
            if (producto != null) {
                producto.aumentarStock(cantidad);
                System.out.println("Entrada registrada: " + producto.getNombreProducto() + " +" + cantidad);
            } else {
                System.out.println("No existe un producto con el código " + codigo);
            }
        }

    // Salida por venta: descuenta stock solo si alcanza (dependencia: recibe el producto como parámetro)
        public boolean descontarStock(Producto producto, int cantidad) {
            if (producto.reducirStock(cantidad)) {
                System.out.println("Stock descontado: " + producto.getNombreProducto() + " -" + cantidad);
                return true;
            }
            System.out.println("Stock insuficiente de " + producto.getNombreProducto());
            return false;
        }


    // Muestra los productos con stock por debajo del mínimo
        public void listarStockBajo() {
            System.out.println("Productos con stock bajo (menos de " + STOCK_MINIMO + "):");
            for (Producto producto : productos) {
                if (producto.getStock() < STOCK_MINIMO) {
                    System.out.println("- " + producto.getNombreProducto() + ": " + producto.getStock());
                }
            }
        }

    // toString()
        @Override
        public String toString() {
           String resultado = "Inventario:";
            for (Producto producto : productos) {
                resultado += "\n- " + producto.getNombreProducto() + " (stock: " + producto.getStock() + ")";
            }
            return resultado;
        }

}


