public class LibroEjercicios extends Libro {

    // Atributos
    protected String materia;

    // Métodos
    // Constructor
    public LibroEjercicios (String codigo, String nombreProducto, double precioProducto, int stock, String idioma, String materia){
        super(codigo, nombreProducto, precioProducto, stock, idioma);
        this.materia = materia;
    }

    // Getters
    public String getMateria() {
        return materia;
    }

    // Setters
    public void setMateria(String materia) {
        this.materia = materia;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", Materia: " + materia;
    }
}
