
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

    @Override
    public 
    }
}