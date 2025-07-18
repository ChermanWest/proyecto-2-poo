public class Main {
    public static void main(String[] args) {
        Medico m = new Medico("11.111.111-1", "Carlos", "Pérez", 40, Especialidad.GENERAL);
        Secretaria s = new Secretaria("22.222.222-2", "Ana", "López", 35, "08:00", "17:00");

        System.out.println(m.getTipo() + ": " + m.getNombre());
        System.out.println(s.getTipo() + ": " + s.getNombre());
    }
}

enum Especialidad {
    GENERAL, PEDIATRIA, DERMATOLOGIA, TRAUMATOLOGIA, OTROS
}

enum TipoSeguridadSocial {
    FONASA, ISAPRE
}

abstract class Persona {
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

    public abstract String getTipo();

    public String getNombre() {
        return nombre;
    }
}

class Medico extends Persona {
    private Especialidad especialidad;

    public Medico(String rut, String nombre, String apellido, int edad, Especialidad especialidad) {
        super(rut, nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    @Override
    public String getTipo() {
        return "Medico";
    }
}

class Secretaria extends Persona {
    private String horaLlegada;
    private String horaSalida;

    public Secretaria(String rut, String nombre, String apellido, int edad, String horaLlegada, String horaSalida) {
        super(rut, nombre, apellido, edad);
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
    }

    @Override
    public String getTipo() {
        return "Secretaria";
    }
}
