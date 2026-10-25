public class Producto {

    // Atributos
    protected String codigo;
    protected String nombreProducto;
    protected double precioProducto;
    protected int stock;

    // Métodos
    // Constructor
    public Producto (String codigo, String nombreProducto, double precioProducto, int stock){
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stock = stock;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecioProducto(){
        return precioProducto;
    }

    public int getStock() {
        return stock;
    }

    // Setters (no hay necesidad de agregar un setStock ya que el codigo indetifica al producto)
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    // Entrada mercadería
    public void aumentarStock(int cantidad){
        if (cantidad > 0)
            stock += cantidad;
    }

    // Devuelve true si había suficiente stock y se descontó
    public boolean reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    // equals(): dos productos son iguales si tienen el mismo código
    public boolean equals(Producto producto) {
        return this.codigo.equals(producto.codigo);
    }

    // toString()
    @Override
    public String toString() {
        return "Código: " + codigo + ", Producto: " + nombreProducto
                + ", Precio: ₡" + precioProducto + ", Stock: " + stock;
    }




}
