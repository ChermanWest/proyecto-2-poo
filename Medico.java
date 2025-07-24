public class Medico extends Persona {
    private Especialidad especialidad;

    public Medico(String rut, String nombre, String apellido, int edad, Especialidad especialidad) {
        super(rut, nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getTipo() {
        return "Médico";
    }
}
