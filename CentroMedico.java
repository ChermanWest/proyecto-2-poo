import java.util.ArrayList;

/**
 * Representa un centro médico con médicos, pacientes y secretarias.
 */
public class CentroMedico {
    private String nombre;
    private String rut;
    private String razonSocial;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Secretaria> secretarias;

    /**
     * Crea un nuevo centro médico.
     * @param nombre Nombre del centro.
     * @param rut Rut del centro.
     * @param razonSocial Razón social del centro.
     */
    public CentroMedico(String nombre, String rut, String razonSocial){
        this.nombre = nombre;
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.secretarias = new ArrayList<>();
    }

    /**
     * Agrega un médico al centro.
     * @param medico Médico a agregar.
     */
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }

    /**
     * Agrega un paciente al centro.
     * @param paciente Paciente a agregar.
     */
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    /**
     * Agrega una secretaria al centro.
     * @param secretaria Secretaria a agregar.
     */
    public void agregarSecretaria(Secretaria secretaria){
        secretarias.add(secretaria);
    }

    /**
     * Busca un paciente por rut.
     * @param rut Rut del paciente.
     * @return Paciente encontrado o null si no existe.
     */
    public Paciente buscarPacientePorRut(String rut){
        for (Paciente p : pacientes) {
            if(p.getRut().equalsIgnoreCase(rut)){
                return p;
            }
        }
        return null;
    }

    /**
     * Modifica los datos de un paciente.
     * @param rut Rut del paciente.
     * @param nuevaDireccion Dirección nueva.
     * @param nuevoTelefono Teléfono nuevo.
     * @param nuevaSeguridad Tipo de seguridad social nueva.
     * @return true si el paciente fue modificado, false si no fue encontrado.
     */
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

    /**
     * Obtiene el nombre del centro.
     * @return Nombre del centro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el rut del centro.
     * @return Rut del centro.
     */
    public String getRut(){
        return rut;
    }

    /**
     * Obtiene la razón social del centro.
     * @return Razón social del centro.
     */
    public String getRazonSocial(){
        return razonSocial;
    }

    /**
     * Obtiene la lista de médicos.
     * @return Lista de médicos.
     */
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    /**
     * Obtiene la lista de pacientes.
     * @return Lista de pacientes.
     */
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }

    /**
     * Obtiene la lista de secretarias.
     * @return Lista de secretarias.
     */
    public ArrayList<Secretaria> getSecretarias(){
        return secretarias;
    }
}