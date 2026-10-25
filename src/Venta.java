import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

    // Atributos
    private LocalDateTime fecha;
    private Cliente cliente; // // asociación - la venta conoce a su cliente
    private ArrayList <DetalleVenta> detalles; // composición - los detalles nacen dentro de la venta

    // Métodos
    // Constructor
    public Venta (LocalDateTime fecha, Cliente cliente){
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();

    }

    // Getters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    // Setters
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Relación (Composición): La venta construye sus propios detalles.
    public void agregarDetalle(Producto producto, int cantidad){
        DetalleVenta detalle = new DetalleVenta(producto, cantidad);
        this.detalles.add(detalle);
    }

    // Suma Totates de todos los detalles
    public double calcularTotal(){
        double total = 0;
        for (DetalleVenta detalle : detalles){
            total += detalle.getSubtotal();
        }
        return total;
    }

    // toString()
    @Override
    public String toString() {
        String resultado = "Fecha de venta " + fecha + "\nCliente: " + cliente.getNombreCompleto();
        for (DetalleVenta detalle : detalles) {
            resultado += "\n- " + detalle;
        }
        return resultado + "\nTotal: ₡" + calcularTotal();
    }


}
