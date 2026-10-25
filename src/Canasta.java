import java.util.ArrayList;

public class Canasta {

    // Atributos
    private ArrayList <Producto> productos;

    // Métodos
    // Constructor
    public Canasta () { // La canasta tiene que nacer vacía
        this.productos = new ArrayList<>();
    }

    // Getters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Setters - No tiene porque sino se podría reemplazar desde afuera y no se quiere eso

    // Relación agregación - Los productos ya existen antes de ser agregados a la canasta
    public void agregarProducto (Producto producto){
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto){
        this.productos.remove(producto);
    }

    // Suma total de canasta
    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos){ // para cada producto de la lista - Suma el precio en total.
            total += producto.getPrecioProducto();
        }
        return total;
    }

    // toString()
    @Override
    public String toString(){
        String resultado = "Canasta";
        for (Producto producto : productos){
            resultado += "\n- " + producto.getNombreProducto() + " (₡" + producto.getPrecioProducto() + ")";
        }
        return resultado + "\nTotal: ₡" + calcularTotal();
    }

}
