public class Paciente extends Persona{
    protected String Dirección;
    protected int Telefono;
    protected tipoSeguridad tipoSeguridadSocial;
    protected FichaMedica;

    public Paciente(String rut, String Nombre, String Apellido,Int Edad, String Dirección, int Telefono){
        super(Rut, Nombre, Apellido, Edad);
        this.Dirección = Dirección;
        this.Telefono = Telefono;
        this.tipoSeguridad= tipoSeguridad;
        this.FichaMedica = FichaMedica;
    }


    //SETTER Y GGETTERS


    public String getDirección(){Return Dirección;}

    public int getTelefono(){Return Telefono;}

    public tipoSeguridadSocial getTipoSeguridad(){Return tipoSeguridad;}
    
    public FichaMedica getFichaMedica(){}
}