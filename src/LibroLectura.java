public class LibroLectura extends Libro{

    // Atributos
    protected String genero;

    // Métodos
    // Constructor
    public LibroLectura (String codigo, String nombreProducto, double precioProducto, int stock, String idioma, String genero){
        super(codigo, nombreProducto, precioProducto, stock, idioma);
        this.genero = genero;
    }

    // Getters
    public String getGenero() {
        return genero;
    }

    // Setters
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", Género: " + genero;
    }
}
