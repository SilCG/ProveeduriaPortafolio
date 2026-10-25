import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // 1. Productos (herencia: Producto -> Uniforme / Libro -> LibroLectura / LibroEjercicios)
        Producto producto = new Producto("P01", "Lapicero", 500, 50);
        Uniforme uniforme = new Uniforme("U01", "Camisa", 8000, 20, "M", "Básico");
        Libro libro = new Libro("L01", "Diccionario", 12000, 8, "Español");
        LibroLectura libroLectura = new LibroLectura("L02", "El Principito", 5000, 3, "Español", "Fábula");
        LibroEjercicios libroEjercicios = new LibroEjercicios("L03", "Matemática 5", 9000, 15, "Español", "Matemática");

        // 2. Cliente
        Cliente cliente = new Cliente("Ana Mora Rojas", "112345678", "ana@correo.com", "Padre de familia");
        System.out.println(cliente);

        // Validación de tipo de cliente
        System.out.println("¿'Vecino' es válido? " + Cliente.tipoValido("Vecino"));
        System.out.println("¿' profesor ' es válido? " + Cliente.tipoValido(" profesor "));

        // 3. Inventario (agregación: los productos existen por sí solos)
        Inventario inventario = new Inventario();
        inventario.agregarProducto(producto);
        inventario.agregarProducto(uniforme);
        inventario.agregarProducto(libro);
        inventario.agregarProducto(libroLectura);
        inventario.agregarProducto(libroEjercicios);
        System.out.println("\n" + inventario);

        // Entrada de mercadería y stock bajo
        inventario.registrarEntrada("L02", 10);
        inventario.listarStockBajo();

        // 4. Canasta (agregación)
        Canasta canasta = new Canasta();
        canasta.agregarProducto(uniforme);
        canasta.agregarProducto(libroLectura);
        System.out.println("\n" + canasta);

        // 5. Dependencia: el cliente recibe la canasta como parámetro
        cliente.comprar(canasta);

        // 6. Venta y DetalleVenta (composición: la venta crea sus detalles)
        Venta venta = new Venta(LocalDateTime.now(), cliente);
        venta.agregarDetalle(uniforme, 2);
        venta.agregarDetalle(libroLectura, 1);
        System.out.println("\n" + venta);

        // 7. Descontar stock (encapsulamiento: solo se cambia con métodos controlados)
        inventario.descontarStock(uniforme, 2);
        inventario.descontarStock(libroLectura, 1);
        inventario.descontarStock(uniforme, 500);   // rechazado: no hay suficiente

        // 8. Estado final
        System.out.println("\n" + inventario);

        // 9. DetalleVenta y equals
        DetalleVenta detalle = venta.getDetalles().get(0);
        System.out.println("\nDetalle: " + detalle);
        System.out.println("¿Mismo producto (por código)? " + uniforme.equals(uniforme));
    }
}