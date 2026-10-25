public class Libro extends Producto{

    // Atributos
    protected String idioma;

    // Métodos
    // Constructor
    public Libro (String codigo, String nombreProducto, double precioProducto, int stock, String idioma){
        super(codigo, nombreProducto, precioProducto, stock);
        this.idioma = idioma;
    }

    // Getters
    public String getIdioma() {
        return idioma;
    }

    // Setters
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Idioma: " + idioma;
    }

}
