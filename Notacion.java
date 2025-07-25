import java.time.LocalDate;

/**
 * Representa una anotación médica de un paciente,
 * incluyendo fecha, síntomas, diagnóstico, indicaciones
 * y posible procedimiento.
 */
public class Notacion {
    private LocalDate fecha;
    private String sintomas;
    private String diagnostico;
    private String indicaciones;
    private Procedimiento procedimiento;

    /**
     * Construye una nueva anotación médica.
     *
     * @param sintomas     descripción de los síntomas del paciente
     * @param diagnostico  diagnóstico realizado por el médico
     * @param indicaciones indicaciones o recomendaciones médicas
     * @param procedimiento objeto Procedimiento realizado; null si no hubo procedimiento
     */
    public Notacion(String sintomas,
                    String diagnostico,
                    String indicaciones,
                    Procedimiento procedimiento) {
        this.fecha = LocalDate.now();
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.indicaciones = indicaciones;
        this.procedimiento = procedimiento;
    }

    /**
     * Obtiene la fecha en que se registró la anotación.
     *
     * @return fecha de la anotación
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la descripción de los síntomas.
     *
     * @return cadena con los síntomas
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * Obtiene el diagnóstico realizado.
     *
     * @return cadena con el diagnóstico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Obtiene las indicaciones médicas dadas.
     *
     * @return cadena con las indicaciones
     */
    public String getIndicaciones() {
        return indicaciones;
    }

    /**
     * Obtiene el procedimiento realizado, si existe.
     *
     * @return objeto Procedimiento o null si no hubo ninguno
     */
    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    /**
     * Representa la anotación como texto,
     * incluyendo todos sus campos y el procedimiento.
     *
     * @return String con el detalle completo de la anotación
     */
    @Override
    public String toString() {
        String base = "Fecha: " + fecha +
                      "\nSíntomas: " + sintomas +
                      "\nDiagnóstico: " + diagnostico +
                      "\nIndicaciones: " + indicaciones;
        if (procedimiento != null) {
            base += "\nProcedimiento: " + procedimiento;
        } else {
            base += "\nProcedimiento: Ninguno";
        }
        return base;
    }
}