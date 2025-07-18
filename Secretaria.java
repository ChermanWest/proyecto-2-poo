public class Secretaria extends Persona {
    private String horaLlegada;
    private String horaSalida;

    public Secretaria(String Rut, String Nombre, String Apellido, int Edad, 
                     String horaLlegada, String horaSalida){
        super(Rut, Nombre, Apellido, Edad);
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;

    }
}
