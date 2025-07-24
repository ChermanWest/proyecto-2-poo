
import java.util.ArrayList;

public class CentroMedico {
    private String nombre;
    private String rut;
    private String razonSocial;
    private ArrayList <Medico> medicos;
    private ArrayList <Paciente>pacientes;
    private ArrayList <Secretaria>secretarias;

    public CentroMedico(String nombre, String rut, String razonSocial){
        this.nombre = nombre;
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.secretarias = new ArrayList<>();
    }

    //Metodos para agregar personal y pacientes

    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public void agregarSecretaria(Secretaria secretaria){
        secretarias.add(secretaria);
    }

    

    //metodo para buscar pacientes por su rut
    public Paciente buscarPacientePorRut(String rut){
        for (Paciente p : pacientes) {
            if(p.getRut().equalsIgnoreCase(rut)){
                return p;
            }
        }
        return null;
    }

    //metodo para modificar pacientes
    
     public boolean modificarPaciente(String rut, String nuevaDireccion, String nuevoTelefono, TipoSeguridadSocial nuevaSeguridad) {
        Paciente paciente = buscarPacientePorRut(rut);
        if (paciente != null) {
            paciente.setDireccion(nuevaDireccion);
            paciente.setTelefono(nuevoTelefono);
            paciente.setTipoSeguridad(nuevaSeguridad);
            return true;
        }
        return false;
    }

    //METODOS GETTERSS

    public String getNombre() {
        return nombre;
    }

    public String getRut(){
        return rut;
    }

    public String getRazonSocial(){
        return razonSocial;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public ArrayList<Paciente>getPacientes(){
        return pacientes;
    }

    public ArrayList<Secretaria> getSecretarias(){
        return secretarias;
    }

    

                
}

