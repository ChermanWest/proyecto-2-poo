public abstract class Persona{
    protected String Rut;
    protected String Nombre;
    protected String Apellido;
    protected Int Edad;


    public Persona(String Rut, String Nombre, String Apellido, Int Edad){
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    //GETTERS Y SETERS

    public String getRut() {Return Rut;}
    public void setRut(String Rut){this.Rut = Rut;}

    public String getNombre() {Return Nombre;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}

    public String getApellido() {Return Apellido;}
    public void setApellido(String Apellido){this.Apellido = Apellido;}
    
    public int getEdad() {Return Edad;}
    public void setEdad(String Edad){this.Edad = Edad;}
     
    public abstract getTipo();
}