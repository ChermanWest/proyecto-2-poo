import java.util.ArrayList;

public class FichaMedica {
    private ArrayList<Notacion> notaciones;

    public FichaMedica() {
        this.notaciones = new ArrayList<>();
    }

    // Agrega una nueva notación a la ficha
    public void agregarNotacion(Notacion notacion) {
        notaciones.add(notacion);
    }

    // Devuelve la lista completa de notaciones
    public ArrayList<Notacion> getNotaciones() {
        return notaciones;
    }

    // Muestra por consola el historial médico
    public void mostrarHistorial() {
        if (notaciones.isEmpty()) {
            System.out.println("⚠️ No hay notaciones registradas en esta ficha.");
        } else {
            System.out.println("=== Historial Médico ===");
            for (Notacion n : notaciones) {
                System.out.println("\n--- Notación ---");
                System.out.println(n);
            }
        }
    }

    // Calcula el total de los costos de procedimientos realizados
    public double calcularTotalProcedimientos() {
        double total = 0;
        for (Notacion n : notaciones) {
            if (n.getProcedimiento() != null) {
                total += n.getProcedimiento().getCosto();
            }
        }
        return total;
    }
}
