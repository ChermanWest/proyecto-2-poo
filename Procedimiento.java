/**
 * Representa un procedimiento médico o servicio con nombre y costo asociados.
 */
public class Procedimiento {
    private String nombre;
    private double costo;

    /**
     * Construye un nuevo procedimiento.
     *
     * @param nombre Nombre del procedimiento
     * @param costo  Costo del procedimiento
     */
    public Procedimiento(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    /**
     * Obtiene el nombre del procedimiento.
     *
     * @return Nombre del procedimiento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el costo del procedimiento.
     *
     * @return Costo del procedimiento
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Actualiza el nombre del procedimiento.
     *
     * @param nombre Nuevo nombre del procedimiento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza el costo del procedimiento.
     *
     * @param costo Nuevo costo del procedimiento
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Representa el procedimiento como texto en formato "nombre($costo)".
     *
     * @return Cadena con nombre y costo formateados
     */
    @Override
    public String toString() {
        return nombre + "($" + costo + ")";
    }
}