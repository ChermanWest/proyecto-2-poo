import java.time.LocalDate;

public class Notacion {
    private LocalDate fecha;
    private String sintomas;
    private String diagnostico;
    private String indicaciones;
    private Procedimiento procedimiento; // puede ser null

    public Notacion(String sintomas, String diagnostico, String indicaciones, Procedimiento procedimiento) {
        this.fecha = LocalDate.now(); // fecha automática del sistema
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.indicaciones = indicaciones;
        this.procedimiento = procedimiento; // puede ser null si no se hizo ninguno
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha +
               "\nSíntomas: " + sintomas +
               "\nDiagnóstico: " + diagnostico +
               "\nIndicaciones: " + indicaciones +
               ((procedimiento != null) ? "\nProcedimiento: " + procedimiento : "\nProcedimiento: Ninguno");
    }
}
