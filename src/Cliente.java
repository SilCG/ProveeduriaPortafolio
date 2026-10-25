public class Cliente {

    // Atributos
    private String nombreCompleto;
    private String cedula;
    private String correoElectronico;
    private String tipoCliente;

    // Métodos
    // Constructor
    public Cliente (String nombreCompleto, String cedula, String correoElectronico, String tipoCliente){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.tipoCliente = tipoCliente.trim();
    }

    // Validacion
    public static boolean tipoValido(String tipoCliente){
        String limpio = tipoCliente.trim();
        return limpio.equalsIgnoreCase("Estudiante") || limpio.equalsIgnoreCase("Padre de familia") || limpio.equalsIgnoreCase("Profesor") || limpio.equalsIgnoreCase("Administrativo");
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setTipoCliente(String tipoCliente){
        if (tipoValido(tipoCliente)) {
            this.tipoCliente = tipoCliente.trim();
        } else {
                System.out.println("Tipo de cliente inválido " + tipoCliente);
        }
    }

    // Dependencia - Reciba la canasta como parametro pero no se guarda
    public void comprar(Canasta canasta){
        System.out.println(nombreCompleto + " (" + tipoCliente + ") compra:");
        System.out.println(canasta);
    }

    // equals() por cédula
    public boolean equals(Cliente cliente) {
        return this.cedula.equals(cliente.cedula);
    }

    // toString()
    @Override
    public String toString() {
        return "\nCliente: " + nombreCompleto + ", Cédula: " + cedula
                + ", Correo: " + correoElectronico + ", Tipo: " + tipoCliente;
    }

}

