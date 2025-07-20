// Make sure Persona is imported or defined in the same package
public class Medico extends Persona {
    private Especialidad especialidad;

    public Medico(String Nombre, String Rut, Especialidad especialidad) {
        super(Nombre, Rut);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getPrecioConsulta() {
        return especialidad.getPrecioConsulta();
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Precio de consulta: $" + getPrecioConsulta());
    }
}