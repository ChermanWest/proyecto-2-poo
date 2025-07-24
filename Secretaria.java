public class Secretaria extends Persona {

    public Secretaria(String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
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
        return "Secretaria";
    }
}
