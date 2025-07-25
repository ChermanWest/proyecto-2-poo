import java.util.ArrayList;

/**
 * Representa una ficha médica que contiene notaciones de procedimientos.
 */
public class FichaMedica {
    private ArrayList<Notacion> notaciones;

    /**
     * Crea una nueva ficha médica vacía.
     */
    public FichaMedica() {
        this.notaciones = new ArrayList<>();
    }

    /**
     * Agrega una nueva notación a la ficha.
     * @param notacion Notación a agregar.
     */
    public void agregarNotacion(Notacion notacion) {
        notaciones.add(notacion);
    }

    /**
     * Devuelve la lista completa de notaciones.
     * @return Lista de notaciones.
     */
    public ArrayList<Notacion> getNotaciones() {
        return notaciones;
    }

    /**
     * Muestra el historial médico por consola.
     */
    public void mostrarHistorial() {
        if (notaciones.isEmpty()) {
            System.out.println(" No hay notaciones registradas en esta ficha.");
        } else {
            System.out.println("=== Historial Médico ===");
            for (Notacion n : notaciones) {
                System.out.println("\n--- Notación ---");
                System.out.println(n);
            }
        }
    }

    /**
     * Calcula el total de los costos de procedimientos realizados.
     * @return Total de costos.
     */
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