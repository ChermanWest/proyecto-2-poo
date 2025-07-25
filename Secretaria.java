/**
 * Representa una secretaria, especialización de la clase Persona.
 * Hereda los atributos rut, nombre, apellido y edad, y define el tipo de persona.
 */
public class Secretaria extends Persona {
    public Secretaria(String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
    }

    /**
     * Actualiza el nombre de la secretaria.
     *
     * @param nombre Nuevo nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el apellido de la secretaria.
     *
     * @param apellido Nuevo apellido a asignar
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Actualiza la edad de la secretaria.
     *
     * @param edad Nueva edad a asignar (en años)
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el tipo de persona que representa esta clase.
     *
     * @return Cadena "Secretaria"
     */
    @Override
    public String getTipo() {
        return "Secretaria";
    }
}