/**
 * Representa un médico con su especialidad.
 */
public class Medico extends Persona {
    private Especialidad especialidad;

    /**
     * Crea un nuevo médico.
     *
     * @param rut          RUT del médico
     * @param nombre       Nombre del médico
     * @param apellido     Apellido del médico
     * @param edad         Edad del médico
     * @param especialidad Especialidad del médico
     */
    public Medico(String rut,
                  String nombre,
                  String apellido,
                  int edad,
                  Especialidad especialidad) {
        super(rut, nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del médico.
     *
     * @return Especialidad del médico
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Define o actualiza la especialidad del médico.
     *
     * @param especialidad Nueva especialidad
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Actualiza el nombre del médico.
     *
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el apellido del médico.
     *
     * @param apellido Nuevo apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Actualiza la edad del médico.
     *
     * @param edad Nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el tipo de persona.
     *
     * @return Cadena literal "Médico"
     */
    @Override
    public String getTipo() {
        return "Médico";
    }
}