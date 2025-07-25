/**
 * Clase abstracta que representa una persona con datos básicos.
 */
public abstract class Persona {
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected int edad;

    /**
     * Construye una nueva instancia de Persona.
     *
     * @param rut      RUT o identificador único de la persona
     * @param nombre   Nombre de la persona
     * @param apellido Apellido de la persona
     * @param edad     Edad de la persona en años
     */
    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * Obtiene el tipo específico de persona.
     *
     * @return Cadena que describe el tipo de persona (p. ej., "Médico", "Paciente")
     */
    public abstract String getTipo();

    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return Apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el RUT o identificador de la persona.
     *
     * @return RUT de la persona
     */
    public String getRut() {
        return rut;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return Edad en años
     */
    public int getEdad() {
        return edad;
    }
}