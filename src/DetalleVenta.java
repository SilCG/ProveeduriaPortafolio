public class DetalleVenta {

    // Atributos
    private Producto producto; // objeto Producto
    private int cantidad;
    private double subtotal;

    // Métodos
    // Constructor
    public DetalleVenta (Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecioProducto() * cantidad;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Setters (recalcula subtotal para que no se quede desactualizado)
    public void setProducto(Producto producto) {
        this.producto = producto;
        this.subtotal = producto.getPrecioProducto() * cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecioProducto() * cantidad;
    }

    // equals () - Producto y Cantidad
    public boolean equals (DetalleVenta detalle){
        return this.producto.equals(detalle.producto) && this.cantidad == detalle.cantidad;
    }

    // toString()
    @Override
    public String toString(){
        return cantidad + " X " + producto.getNombreProducto() + " = ₡" + subtotal;
    }

}
