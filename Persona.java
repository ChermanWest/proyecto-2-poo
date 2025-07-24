public abstract class Persona {
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    //GETTERS Y SETTERS
    

    public abstract String getTipo();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }
}
