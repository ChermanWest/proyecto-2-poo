public class Procedimiento {
    private String nombre;
    private double costo;

    public Procedimiento(String nombre, double costo){
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public double getCosto(){
        return costo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    @Override
    public String toString(){
        return nombre + "($" + costo + ")";
    }
}
