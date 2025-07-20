// Make sure Persona is imported or defined in the same package
public class Medico extends Persona {
    private TipoEspecialidad especialidad;

    public Medico(String Nombre, String Rut, TipoEspecialidad especialidad) {
        super(Nombre, Rut);
        this.especialidad = especialidad;
    }

    public TipoEspecialidad getEspecialidad() {
        return especialidad;
    }

    public int getPrecioConsulta() {
        return especialidad.getPrecioConsulta();
    }
    public void setEspecialidad(TipoEspecialidad especialidad) {
        this.especialidad = especialidad;
    }
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Precio de consulta: $" + getPrecioConsulta());
    }
}