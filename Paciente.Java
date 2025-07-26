/**
 * Representa un paciente con datos de contacto y ficha médica.
 */
public class Paciente extends Persona {
    private String direccion;
    private String telefono;
    private TipoSeguridadSocial tipoSeguridad;
    private FichaMedica ficha;

    /**
     * Crea un nuevo paciente sin ficha médica inicial.
     *
     * @param rut             RUT del paciente
     * @param nombre          Nombre del paciente
     * @param apellido        Apellido del paciente
     * @param edad            Edad del paciente
     * @param direccion       Dirección del paciente
     * @param telefono        Teléfono de contacto
     * @param tipoSeguridad   Tipo de seguridad social del paciente
     */
    public Paciente(String rut,
                    String nombre,
                    String apellido,
                    int edad,
                    String direccion,
                    String telefono,
                    TipoSeguridadSocial tipoSeguridad) {
        super(rut, nombre, apellido, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoSeguridad = tipoSeguridad;
        this.ficha = null;
    }

    /**
     * Obtiene la dirección del paciente.
     *
     * @return Dirección actual
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el teléfono de contacto del paciente.
     *
     * @return Teléfono actual
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene el tipo de seguridad social del paciente.
     *
     * @return Tipo de seguridad social
     */
    public TipoSeguridadSocial getTipoSeguridad() {
        return tipoSeguridad;
    }

    /**
     * Obtiene la ficha médica del paciente.
     *
     * @return Ficha médica, o null si aún no está asignada
     */
    public FichaMedica getFicha() {
        return ficha;
    }

    /**
     * Actualiza la dirección del paciente.
     *
     * @param direccion Nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Actualiza el teléfono del paciente.
     *
     * @param telefono Nuevo teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Actualiza el tipo de seguridad social del paciente.
     *
     * @param tipoSeguridad Nuevo tipo de seguridad social
     */
    public void setTipoSeguridad(TipoSeguridadSocial tipoSeguridad) {
        this.tipoSeguridad = tipoSeguridad;
    }

    /**
     * Asigna o actualiza la ficha médica del paciente.
     *
     * @param ficha Nueva ficha médica
     */
    public void setFicha(FichaMedica ficha) {
        this.ficha = ficha;
    }

    /**
     * Obtiene el tipo de persona.
     *
     * @return Cadena literal "Paciente"
     */
    @Override
    public String getTipo() {
        return "Paciente";
    }
}
