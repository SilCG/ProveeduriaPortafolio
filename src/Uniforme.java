public class Uniforme extends Producto{

    // Atributos
    private String talla;
    private String tipo;

    // Métodos
    // Constructor
    public Uniforme (String codigo, String nombreProducto, double precioProducto, int stock, String talla, String tipo){
        super(codigo, nombreProducto, precioProducto, stock);
        this.talla = talla;
        this.tipo = tipo;
    }

    // Getters
    public String getTalla() {
        return talla;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setTipo(String tipo) {
        if (tipoValido(tipo)) {
            this.tipo = tipo.trim();
        } else {
            System.out.println("Tipo de uniforme no válido: " + tipo);
        }
    }

    public static boolean tipoValido(String tipo) {
        String limpio = tipo.trim();
        return limpio.equalsIgnoreCase("Básico") || limpio.equalsIgnoreCase("Deporte");
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", Talla: " + talla + ", Tipo: " + tipo;
    }
}
