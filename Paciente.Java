public class paciente extends Persona { 
    private String direccion;
    private String telefono;
    private TipoSeguro seguridad;
    private FichaMedica ficha;

    public paciente(String RUT, String nombre, String apellido, int edad,
                    String direccion, String telefono, TipoSeguro seguridad, FichaMedica ficha) {
        super(RUT, nombre, apellido, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.seguridad = seguridad;
        this.ficha = ficha;
    }

    // Getters y setters
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public TipoSeguro getSeguridad() { return seguridad; }
    public void setSeguridad(TipoSeguro seguridad) { this.seguridad = seguridad; }

    public FichaMedica
    getFicha() { return ficha; }
    public void setFicha(FichaMedica ficha) { this.ficha = ficha; }
}