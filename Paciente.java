public class Paciente extends Persona {
    private String direccion;
    private String telefono;
    private TipoSeguridadSocial tipoSeguridad;
    private FichaMedica ficha;

    public Paciente(String rut, String nombre, String apellido, int edad,
                    String direccion, String telefono, TipoSeguridadSocial tipoSeguridad) {
        super(rut, nombre, apellido, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoSeguridad = tipoSeguridad;
        this.ficha = null;
    }
 // metodos  Getters
    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public TipoSeguridadSocial getTipoSeguridad() {
        return tipoSeguridad;
    }

    public FichaMedica getFicha() {
        return ficha;
    }

    // metodos Setters
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoSeguridad(TipoSeguridadSocial tipoSeguridad) {
        this.tipoSeguridad = tipoSeguridad;
    }

    public void setFicha(FichaMedica ficha) {
        this.ficha = ficha;
    }

    @Override
    public String getTipo() {
        return "Paciente";
    }
}
    

